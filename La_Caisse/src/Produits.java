
public class Produits {
	private String description;
	private double prix;
	private int quantite;
	
	public Produits() {

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public double getSomme() {
		return this.quantite * this.prix;
	}
	
}