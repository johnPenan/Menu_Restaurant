import java.util.Scanner;

public class Tp_Menu {

	public static void main(String[] args) {
		String choix;
		char reponse = ' ';
		Scanner sc = new Scanner(System.in);
		String[] menu = { "\t-Double Steak House", "\t-Double Cheese", "\t-Double Bacon", "\t-Double WHOPPER",
				"\t-BIG KING", "\t-BIG KING XXL" };
		System.out.println("\n\t**********Bienvenue au restaurant BURGER KING...!**********");
		do {
			System.out.println("\n\t Ci-dessous les différents menus disponible:\n");
			// System.out.println("\n\t -Double Steak House\n\t -Double Cheese\n\t -Double
			// Bacon\n");
			for (String m : menu)
				System.out.println(m);
			System.out.println("\n\tVeillez choisir votre menu:");
			choix = sc.nextLine();
			if (choix.equals("Double Steak House"))
				System.out.println("Vous avez choisi " + choix + ", et coûte: 3.50 euros.");
			else if (choix.equals("Double Cheese"))
				System.out.println("Vous avez choisi " + choix + ", et coûte: 4.50 euros.");
			else if (choix.equals("Double Bacon"))
				System.out.println("Vous avez choisi " + choix + ", et coûte: 3.50 euros.");
			else if (choix.equals("Double WHOPPER"))
				System.out.println("Vous avez choisi " + choix + ", et coûte: 4.89 euros.");
			else if (choix.equals("BIG KING"))
				System.out.println("Vous avez choisi " + choix + ", et coûte: 3.89 euros.");
			else if (choix.equals("BIG KING XXL"))
				System.out.println("Vous avez choisi " + choix + ", et coûte: 4.99 euros.");
			else
				System.out.println("\tCe menu n'existe pas...!");

			do {
				System.out.println("\tVoulez commander un menu ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			} while (reponse != 'O' && reponse != 'N');

		} while (reponse == 'O');
		System.out.println("Au revoir, merci pour votre visite...!");
	}

}
