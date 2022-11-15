package personnages;

public class Commerçant extends Humain {

	public Commerçant(String nom,int argent) {
	 super(nom,"thï¿½",argent);
 }

	public int seFaireExtorquer() {
		int argentInitiale = super.getArgent();
		super.parler("J'ai tout perdu! Le monde est trop injuste...");
		super.setArgent(0);
		return argentInitiale;

	}

	public void recevoir(int argent) {
		super.gagnerArgent(argent);
		super.parler(argent + " sous ! Je te remercie gï¿½nï¿½reux donateur ");
	}

}
