package metier;

import java.util.ArrayList;

public class Boutique {

	private String nom;
	private String Adresse;
	private ArrayList<Jeu> listeJeux;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public ArrayList<Jeu> getListeJeux() {
		return listeJeux;
	}
	public void setListeJeux(ArrayList<Jeu> listeJeux) {
		this.listeJeux = listeJeux;
	}
	
	
	public Boutique() {
	}
	
	public Boutique(String nom, String adresse, ArrayList<Jeu> listeJeux) {
		this.nom = nom;
		Adresse = adresse;
		this.listeJeux = listeJeux;
	}
	
	
	
	
}
