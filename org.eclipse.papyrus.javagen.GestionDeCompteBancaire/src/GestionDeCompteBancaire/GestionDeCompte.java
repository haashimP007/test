package GestionDeCompteBancaire;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GestionDeCompte {
	
	public String nom;
	public String prenom;
	public String DateDeNaissance;
	public String sex;
	public String adresse;
	private String numCompte;
	private String typeCompte;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionDeCompte window = new GestionDeCompte();
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
	public GestionDeCompte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(400, 500, 600, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion d'un Compte Bancaire");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel.setBounds(137, 10, 330, 123);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblBienvenu = new JLabel("Bienvenu!!!");
		lblBienvenu.setFont(new Font("Arial", Font.BOLD, 22));
		lblBienvenu.setBounds(240, 151, 128, 34);
		frame.getContentPane().add(lblBienvenu);
		
		JButton btnCompte = new JButton("CompteCourant");
		btnCompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Courant nw = new Courant();
				nw.NewScreen();
			}
		});
		btnCompte.setFont(new Font("Arial", Font.BOLD, 16));
		btnCompte.setBounds(219, 207, 162, 41);
		frame.getContentPane().add(btnCompte);
		
		JButton btnComptejoint = new JButton("CompteJoint");
		btnComptejoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Joint ab = new Joint();
				ab.NewScreen();
			}
		});
		btnComptejoint.setFont(new Font("Arial", Font.BOLD, 16));
		btnComptejoint.setBounds(219, 273, 162, 41);
		frame.getContentPane().add(btnComptejoint);
		
		JButton btnCompteepargne = new JButton("CompteEpargne");
		btnCompteepargne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Epargne sc = new Epargne();
				sc.NewScreen();
			}
		});
		btnCompteepargne.setFont(new Font("Arial", Font.BOLD, 16));
		btnCompteepargne.setBounds(219, 345, 162, 41);
		frame.getContentPane().add(btnCompteepargne);
		
		JLabel lblAuRevoirEt = new JLabel("AU revoir et Merci!!!");
		lblAuRevoirEt.setFont(new Font("Arial", Font.BOLD, 18));
		lblAuRevoirEt.setBounds(219, 411, 190, 34);
		frame.getContentPane().add(lblAuRevoirEt);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnServices = new JMenu("Services");
		mnServices.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnServices);
		
		JMenu mnAfficher = new JMenu("Afficher");
		mnAfficher.addActionListener(new ActionListener() {
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
		mnAfficher.setFont(new Font("Arial", Font.BOLD, 13));
		mnServices.add(mnAfficher);
		
		JMenuItem mntmComptecourant = new JMenuItem("CompteCourant");
		mntmComptecourant.setFont(new Font("Arial", Font.BOLD, 13));
		mnAfficher.add(mntmComptecourant);
		
		JMenuItem mntmComptejoint = new JMenuItem("CompteJoint");
		mntmComptejoint.setFont(new Font("Arial", Font.BOLD, 13));
		mnAfficher.add(mntmComptejoint);
		
		JMenuItem mntmCompteepargne = new JMenuItem("CompteEpargne");
		mntmCompteepargne.setFont(new Font("Arial", Font.BOLD, 13));
		mnAfficher.add(mntmCompteepargne);
		
		JMenuItem mntmSupprimer = new JMenuItem("Supprimer");
		mntmSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  String n = null;
				String cle = n;
					
					System.out.println("Entrer le numero du compte que vous souhaitez supprimer");
					Scanner sc = new Scanner(System.in);
				
			}
		});
		mntmSupprimer.setFont(new Font("Arial", Font.BOLD, 13));
		mnServices.add(mntmSupprimer);
		
		JMenuItem mntmCrediter = new JMenuItem("Crediter");
		mntmCrediter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int solde = 0;
				int montant = 0;
				
				 solde += montant;
			}
		});
		mntmCrediter.setFont(new Font("Arial", Font.BOLD, 13));
		mnServices.add(mntmCrediter);
		
		JMenuItem mntmDebiter = new JMenuItem("Debiter");
		mntmDebiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int solde = 0;
				int montant = 0;
				
				 solde -= montant;
			}
		});
		mntmDebiter.setFont(new Font("Arial", Font.BOLD, 13));
		mnServices.add(mntmDebiter);
		
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
