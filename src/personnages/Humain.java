package personnages;

public class Humain {
  private String boisson;
  private String nom;
  private int argent;
  
public Humain(String nom,String boisson,int argent) {
	this.argent=argent;
	this.boisson=boisson;
	this.nom=nom;
}


public String getNom() {
	return nom;
}


public int getArgent() {
	return argent;
}

public void setArgent(int argent) {
	this.argent= argent;
}

public void direBonjour() {
	parler("Bonjour ! Je m’appelle " +nom +" et j’aime boire du "+ boisson);
}


public void boir() {
	parler("Mmmm, un bon verre de "+boisson+" ! GLOUPS !");
}


public void acheter(String bien, int prix) {
	String bienEtPrix= ("m'offrir "+bien+" à "+prix+ " sous");
    String argentEnPoche= ( argent+" sous en poche. ");
    
	if (prix <=argent) {
		parler("J'ai "+argentEnPoche+"Je vais pouvoir "+bienEtPrix);
		perdreArgent(prix);
	}
	else {
		parler("Je n'ai plus que "+argentEnPoche+"Je ne peux meme pas "+bienEtPrix);
	}
}

public void gagnerArgent(int gain) {
	argent+=gain;
}


public void perdreArgent(int perte) {
	argent-=perte;
}

protected void parler(String texte) {
	System.out.println("("+nom+")"+"-"+texte);
}

}
