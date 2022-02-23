package test;

import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client c1 = new Client("p1","n1");
		Client c2 = new Client("p2","n2");

		Adresse a1 = new Adresse("1","r","v");
		Boutique b1 = new Boutique("n1",a1);
		
		Console gamecube = new Console("GameCube");
		Jeu marioKart= new Jeu("Mario Kart 8", gamecube,b1);
		Jeu pikmin= new Jeu("Pikmin 2", gamecube,b1);
		Jeu zelda= new Jeu("Zelda OoT", gamecube,b1);
		Jeu marioParty= new Jeu("Mario Party", gamecube,b1);
		Jeu kirby= new Jeu("Kirby's Adventure", gamecube,b1);
		
		
		
		
	}
	

}
