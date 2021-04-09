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
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Joint {

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
					Joint window = new Joint();
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
	public Joint() {
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
		lblInscrivezVous.setBounds(196, 10, 191, 40);
		frame.getContentPane().add(lblInscrivezVous);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setFont(new Font("Arial", Font.BOLD, 20));
		lblNom.setBounds(52, 79, 56, 24);
		frame.getContentPane().add(lblNom);
		
		txtNom = new JTextField();
		txtNom.setBounds(129, 78, 142, 33);
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setFont(new Font("Arial", Font.BOLD, 18));
		lblPrenom.setBounds(52, 147, 79, 24);
		frame.getContentPane().add(lblPrenom);
		
		txtPrenom = new JTextField();
		txtPrenom.setBounds(166, 138, 152, 33);
		frame.getContentPane().add(txtPrenom);
		txtPrenom.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setFont(new Font("Arial", Font.BOLD, 18));
		lblAdresse.setBounds(52, 200, 95, 24);
		frame.getContentPane().add(lblAdresse);
		
		txtAdresse = new JTextField();
		txtAdresse.setBounds(157, 195, 275, 51);
		frame.getContentPane().add(txtAdresse);
		txtAdresse.setColumns(10);
		
		JLabel lblDatedenaissance = new JLabel("DateDeNaissance :");
		lblDatedenaissance.setFont(new Font("Arial", Font.BOLD, 18));
		lblDatedenaissance.setBounds(52, 286, 174, 24);
		frame.getContentPane().add(lblDatedenaissance);
		
		txtNaissance = new JTextField();
		txtNaissance.setBounds(236, 281, 214, 40);
		frame.getContentPane().add(txtNaissance);
		txtNaissance.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex :");
		lblSex.setFont(new Font("Arial", Font.BOLD, 20));
		lblSex.setBounds(60, 350, 55, 24);
		frame.getContentPane().add(lblSex);
		
		txtSex = new JTextField();
		txtSex.setBounds(130, 356, 108, 33);
		frame.getContentPane().add(txtSex);
		txtSex.setColumns(10);
		
		JLabel lblNumcompte = new JLabel("NumCompte :");
		lblNumcompte.setFont(new Font("Arial", Font.BOLD, 17));
		lblNumcompte.setBounds(44, 413, 119, 24);
		frame.getContentPane().add(lblNumcompte);
		
		txtNum = new JTextField();
		txtNum.setBounds(191, 411, 196, 33);
		frame.getContentPane().add(txtNum);
		txtNum.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Vos donnes sont bien entres");
			}
		});
		btnOk.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnOk.setBounds(44, 494, 85, 33);
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
		btnEffacer.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnEffacer.setBounds(439, 494, 100, 36);
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
		
		JMenuItem mntmSuuprimer = new JMenuItem("Suuprimer");
		mntmSuuprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String n = null;
					String cle = n;
						
						System.out.println("Entrer le numero du compte que vous souhaitez supprimer");
						Scanner sc = new Scanner(System.in);
					
			}
		});
		mntmSuuprimer.setFont(new Font("Arial", Font.BOLD, 15));
		mnServices.add(mntmSuuprimer);
		
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
		
		JMenuItem menuItem = new JMenuItem("");
		menuBar.add(menuItem);
	}
}
