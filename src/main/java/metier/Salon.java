package metier;

public class Salon extends Console{

	public Salon(String nom) {
		super(nom);
	}

	@Override
	public String toString() {
		return "Salon [getNom()=" + getNom() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
