package test;

import metier.Console;
import metier.Jeu;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		Console PS5 = new Console ("PS5",500.0,"2020");
		Console XBOXONE = new Console ("XBOXONE",600.0,"2019");
		List <Console> consoles = {PS5,XBOXONE};
		Jeu jeu1 = new Jeu("Mario",consoles, B1);
		Jeu jeu2 = new Jeu("Zelda",consoles, B2);
		Boutique b1 = new Boutique("B1","34 rue boileau", jeux);
		Boutique b2 = new Boutique("B2","35 rue boileau", jeux);
	}

}
