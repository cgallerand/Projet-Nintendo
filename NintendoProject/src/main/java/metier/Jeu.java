package metier;

import java.util.List;

public class Jeu {

	private String titre;
	private List<Console> consoles;
	private String boutique;
	
	
	public Jeu(String titre, List<Console> consoles, String boutique) {
		this.titre = titre;
		this.consoles = consoles;
		this.boutique = boutique;
	}



	



	public String getBoutique() {
		return boutique;
	}







	public void setBoutique(String boutique) {
		this.boutique = boutique;
	}







	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public List<Console> getConsoles() {
		return consoles;
	}



	public void setConsoles(List<Console> consoles) {
		this.consoles = consoles;
	}







	@Override
	public String toString() {
		return "Jeu [titre=" + titre + ", consoles=" + consoles + ", boutique=" + boutique + "]";
	}



	
	
	
}
