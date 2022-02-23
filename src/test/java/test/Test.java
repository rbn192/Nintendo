package test;

import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console gamecube = new Console("GameCube");
		Jeu marioKart= new Jeu("Mario Kart 8", gamecube);
		Jeu pikmin= new Jeu("Pikmin 2", gamecube);
		Jeu zelda= new Jeu("Zelda OoT", gamecube);
		Jeu marioParty= new Jeu("Mario Party", gamecube);
		Jeu kirby= new Jeu("Kirby's Adventure", gamecube);
	}

}
