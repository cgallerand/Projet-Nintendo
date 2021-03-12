package test;

import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Console PS5 = new Console ("PS5",500.0,"2020");
		Console XBOXONE = new Console ("XBOXONE",600.0,"2019");
		ArrayList <Console> consoles = new ArrayList<Console>();
		consoles.add(XBOXONE);
		consoles.add(PS5);
		Jeu jeu1 = new Jeu("Mario",consoles);
		Jeu jeu2 = new Jeu("Zelda",consoles);
		ArrayList<Jeu> jeux = new ArrayList<Jeu>();
		jeux.add(jeu1);
		jeux.add(jeu2);
		Boutique b1 = new Boutique("B1","34 rue boileau", jeux);
		Boutique b2 = new Boutique("B2","35 rue boileau", jeux);
		jeu1.setBoutique(b1);
		jeu2.setBoutique(b2);
		
		Client client1 = new Client("Jordan", "Abid", jeux);
	}

}
