package com.example.utilities;

/*
 * @author Bryan Bataluna
 * @edited-by Sam Ong
 * 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.constants.QueryStatement;
import com.example.db.ConnectionFactory;
import com.example.model.Student;

public class DBUtil {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet = null;
	private static List<Student> studentList = new ArrayList<Student>();

	public static void addStudent(Student student) throws SQLException {
		connection = ConnectionFactory.getConnection();
		preparedStatement = connection.prepareStatement(QueryStatement.ADD_STUDENT_QUERY);

		setPreparedStatementProperties(student.getId(), 
									   student.getName(),
									   student.getAddress(), 
									   student.getGender(), 
									   student.getAge());
		preparedStatement.executeUpdate();

		closeConnections();
	}

	public static void updateStudent(Student student) throws SQLException {
		connection = ConnectionFactory.getConnection();
		preparedStatement = connection.prepareStatement(QueryStatement.UPDATE_STUDENT_QUERY);

		setPreparedStatementProperties(student.getId(), 
									   student.getName(),
									   student.getAddress(), 
									   student.getGender(), 
									   student.getAge(),
									   student.getIncid());
		preparedStatement.executeUpdate();

		closeConnections();
	}

	public static void deleteStudent(Student student) throws SQLException {
		connection = ConnectionFactory.getConnection();
		preparedStatement = connection.prepareStatement(QueryStatement.DELETE_STUDENT_QUERY);

		setPreparedStatementProperties(student.getIncid());
		preparedStatement.executeUpdate();

		closeConnections();
	}

	public static List<Student> getAllStudents() throws SQLException {
		connection = ConnectionFactory.getConnection();
		preparedStatement = connection.prepareStatement(QueryStatement.SELECT_ALL_STUDENTS_QUERY);
		
		resultSet = preparedStatement.executeQuery();
		
		studentList.clear();
		
		while (resultSet.next()) {
			Student student = new Student();
				student.setIncid(resultSet.getString(1));
				student.setId(resultSet.getString(2));
				student.setName(resultSet.getString(3));
				student.setAddress(resultSet.getString(4));
				student.setGender(resultSet.getString(5));
				student.setAge(resultSet.getString(6));
			studentList.add(student);
		}

		return studentList;
	}

	private static void closeConnections() throws SQLException {
		if (resultSet != null) {
			resultSet.close();
		}
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (connection != null) {
			connection.close();
		}
	}

	// @param variable length array of strings as student properties
	private static void setPreparedStatementProperties(String... strArgs) throws SQLException {
		for (int i = 0; i < strArgs.length; i++) {
			preparedStatement.setString(i + 1, strArgs[i]);
		}
	}
}