package histoire;

import personnages.Commerçant;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commerçant marco = new Commerçant("Marco", 20);
		Commerçant chonin = new Commerçant("Chonin", 40);
		Commerçant kumi = new Commerçant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto =new Samourai("Miyamoto","Akimoto", "saké", 80);
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
