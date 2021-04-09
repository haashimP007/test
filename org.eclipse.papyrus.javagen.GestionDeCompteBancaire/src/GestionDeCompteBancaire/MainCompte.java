package GestionDeCompteBancaire;

import java.util.Scanner;
import java.lang.String;
import java.io.*;

public class MainCompte {
	
	public static int MenuPrincipal() 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int choix;
		
		System.out.println("1. Creation d'un compte");
		System.out.println("2. Affichage d'un compte");
		System.out.println("3. Supprimer un compte");
		System.out.println("4. Crediter/Debiter d'un compte");
		System.out.println("5. Sortir");
		System.out.println("6. De l'aide");
		System.out.println();
		
		System.out.println("Entrer votre choix s'il vous plait");
		return choix = sc.nextInt();
	}
	
	public static void sortir()
	{
		System.out.println("Merci d'avoir choisir notre banque");
		System.out.println("Au revoir et a bientot");
		System.exit(0) ;
	}
	
	public static void Aide()
	{
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompteBancaire uneCompte = new CompteBancaire();
		
		Scanner sc = new Scanner(System.in);
		
		int choix,montant = 0;
		int solde = 0;
		String typeCompte,numeroCompte;
		double taux = 0.0;
		
		do {
			
			choix = MenuPrincipal();
			
			switch (choix) {
			
			case 1 :
				
					System.out.println("Bonjour cher client/cliente,nous avons 3 types de compte possibles");
					System.out.println("Les types possibles sont :  Courant(C)-Epargne(E)-Joint(J)");
					typeCompte = sc.next();
					
				
				uneCompte.creerCompte();
				
				if ( typeCompte == "Epargne")
				{
					System.out.println("Entrer le taux de placement");
					taux = sc.nextDouble();
				}
				
				break;
				
			case 2 :
				System.out.println("Quel type de compte voulez vous afficher");
				typeCompte = sc.next();		
				
					uneCompte.afficherCompte();
				
			   if (typeCompte == "Epargne") {
					System.out.println("Le taux de placement " + taux);
				}
				
				break;
				
			case 3 :
				String n = null;
				uneCompte.supprimerCompte(n);
				
			case 4 :
				int reponse;
				System.out.println("Entrer votre reponse,1-crediter/ 2-debiter ");
				reponse = sc.nextInt();
				
				if (reponse == 1)
				{
					uneCompte.ligneComptable();
					uneCompte.crediter(montant);
					System.out.println("Le solde est : " + solde);
				}
				
				else if (reponse == 2)
				{
					uneCompte.ligneComptable();
					uneCompte.debiter(montant);
					System.out.println("Le solde est : " + solde);
					
				}
				
				break;
				
			case 5 :
				System.out.println("Sortir du programme");
				sortir();
				
              ///////////////////// Sauvegarder les comptes dans un fichier comptes.dat/////////////////////////	
				
			try {
				
				Writer Writer = null;
				
				 Writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("comptes.txt"), "utf-8"));
				 Writer.close();
			}
			catch (FileNotFoundException e) {
				
				e.printStackTrace();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
				
				
			case 6 :	
				System.out.println("Choisissez cette option si vous avez des problemes");
				Aide();
				
				break;
				
				default :
					System.out.println("L'option rentre n'est pas bon,re-entrer votre choix");
					choix = sc.nextInt();
			}		
			
		}while (choix != 4);

	}

}
