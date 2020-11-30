package com.example.main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.example.db.ConnectionFactory;
import com.example.utilities.DBUtil;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class etudiants {
	
	private JFrame frame;
	
	
	private JTextField txtincid;
	private JTextField txtid;
	private JTextField txtname;
	private JTextField txtaddress;
	private JTextField txtgender;
	private JTextField txtage;
	private JTextField txtrechercheid;
	
	private String incid;
	private String id;
	private String name;
	private String address;
	private String gender;
	private String age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					etudiants window = new etudiants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	ConnectionFactory conn = new ConnectionFactory();
	Statement stm;
	ResultSet Rs;
	DefaultTableModel model = new DefaultTableModel();
	
	public etudiants() {
		initialize();
		
		model.addColumn(incid);
		model.addColumn(id);
		model.addColumn(name);
		model.addColumn(address);
		model.addColumn(gender);
		model.addColumn(age);
		
				
		try {
			
			stm = ConnectionFactory.getConnection().createStatement();
			ResultSet Rs = stm.executeQuery("Select * from student");
			
			while(Rs.next()) {
			}
			
		}catch(Exception e) {
			System.err.println(e);
			
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGestionDesEtudiants = new JLabel("Gestion des Etudiants");
		lblGestionDesEtudiants.setForeground(Color.BLUE);
		lblGestionDesEtudiants.setBackground(Color.WHITE);
		lblGestionDesEtudiants.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesEtudiants.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblGestionDesEtudiants.setBounds(208, 32, 414, 44);
		frame.getContentPane().add(lblGestionDesEtudiants);
		
		JLabel lblincid = new JLabel("incid :");
		lblincid.setForeground(Color.GREEN);
		lblincid.setFont(new Font("Arial Black", Font.BOLD, 21));
		lblincid.setBounds(31, 115, 79, 20);
		frame.getContentPane().add(lblincid);
		
		JLabel lblid = new JLabel("id :");
		lblid.setForeground(Color.GREEN);
		lblid.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblid.setBounds(31, 172, 79, 20);
		frame.getContentPane().add(lblid);
		
		JLabel lblname = new JLabel("name :");
		lblname.setForeground(Color.GREEN);
		lblname.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblname.setBounds(31, 221, 90, 27);
		frame.getContentPane().add(lblname);
		
		JLabel lblAddress = new JLabel("address :");
		lblAddress.setForeground(Color.GREEN);
		lblAddress.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblAddress.setBounds(31, 270, 129, 35);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblGender = new JLabel("gender :");
		lblGender.setForeground(Color.GREEN);
		lblGender.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblGender.setBounds(31, 326, 99, 27);
		frame.getContentPane().add(lblGender);
		
		JLabel lblAge = new JLabel("age :");
		lblAge.setForeground(Color.GREEN);
		lblAge.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblAge.setBounds(31, 380, 79, 27);
		frame.getContentPane().add(lblAge);
		
		txtincid = new JTextField();
		txtincid.setBounds(177, 115, 110, 25);
		frame.getContentPane().add(txtincid);
		txtincid.setColumns(10);
		
		txtid = new JTextField();
		txtid.setBounds(177, 172, 110, 24);
		frame.getContentPane().add(txtid);
		txtid.setColumns(10);
		
		txtname = new JTextField();
		txtname.setBounds(177, 221, 178, 27);
		frame.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		txtaddress = new JTextField();
		txtaddress.setBounds(177, 270, 292, 35);
		frame.getContentPane().add(txtaddress);
		txtaddress.setColumns(10);
		
		txtgender = new JTextField();
		txtgender.setBounds(177, 326, 143, 27);
		frame.getContentPane().add(txtgender);
		txtgender.setColumns(10);
		
		txtage = new JTextField();
		txtage.setText("");
		txtage.setBounds(177, 380, 143, 27);
		frame.getContentPane().add(txtage);
		txtage.setColumns(10);
		
		txtrechercheid = new JTextField();
		txtrechercheid.setBounds(408, 554, 143, 32);
		frame.getContentPane().add(txtrechercheid);
		txtrechercheid.setColumns(10);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String incid = txtincid.getText();
				String id = txtid.getText();
				String name = txtname.getText();
				String address = txtaddress.getText();
				String gender = txtgender.getText();
				String age = txtage.getText();
				
				String requete = "insert into student(incid,id,name,address,gender,age) VALUES('"+incid+"','"+id+"','"+name+"','"+address+"','"+gender+"','"+age+"')";
				
				try {
					
					stm.executeUpdate(requete);
					JOptionPane.showMessageDialog(null, "l'etudiant est bien ajoutee");
					
					/*txtid.setText("");
					txtaddress.setText("");
					txtgender.setText("");
					txtage.setText("");*/
					
				}catch(Exception ex) {
					
					JOptionPane.showMessageDialog(null, ex.getMessage());
					
					
				}
			}
		});
		btnAjouter.setForeground(Color.RED);
		btnAjouter.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnAjouter.setBounds(48, 473, 129, 35);
		frame.getContentPane().add(btnAjouter);
		
		JButton btnNewButton = new JButton("Afficher");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(227, 473, 129, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					if (JOptionPane.showConfirmDialog(null, "confirmer la modification","modification",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
						
						stm.executeUpdate("Update student SET id = '"+txtid.getText()+"',name = '"+txtname.getText()+"'"
								+ " ,address = '"+txtaddress.getText()+"',gender = '"+txtgender.getText()+"' WHERE incid = "+txtincid.getText() );
					}
					
				}catch (Exception e1) {
					
					JOptionPane.showMessageDialog(null, "erreur de modification !!!!!!!!" + e1.getMessage() );
					System.err.println(e1);
				}
			}
		});
		btnModifier.setForeground(Color.RED);
		btnModifier.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnModifier.setBounds(408, 473, 143, 35);
		frame.getContentPane().add(btnModifier);
		
		JButton btnSuuprimer = new JButton("Suprimer");
		btnSuuprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					if(JOptionPane.showConfirmDialog(null, "attention vous avez supprime un etudiant,est-ce-que vous etes sure ?"
							,"supprimer l'etudiant",JOptionPane.YES_NO_OPTION) ==JOptionPane.OK_OPTION );
					
					if(txtincid.getText().length() != 0 ) {
						
						stm.executeUpdate("Delete from student where incid = "+txtincid.getText());
					}
					
					else {
						
						JOptionPane.showMessageDialog(null, "veuillez SVP remplir le champ incid!!!!!");
					}
					
				}catch (Exception e1) {
					
					JOptionPane.showMessageDialog(null, "erreur de supprimer\n" + e1.getMessage());
				}
			}
		});
		btnSuuprimer.setForeground(Color.RED);
		btnSuuprimer.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSuuprimer.setBounds(602, 473, 161, 35);
		frame.getContentPane().add(btnSuuprimer);
		
		JButton btnRechercher = new JButton("Rechercher :");
		btnRechercher.setForeground(Color.RED);
		btnRechercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnRechercher.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnRechercher.setBounds(166, 543, 189, 44);
		frame.getContentPane().add(btnRechercher);
	}
}
