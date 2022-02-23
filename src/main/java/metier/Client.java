package metier;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String prenom;
	private String nom;
	private List <Achat> listeAchat = new ArrayList();

	
	public Client(String prenom, String nom) {

		this.prenom = prenom;
		this.nom = nom;

	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Client [prenom=" + prenom + ", nom=" + nom + "]";
	}
	
	
	
}
