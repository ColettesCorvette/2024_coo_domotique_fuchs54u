import java.util.Scanner;
import java.util.ArrayList;

/**
 * classe qui cree des lampes et une telecommande associee.
 */

public class Main{

	public static void main(String args[]) {
		// la telecommande vide
		Telecommande t = new Telecommande();


		// ajoute des objets
		// utilisation de refactor (extract method)
		// pour rendre le code plus clair
		ajouter4Lampes(t);
		ajouter4Chaines(t);

		// test d'activation

		//System.out.println(t);

		// gestion du menu
		lancerMenu(t);
	}

	/**
	 * menu qui permet de manipuler une telecommande
	 * 
	 * @param t
	 *            telecommande a manipuler
	 */
	private static void lancerMenu(Telecommande t) {
		System.out.println(t);
		Scanner sc = new Scanner(System.in);

		boolean fini=false;
		
		// tant qu'il y a des commandes
		while (!fini) {
			
			// demande lampe et commande
			System.out.println("entrer le numero de la lampe");
			int choix = sc.nextInt();
			sc.nextLine();
			System.out.println("entrer commande (+/-/exit)");
			String com = sc.nextLine();

			System.out.println("entrer le numero de la chaine");
			int choix2 = sc.nextInt();
			sc.nextLine();
			System.out.println("entrer commande (on/off/exit)");
			String com2 = sc.nextLine();



			// si la commande est +, on active
			if(com.equals("+")){
				System.out.println("== activer "+choix+"==");
				t.activerAppareil(choix);
			}
			// si la commande est - on descactive
			else if (com.equals("-")) {
				System.out.println("== desactiver "+choix+"==");
				t.desactiverAppareil(choix);
			}
			// si la commande est exit, on arrete
			else if (com.equals("exit")) {
				System.out.println("== Fin du programme == ");
				fini=true;
			}
			// commande non reconnue
			else {
				System.out.println("commande inconnue");
			}


			if(com2.equals("on")) {
				System.out.println("== allumer "+choix+"==");
				t.activerAppareil(choix2);
			}
			else if(com2.equals("off"))
			{
				System.out.println("== eteindre "+choix+"==");
				t.desactiverAppareil(choix2);
			}
			else if(com2.equals("exit"))
			{
				System.out.println("== Fin du programme == ");
				fini=true;
			}
			// commande non reconnue
			else {
				System.out.println("commande inconnue");
			}

			//affiche l'etat de le telecommande
			System.out.println(t);
		}
		sc.close();
	}

	/**
	 * creation des objets et ajout dans la telecommande
	 * 
	 * @param t
	 *            telecommande dans lequelle on ajoute 4 lampes
	 */
	private static void ajouter4Lampes(Telecommande t)
	{
		for (int i = 0; i < 4; i++)
		{
			t.ajouterAppareil(new Lampe(""));
		}
	}


	/**
	 * creation des objets et ajout dans la telecommande
	 *
	 * @param t
	 *            telecommande dans lequelle on ajoute 4 chaines Hi-fi
	 */
	private static void ajouter4Chaines(Telecommande t)
	{
		for (int i = 0; i < 4; i++)
		{
			t.ajouterAppareil(new Hifi());
		}
	}

}
