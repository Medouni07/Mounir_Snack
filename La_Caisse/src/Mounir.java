import java.util.ArrayList;
import java.util.Scanner;

public class Mounir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Declaration de ma variable gardant en memoir  l'état de la command (finie VS pas finie)
		boolean isOrderDone = false;
		
		// Declaration de la list de mes produits à laquelle je vais ajouter mes produits créés dans ma boucle
		ArrayList<Produits> listeDeMesProduits = new ArrayList<Produits>();
		
		// Déclaration de la variable qui contiendra l'accumulation total des sous-totaux des produits (sous-total = qte * prix)
		double total = 0;
		
		do {
		
		// Création d'une instance de mon classe produit
		Produits produit = new Produits();
		
		// Demander à l'user de renseigner le produit
		System.out.println("entrez un nom de produit");
		produit.setDescription(sc.nextLine());
		System.out.println(produit.getDescription());
		
		// Demander un prix 
		System.out.println("entrez un prix");
		produit.setPrix(sc.nextDouble());
		System.out.println(produit.getPrix());
		
		// Demander la quantité
		System.out.println("entrez la quantité");
		produit.setQuantite(sc.nextInt());
		System.out.println(produit.getQuantite());
		
		// Calculer le sous-total
		double sousTotal = produit.getPrix() * produit.getQuantite();
		
		// Calculer le total
		total += sousTotal;
		
		// Ajouter le produit a ma liste
		listeDeMesProduits.add(produit);
		
		// demander si la commande est finie
		System.out.println("est-ce que la commande est finie? Y/n");
		String doneAnswer = sc.nextLine();
		if (doneAnswer.equals("Y")) {
			isOrderDone = !isOrderDone;
		}
		
		} while(!isOrderDone);
		
		// Sortir la partie du ticket correspondant a chaque produit
		for (Produits produit:listeDeMesProduits) {
			System.out.println("Nom du produit : " + produit.getDescription());
			System.out.println("Prix du produit : " + produit.getPrix());
			System.out.println("Quantité du produit : " + produit.getQuantite());
			System.out.println("Sous-total : " + produit.getSomme());
			System.out.println("---------------------------------");
		}
		
		System.out.println("TOTAL : " + total);
		
		
	}

}