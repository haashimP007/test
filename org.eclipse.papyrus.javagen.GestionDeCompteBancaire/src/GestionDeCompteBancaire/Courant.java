package GestionDeCompteBancaire;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Courant {
	
	public String nom;
	public String prenom;
	public String DateDeNaissance;
	public String sex;
	public String adresse;
	private String numCompte;
	private String typeCompte;

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
					Courant window = new Courant();
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
	public Courant() {
		initialize();
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
		lblInscrivezVous.setBounds(206, 10, 199, 35);
		frame.getContentPane().add(lblInscrivezVous);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setFont(new Font("Arial", Font.BOLD, 18));
		lblNom.setBounds(45, 79, 55, 22);
		frame.getContentPane().add(lblNom);
		
		txtNom = new JTextField();
		txtNom.setBounds(124, 67, 157, 35);
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setFont(new Font("Arial", Font.BOLD, 16));
		lblPrenom.setBounds(32, 133, 81, 27);
		frame.getContentPane().add(lblPrenom);
		
		txtPrenom = new JTextField();
		txtPrenom.setBounds(124, 131, 157, 35);
		frame.getContentPane().add(txtPrenom);
		txtPrenom.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setFont(new Font("Arial", Font.BOLD, 16));
		lblAdresse.setBounds(32, 205, 81, 27);
		frame.getContentPane().add(lblAdresse);
		
		txtAdresse = new JTextField();
		txtAdresse.setBounds(124, 203, 281, 45);
		frame.getContentPane().add(txtAdresse);
		txtAdresse.setColumns(10);
		
		JLabel lblDatedenaissance = new JLabel("Date De Naissance :");
		lblDatedenaissance.setFont(new Font("Arial", Font.BOLD, 15));
		lblDatedenaissance.setBounds(32, 287, 157, 27);
		frame.getContentPane().add(lblDatedenaissance);
		
		txtNaissance = new JTextField();
		txtNaissance.setBounds(185, 284, 206, 35);
		frame.getContentPane().add(txtNaissance);
		txtNaissance.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex :");
		lblSex.setFont(new Font("Arial", Font.BOLD, 18));
		lblSex.setBounds(30, 344, 46, 13);
		frame.getContentPane().add(lblSex);
		
		txtSex = new JTextField();
		txtSex.setBounds(124, 339, 103, 27);
		frame.getContentPane().add(txtSex);
		txtSex.setColumns(10);
		
		JLabel lblNumcompte = new JLabel("NumCompte :");
		lblNumcompte.setFont(new Font("Arial", Font.BOLD, 15));
		lblNumcompte.setBounds(32, 405, 110, 22);
		frame.getContentPane().add(lblNumcompte);
		
		txtNum = new JTextField();
		txtNum.setBounds(157, 400, 157, 35);
		frame.getContentPane().add(txtNum);
		txtNum.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Vos donnes sont bien entres");
			}
		});
		btnOk.setFont(new Font("Arial", Font.BOLD, 16));
		btnOk.setBounds(30, 502, 85, 29);
		frame.getContentPane().add(btnOk);
		
		JButton btnEffacer = new JButton("Effacer");
		btnEffacer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment effacer");
				
				txtNom.setText(null);
				txtPrenom.setText(null);
				txtAdresse.setText(null);
				txtNaissance.setText(null);
				txtSex.setText(null);
				txtNum.setText(null);
				
			}
		});
		btnEffacer.setFont(new Font("Arial", Font.BOLD, 16));
		btnEffacer.setBounds(452, 505, 93, 26);
		frame.getContentPane().add(btnEffacer);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnServies = new JMenu("Servies");
		mnServies.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnServies);
		
		JMenuItem mntmAfficher = new JMenuItem("Afficher");
		mntmAfficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Votre nom est : " + nom);
				System.out.println("Votre prenom est : " + prenom);
				System.out.println("Votre date de naissance est : " + DateDeNaissance);
				System.out.println("Votre sex est : " + sex);
				System.out.println("Votre adresse est : " + adresse);
				System.out.println("Votre numero de compte est : " + numCompte);
				System.out.println("Votre type de compte est : " + typeCompte);
				
			}
		});
		mntmAfficher.setFont(new Font("Arial", Font.BOLD, 15));
		mnServies.add(mntmAfficher);
		
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
		mnServies.add(mntmSupprimer);
		
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
		mntmCrediterdebiter.setFont(new Font("Arial", Font.BOLD, 14));
		mnServies.add(mntmCrediterdebiter);
		
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
			}
		});
		mnSortir.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnSortir);
	}
}
