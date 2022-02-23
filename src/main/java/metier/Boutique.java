package metier;

public class Boutique {
	private String nom;
	private String Adresse;
	
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
	
	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", Adresse=" + Adresse + "]";
	}
	

}
