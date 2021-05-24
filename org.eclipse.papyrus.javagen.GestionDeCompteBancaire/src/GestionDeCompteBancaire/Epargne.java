package GestionDeCompteBancaire;

import java.awt.EventQueue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Epargne {

	private JFrame frame;
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtAdresse;
	private JTextField txtNaissance;
	private JTextField txtSex;
	private JTextField txtNum;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Epargne window = new Epargne();
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
	public Epargne() {
		Connect();
		initialize();
	}
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
public void Connect() {
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/compte_bancaire", "root","");
        }
        catch (ClassNotFoundException ex) 
        {
          ex.printStackTrace();
        }
        catch (SQLException ex) 
        {
        	   ex.printStackTrace();
        }
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 500, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInscrivezVous = new JLabel("Inscrivez Vous");
		lblInscrivezVous.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblInscrivezVous.setBounds(204, 21, 203, 32);
		frame.getContentPane().add(lblInscrivezVous);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setFont(new Font("Arial", Font.BOLD, 19));
		lblNom.setBounds(62, 85, 61, 21);
		frame.getContentPane().add(lblNom);
		
		txtNom = new JTextField();
		txtNom.setBounds(152, 83, 182, 32);
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setFont(new Font("Arial", Font.BOLD, 17));
		lblPrenom.setBounds(62, 154, 76, 27);
		frame.getContentPane().add(lblPrenom);
		
		txtPrenom = new JTextField();
		txtPrenom.setBounds(183, 140, 203, 39);
		frame.getContentPane().add(txtPrenom);
		txtPrenom.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setFont(new Font("Arial", Font.BOLD, 17));
		lblAdresse.setBounds(62, 224, 89, 21);
		frame.getContentPane().add(lblAdresse);
		
		txtAdresse = new JTextField();
		txtAdresse.setBounds(171, 212, 307, 49);
		frame.getContentPane().add(txtAdresse);
		txtAdresse.setColumns(10);
		
		JLabel lblDatedenaissnace = new JLabel("DateDeNaissnace :");
		lblDatedenaissnace.setFont(new Font("Arial", Font.BOLD, 16));
		lblDatedenaissnace.setBounds(62, 297, 159, 32);
		frame.getContentPane().add(lblDatedenaissnace);
		
		txtNaissance = new JTextField();
		txtNaissance.setBounds(238, 296, 228, 39);
		frame.getContentPane().add(txtNaissance);
		txtNaissance.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex :");
		lblSex.setFont(new Font("Arial", Font.BOLD, 18));
		lblSex.setBounds(77, 374, 61, 21);
		frame.getContentPane().add(lblSex);
		
		txtSex = new JTextField();
		txtSex.setBounds(171, 371, 108, 32);
		frame.getContentPane().add(txtSex);
		txtSex.setColumns(10);
		
		JLabel lblNumcompte = new JLabel("NumCompte :");
		lblNumcompte.setFont(new Font("Arial", Font.BOLD, 16));
		lblNumcompte.setBounds(77, 427, 114, 27);
		frame.getContentPane().add(lblNumcompte);
		
		txtNum = new JTextField();
		txtNum.setBounds(204, 427, 203, 39);
		frame.getContentPane().add(txtNum);
		txtNum.setColumns(10);
		
		JButton btnOk = new JButton("Save");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nom = txtNom.getText();
				String prenom = txtPrenom.getText();
				String adresse = txtAdresse.getText();
				String dob = txtNaissance.getText();
				String sex = txtSex.getText();
				String num = txtNum.getText();
				
				try {
					
					final String NOM_REGEX = "^[A-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
					 
				    final Pattern NOM_PATTERN = Pattern.compile(NOM_REGEX);
				    
				    final String PRENOM_REGEX = "^[A-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
					 
				    final Pattern PRENOM_PATTERN = Pattern.compile(PRENOM_REGEX);
				    
				    final String ADRESSE_REGEX = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z][0-9]*)*$";
					 
				    final Pattern ADRESSE_PATTERN = Pattern.compile(ADRESSE_REGEX);
				    
				    /*final String DATE_REGEX = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
		    
		            final Pattern DATE_PATTERN = Pattern.compile(DATE_REGEX);*/
		    
		            final String SEX_REGEX = "^[A-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
			 
		            final Pattern SEX_PATTERN = Pattern.compile(SEX_REGEX);
		            
                    final String NUM_REGEX = "^[0-9]*$";
				    
				    final Pattern NUM_PATTERN = Pattern.compile(NUM_REGEX);
				    
				    if (NOM_PATTERN.matcher(nom).matches() == false) {
				    	JOptionPane.showMessageDialog(null, "Le format du nom n'est pas bon,re-inserez son nom s'il vous plait");
				    }
				    
				    if (PRENOM_PATTERN.matcher(prenom).matches() == false) {
				    	JOptionPane.showMessageDialog(null, "Le format du prenom n'est pas bon,re-inserez son nom s'il vous plait");
				    }
				    
				    if (ADRESSE_PATTERN.matcher(adresse).matches() == false) {
				    	JOptionPane.showMessageDialog(null, "Le format de l'adresse n'est pas bon,re-inserez son nom s'il vous plait");
				    }
				    
				    /*if (DATE_PATTERN.matcher(dob).matches() == false) {
				    	JOptionPane.showMessageDialog(null, "Le format du date n'est pas bon,re-inserez son nom s'il vous plait");
				    }*/
				    
				    if (SEX_PATTERN.matcher(sex).matches() == false) {
				    	JOptionPane.showMessageDialog(null, "Le format du sex n'est pas bon,re-inserez son nom s'il vous plait");
				    }
				    
				    if (NUM_PATTERN.matcher(num).matches() == false) {
				    	JOptionPane.showMessageDialog(null, "Le format du numero n'est pas bon,re-inserez son nom s'il vous plait");
				    }
				    
				    if (NOM_PATTERN.matcher(nom).matches()&&
				              PRENOM_PATTERN.matcher(prenom).matches() &&
				                ADRESSE_PATTERN.matcher(adresse).matches() &&
				                /*DATE_PATTERN.matcher(dob).matches()&&*/
				                SEX_PATTERN.matcher(sex).matches()&&
				                NUM_PATTERN.matcher(num).matches()) {
				    	
				    	pst = con.prepareStatement("insert into epargne(nom,prenom,adresse,dob,sex,numCompte)values(?,?,?,?,?,?)");
						pst.setString(1, nom);
						pst.setString(2, prenom);
						pst.setString(3, adresse);
						pst.setString(4, dob);
						pst.setString(5, sex);
						pst.setString(6, num);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Record Added!!!!!");
				    	
				    }
				    
				    txtNom.setText("");
				    txtPrenom.setText("");
				    txtAdresse.setText("");
				    txtNaissance.setText("");
				    txtSex.setText("");
				    txtNum.setText("");

					
				}
				catch (SQLException e1) {

                    e1.printStackTrace();

      }
		}
		});
		btnOk.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnOk.setBounds(38, 514, 100, 21);
		frame.getContentPane().add(btnOk);
		
		JButton btnEffacer = new JButton("Effacer");
		btnEffacer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showConfirmDialog(null, "Voulez vous vraiment effacer");
				
				txtNom.setText(null);
				txtPrenom.setText(null);
				txtAdresse.setText(null);
				txtNaissance.setText(null);
				txtSex.setText(null);
				txtNum.setText(null);
			}
		});
		btnEffacer.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnEffacer.setBounds(411, 514, 102, 25);
		frame.getContentPane().add(btnEffacer);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnServices = new JMenu("Services");
		mnServices.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnServices);
		
		JMenuItem mntmAfficher = new JMenuItem("Afficher");
		mntmAfficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("1. Creation d'un compte");
				System.out.println("2. Affichage d'un compte");
				System.out.println("3. Supprimer un compte");
				System.out.println("4. Crediter/Debiter d'un compte");
				System.out.println("5. Sortir");
				System.out.println("6. De l'aide");
				System.out.println();
			}
		});
		mntmAfficher.setFont(new Font("Arial", Font.BOLD, 15));
		mnServices.add(mntmAfficher);
		
		JMenuItem mntmSupprimer = new JMenuItem("Supprimer");
		mntmSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String n = null;
				String cle = n;
					
					System.out.println("Entrer le numero du compte que vous souhaitez supprimer");
					Scanner sc = new Scanner(System.in);
				
			}
		});
		mntmSupprimer.setFont(new Font("Arial", Font.BOLD, 15));
		mnServices.add(mntmSupprimer);
		
		JMenuItem mntmCrediterdebiter = new JMenuItem("Crediter/Debiter");
		mntmCrediterdebiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
Scanner sc = new Scanner(System.in);
				
				int reponse;
				int montant;
				int solde = 0;
				
				System.out.println("Entrer votre reponse,1-crediter/ 2-debiter ");
				reponse = sc.nextInt();
				
				if (reponse == 1) {
					System.out.println("Entrer la montant a crediter :");
					montant = sc.nextInt();
					
					solde = solde + montant;
					System.out.println("Le solde est : " + solde);
					
				}
				else if (reponse == 2) {
					System.out.println("Entrer la montant a debiter :");
					montant = sc.nextInt();
					
					solde = solde - montant;
					System.out.println("Le solde est : " + solde);
				}
			}
		});
		mntmCrediterdebiter.setFont(new Font("Arial", Font.BOLD, 15));
		mnServices.add(mntmCrediterdebiter);
		
		JMenu mnAide = new JMenu("Aide");
		mnAide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Option 1. Pour creer un compte Courant, entrer Courant ");
				System.out.println("          Pour creer un compte Epargne, entrer Epargne ");
				System.out.println("          Pour creer un compte Joint, entrer Joint");
				System.out.print(" Puis, entrer votre nom,prenom,adresse,sex,date de naissance,numero du compte");
				System.out.println(" sa premiere valeur crediter/debiter ");
				System.out.println(" Dans le cas d'un compte epargne, entrer le taux ");
				System.out.println("Option 2. On va afficher les donnees de votre compte choisie");
				System.out.println("Option 3. On va vous demander si vous voulez supprimer votre compte");
				System.out.println("Option 4. On va vous demander si vous voulez crediter ou debiter");
				System.out.println("Option 5. Apres avoir creer votre compte,vous avez le choix de sortir du programme ");
				System.out.println("Option 6. Si vous avex des problemes concernant l'application,vous pouvez choisir l'option Aide");
			}
		});
		mnAide.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnAide);
		
		JMenu mnSortir = new JMenu("Sortir");
		mnSortir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Merci d'avoir choisir notre banque");
				System.out.println("Au revoir et a bientot");
				System.exit(0) ;
				
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		mnSortir.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnSortir);
	}
}
