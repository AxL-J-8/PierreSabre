package histoire;

import personnages.Commer�ant;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commer�ant marco = new Commer�ant("Marco", 20);
		Commer�ant chonin = new Commer�ant("Chonin", 40);
		Commer�ant kumi = new Commer�ant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto =new Samourai("Miyamoto","Akimoto", "sak�", 80);
		Traitre masako =new Traitre("Miyamoto","Masako", "whisky", 100);
		
//		marco.faireConnaissanceAvec(roro);
//		marco.faireConnaissanceAvec(yaku);
//		marco.faireConnaissanceAvec(chonin);
//		marco.faireConnaissanceAvec(kumi);
//        marco.listerConnaissance();
//        roro.listerConnaissance();
//        yaku.listerConnaissance();
//		akimoto.faireConnaissanceAvec(marco);
//		akimoto.listerConnaissance();
//		akimoto.boir("the");
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.faireConnaissanceAvec(masako);
		masako.ranconner(kumi);
		masako.faireConnaissanceAvec(yaku);
		masako.faireLeGentil();
		masako.faireConnaissanceAvec(roro);
		
	}
}
