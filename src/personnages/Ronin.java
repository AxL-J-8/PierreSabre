package personnages;

public class Ronin extends Humain {
	int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public void donner(Commerçant beneficiaire) {
		int argentAdonner=(super.getArgent())/10;
		super.parler(beneficiaire.getNom()+" prend ces "+argentAdonner+" sous");
		beneficiaire.recevoir(argentAdonner);
	 }

	public void provoquer(Yakuza adversaire) {
		int force = 2 * honneur;
		int forceAdv = adversaire.getReputation();
		if (force >= forceAdv) {
			super.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			super.parler("Je t’ai eu petit yakusa!");
			super.gagnerArgent(adversaire.perdre());
			honneur++;
		} else {
			if (honneur>0) {
				honneur--;
			}
			super.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(super.getArgent());
			super.setArgent(0);
		}

	}

}
