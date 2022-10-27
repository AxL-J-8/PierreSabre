package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation=0;
	
	
	public Yakuza(String nom,String boisson,int argent,String clan) {
		 super(nom,boisson,argent);
		 this.clan=clan;
		 
	}	
	
	
	public void extorquer(Commerçant victime) {
	   int argentRecu;
	   String nomVictime=victime.getNom();
	   super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
	   super.parler(nomVictime+", si tu tiens à la vie donne moi ta bourse !");
	   argentRecu=victime.seFaireExtorquer();
	   super.gagnerArgent(argentRecu);
	   parler("J'ai piqué les "+argentRecu+" sous de "+nomVictime+" ce qui me fait "+super.getArgent()+" sous dans ma poche. Hi! Hi!");
	   reputation+=1;
	
	}

}
