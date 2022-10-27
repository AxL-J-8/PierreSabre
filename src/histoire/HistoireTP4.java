package histoire;

import personnages.Commerçant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof= new Humain("Prof","kombucha",54);
		Commerçant marco= new Commerçant("Marco",20);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boir();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono",50);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boir();

	}

}
