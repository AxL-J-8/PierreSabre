package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;

	}

	public void extorquer(Commerçant victime) {
		
	   int argentRecu;
	   String nomVictime=victime.getNom();
	   super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
	   super.parler(nomVictime+", si tu tiens � la vie donne moi ta bourse !");
	   argentRecu=victime.seFaireExtorquer();
	   super.gagnerArgent(argentRecu);
	   parler("J'ai piqu� les "+argentRecu+" sous de "+nomVictime+" ce qui me fait "+super.getArgent()+" sous dans ma poche. Hi! Hi!");
	   reputation+=1;
	
	}

	public int perdre() {
		
		int argentPerdu = super.getArgent();
		if (reputation > 0) {
			reputation--;
		}
		super.parler(" J’ai perdu mon duel et mes "+ argentPerdu+" sous, snif... J'ai déshonoré le clan de "+clan);
		return argentPerdu;
	}

	public void gagner(int gain) {
		super.gagnerArgent(gain);
		reputation++;
		super.parler("Ce ronin pensait vraiment battre "+super.getNom()+" du clan de "+clan+ " Je l'ai dépouillé de ses "+ gain +" sous");
	}

	public int getReputation() {
		return reputation;
	}

}
