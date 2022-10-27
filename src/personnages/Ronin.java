package personnages;

public class Ronin extends Humain {
	int honneur=1;
	
	
	 public Ronin(String nom,String boisson,int argent) {
		 super(nom,boisson,argent);
	 }
	 
	 public void donner(Commerçant beneficiaire) {
		int argentAdonner=(super.getArgent())/10;
		super.parler(beneficiaire.getNom()+" prend ces "+argentAdonner+" sous");
		beneficiaire.recevoir(argentAdonner);
	 }
	 
	 
	 public void provoquer(Yakuza adversaire) {
		 int force =2*honneur;
		 int forceAdv =adversaire.getReputation();
		 String message;
		 
		 if (force>=forceAdv) {
			 super.gagnerArgent(adversaire.perdre());
			 honneur++;
			 message="";
		 }
		 else {
			 honneur--;
			 adversaire.gagner(super.getArgent());
			 super.setArgent(0);
			 message="";
		 }
		 super.parler(message);
	 }
	 
	 
}
