package histoire;

import personnages.Commerçant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		Commerçant marco = new Commerçant("Marco", 15);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boir();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono",50);

		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boir();

		yaku.direBonjour();
		yaku.extorquer(marco);

		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yaku);
	}

}
