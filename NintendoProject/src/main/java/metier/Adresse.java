package metier;

public class Adresse {

	
	private String rue;
	private String ville;
	private int numero;
	
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	public Adresse() {
	}
	
	public Adresse(String rue, String ville, int numero) {
		this.rue = rue;
		this.ville = ville;
		this.numero = numero;
	}
	
}
