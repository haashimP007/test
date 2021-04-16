   /*
 * TPCryptage.c
 *
 *  Created on: 12 Nov 2019
 *      Author: Haashim Potyram
 */


///Le TP 2019 de language C

# include <stdio.h>
# include <stdlib.h>
# include <string.h>

///fonctions encrypt,decrypt,ascii,chiffrer et dechiffrer

///function Encrypt
void Encrypt(char mess[100],int k,int decalage)
{
	int a;
	char caractere;

					//code en asci
					for (a = 0; mess[a] != '\0' ; a++)
					{
						caractere = mess[a];//string en integer

												///condition de codage
												///Les miniscules
												if (caractere >= 'a' && caractere <= 'z')
												{
													caractere = caractere + decalage;
													if (caractere > 'z')
													{
														///caractere = caractere - 26
														caractere = caractere - 26;
													}
													mess[a] = caractere;//retranscription en string
												}
												///Les majuscules
												else if (caractere >= 'A' && caractere <= 'Z')
												{
													caractere = caractere + decalage;
													if (caractere > 'Z')
													{
														///caractere = caractere - 26
														caractere = caractere - 26;
											 	    }
												}
												mess[a] = caractere;//retranscription en string

					}

}



///function Decrypt
void Decrypt(char mess[100],int k,int decalage)
{

	///local variable
	int a;
	int caractere;


	///Code en asci
			for (a = 0; mess[a] != '\0' ; a++)
			{
				///String en integer
				caractere = mess[a];
								    ///condition de codage
								    ///Les miniscules
										if (caractere >= 'a' && caractere <= 'z')
										{
											caractere = caractere - decalage;
											if (caractere < 'a')
											{
												///caractere = caractere - 26
												caractere = caractere + 26;
											}
											mess[a] = caractere;///retranscription en string
										}
										///Les majuscules
										else if (caractere >= 'A' && caractere <= 'Z')
										{
											caractere = caractere - decalage;
											if (caractere < 'A')
											{
												///caractere = caractere - 26
												caractere = caractere + 26;
											}
											mess[a] = caractere;//retranscription en string



										}

				}

}

///Function chiffrer la phrase crypte
void chiffrer(char mess[100],int decalage,int k,char chiff[100])
{
	///Les variables locaux
	int a;
	char caractere;

						//code en asci
						for (a = 0; mess[a] != '\0' ; a++)
						{
							caractere = mess[a];//string en integer

													///condition de codage
													///Les miniscules
													if (caractere >= 'a' && caractere <= 'z')
													{
														caractere = caractere + decalage;
														if (caractere > 'z')
														{
															///caractere = caractere - 26
															caractere = caractere - 26;
														}
														mess[a] = caractere;//retranscription en string
													}
													///Les majuscules
													else if (caractere >= 'A' && caractere <= 'Z')
													{
														caractere = caractere + decalage;
														if (caractere > 'Z')
														{
															///caractere = caractere - 26
															caractere = caractere - 26;
														}
													}
													mess[a] = caractere;//retranscription en string

													///le chifrement du texte crypte(B = A XOR k)
													chiff[a] = mess[a] ^ k;


						}

}


///function dechiffrer la phrase obtenu depuis la fonction chiffrer
void dechiffrer(char mess[100],int decalage,int k,char chiff[100])
{
	///Les variables locaux
	int a = 0;
	char caractere;



	///le dechiffrement du texte chiffrer(A = B XOR k)
	mess[a] = chiff[a] ^ k;

	///Code en asci
				for (a = 0; mess[a] != '\0' ; a++)
				{
					///String en integer
					caractere = mess[a];
					///condition de codage
					//Les miniscules
					if (caractere >= 'a' && caractere <= 'z')
					{
						caractere = caractere - decalage;
						if (caractere < 'a')
						{
					         ///caractere = caractere - 26
						 	caractere = caractere + 26;
					    }
							mess[a] = caractere;///retranscription en string
				    }
					         ///Les majuscules
				    else if (caractere >= 'A' && caractere <= 'Z')
						{
							caractere = caractere - decalage;
						if (caractere < 'A')
						{
							///caractere = caractere - 26
							caractere = caractere + 26;
						}
							mess[a] = caractere;//retranscription en string


						}


				}

}


///Main program
int main()
{
	 ///Declarations de variables
					int i;///indice
					char caractere;///les caracteres
					char bin[100];///binaire en string
					int hash = 0;///le hash(xor entre les caracteres)
					char mess[100];///la phrase a inserer
					char password[100];///Le mot de passe
					char chiff[100];///Le text chiffrer
					int decalage;///le decalage
					int x;///binaire en entier(Hash en binaire)
					char bin1[100];///binaire en string(decalage en binaire)
					char bin2[100];///binaire en string(k en binaire)
					int choix;///Le choix normal(le premier switch)
					int choix1;///le premier choix a faire(Le deuxieme switch)
					int choix2;///Le deuxieme choix a faire(Le troisieme switch)
					int choix3;///Le troisieme choix a faire(le quatrieme choix a faire)
					int k;///La cle k


					FILE * fichier1;
					FILE * fichier2;

					///Ouvrir le fichier
					fichier1 = fopen("Original.txt","w");
					fichier2 = fopen("Cryptage.txt","w");

					///condition bonne ou mauvaise lecture
						if (fichier1 == 0)
						{
							printf("echec creation fichier\n");
							exit(1);
						}

						///Entrer le message
						printf("Entrer le message s'il vous plait\n");
						gets(mess);
						fprintf(fichier1,"voila le message que vous avez entre : %s\n",mess);


						///Affichage de la decalage
							printf("Enter the key between 1 and 26\n");
							scanf("%d",&decalage);

							if (decalage>=26 || decalage<=1)
							{
								printf("Error,Re-enter the key between 1 and 26 please\n");
							}

						///Entrer le  password
						printf("entrer le password\n");
						scanf("%s",&password);


						int n = strlen(password);
						printf("le nombre de caracteres du password est : %d\n",n);


						///calcul du hash entre les caracteres
						for (i = 0;i < n; i++)
						{
							caractere = password[i];

							///Hash du program
							hash ^= caractere;

						}

						///conversion de binaire string en entier
						x = atoi(bin);

						printf("voila le hash en binaire : %d\n",x);
						fprintf(fichier2,"voila le hash en binaire : %d\n",x);

						///decalage en binaire
						int y = atoi(bin1);

						printf("voila le decalage en binaire : %d\n",y);
						fprintf(fichier2,"voila le decalage en binaire : %d\n",y);

						///Le calcul du cle k

						k = hash ^ decalage;

						int z = atoi(bin2);

						printf("voila la cle k en binaire : %d\n",z);
						fprintf(fichier2,"voila la cle k en binaire : %d\n",z);

						top :
						printf("Faites un choix,souhaitez vous encrypter,taper(0) ou bien decrypter,tape(1)\n");
						scanf("%d",&choix);

						switch(choix)
						{
						case 0:
							///Enctyptage XOR
							Encrypt(mess,k,decalage);
							printf("voila le message encrypte  : %s\n",mess);
							fprintf(fichier2,"voila votre message crypte  : %s\n",mess);


							ins:
							printf("souhaitez continuer(2) ou arreter(3)\n");
							scanf("%d",&choix1);

							switch(choix1)
							{
							case 2:
								goto top;
								break;

							case 3:
								printf("Sortir du switch\n");

								break;

							default:
								printf("lisez les instructions bien\n");
								goto ins;

								break;

							}

							break;

						    case 1:
								///decryptage XOR
								Decrypt(mess,k,decalage);
								printf("voila le message decrypte  : %s\n",mess);
								fprintf(fichier2,"voila votre message decrypte : %s\n",mess);
								goto ins;
								break;

						}


							  printf("Faites un choix,souhaitez vous chiffrer,taper(0) ou bien dechiffrer,tape(1)\n");
							  scanf("%d",&choix2);

						switch(choix2)
						{

								case 0:

										///chiffrement XOR
										chiffrer(mess,decalage,k,chiff);

										printf("voila le message chiffrer XOR  : %s\n",chiff);
										fprintf(fichier2,"voila votre message chiffrer XOR  : %s\n",chiff);



										printf("Maintenant,voulez-vous continuez(2) ou arreter(3)\n");
										scanf("%d",&choix2);

										printf("Faites un choix,souhaitez vous chiffrer,taper(0) ou bien dechiffrer,tape(1)\n");
										scanf("%d",&choix3);


									   ///dechiffrement XOR

										  dechiffrer(mess,decalage,k,chiff);

										  printf("voila le message dechiffrement XOR : %s\n",mess);
										  fprintf(fichier2,"voila votre message dechiffrement XOR : %s\n",mess);



									   break;

								 case 2 :
										  printf("Maintenant,voulez-vous continuez(2) ou arreter(3)\n");
										  scanf("%d",&choix2);

										  break;


								 case 3:
										  printf("fin\n");

										  break;

								default:
										  printf("Regarder les instructions bien\n");

										  break;


				}


                        fclose(fichier1);
						fclose(fichier2);

						system("pause");
						return 0;

}








