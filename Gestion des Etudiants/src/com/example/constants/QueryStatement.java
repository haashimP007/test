package com.example.constants;

/*
 * @author Sam Ong
 * 
 */

public class QueryStatement {
	
	public final static String ADD_STUDENT_QUERY = "INSERT INTO student(id,name,address,gender,age) VALUES(?,?,?,?,?)";
	public final static String UPDATE_STUDENT_QUERY = "UPDATE student SET id=?,name=?,address=?,gender=?,age=? where incid=?";
	public final static String DELETE_STUDENT_QUERY = "DELETE FROM student WHERE incid=?";
	public final static String SELECT_ALL_STUDENTS_QUERY = "SELECT * FROM student";

}	