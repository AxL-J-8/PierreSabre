package personnages;

public class Commer�ant extends Humain {
	
 public Commer�ant(String nom,int argent) {
	 super(nom,"th�",argent);
 }
 
 public int seFaireExtorquer() {
	 int argentInitiale=super.getArgent();
	 super.parler("J'ai tout perdu! Le monde est trop injuste...");
	 super.setArgent(0);
	 return argentInitiale;
	 
 }
 
 public void recevoir(int argent) {
	 super.gagnerArgent(argent);
	 super.parler(argent+" sous ! Je te remercie g�n�reux donateur ");
 }
 
}
