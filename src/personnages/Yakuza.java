package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation=0;
	
	
	public Yakuza(String nom,String boisson,int argent,String clan) {
		 super(nom,boisson,argent);
		 this.clan=clan;
		 
	}	
	
	
	public void extorquer(Commer�ant victime) {
	   int argentRecu;
	   String nomVictime=victime.getNom();
	   super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
	   super.parler(nomVictime+", si tu tiens � la vie donne moi ta bourse !");
	   argentRecu=victime.seFaireExtorquer();
	   super.gagnerArgent(argentRecu);
	   parler("J'ai piqu� les "+argentRecu+" sous de "+nomVictime+" ce qui me fait "+super.getArgent()+" sous dans ma poche. Hi! Hi!");
	   reputation+=1;
	
	}

}
