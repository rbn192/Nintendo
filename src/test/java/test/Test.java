package test;

import java.time.LocalDate;

import metier.Adresse;
import metier.Boutique;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console gamecube = new Console("GameCube", 50, LocalDate.now());
		Jeu marioKart= new Jeu("Mario Kart 8", gamecube);
		Jeu pikmin= new Jeu("Pikmin 2", gamecube);
		Jeu zelda= new Jeu("Zelda OoT", gamecube);
		Jeu marioParty= new Jeu("Mario Party", gamecube);
		Jeu kirby= new Jeu("Kirby's Adventure", gamecube);
		
		Adresse adresseDeLucie = new Adresse("5", "rue de Mario", "Nantes");
		Boutique boutiqueDeLucie = new Boutique("Boutique de Lucie", adresseDeLucie);
	}

}
