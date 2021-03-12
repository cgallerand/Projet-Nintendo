package metier;

import java.util.List;

public class Achat {

	private String Jeu;
	private String date;
	private double prix;
	private List<Boutique> boutiques;
	
	public Achat(String jeu, String date, double prix, List<Boutique> boutiques) {
		Jeu = jeu;
		this.date = date;
		this.prix = prix;
		this.boutiques = boutiques;
	}

	public String getJeu() {
		return Jeu;
	}

	public void setJeu(String jeu) {
		Jeu = jeu;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public List<Boutique> getBoutiques() {
		return boutiques;
	}

	public void setBoutiques(List<Boutique> boutiques) {
		this.boutiques = boutiques;
	}
	

}
