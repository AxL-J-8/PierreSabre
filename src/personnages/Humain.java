package personnages;

public class Humain {
	private String boissonFavorite;
	private String nom;
	private int argent;
	private static int  NBCONNAISSANCEMAX=30;
	protected Humain[] memoire=new Humain[NBCONNAISSANCEMAX];
	protected int nbConnaissance=0;
	private int dernierConnaissance=0;
	
	public Humain(String nom, String boisson, int argent) {
		this.argent = argent;
		this.boissonFavorite = boisson;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}
	public void direBonjour() {
		parler("Bonjour ! Je m�appelle " + nom + " et j�aime boire du " + boissonFavorite);
	}

	public void boir() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		String bienEtPrix = ("m'offrir " + bien + " � " + prix + " sous");
		String argentEnPoche = (argent + " sous en poche. ");

		if (prix <= argent) {
			parler("J'ai " + argentEnPoche + "Je vais pouvoir " + bienEtPrix);
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argentEnPoche + "Je ne peux meme pas " + bienEtPrix);
		}
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	protected void parler(String texte) {
		System.out.println("(" + nom + ")" + "-" + texte);
	}
	
	public void faireConnaissanceAvec(Humain humain) {
	  direBonjour();
	  humain.repondre(this);
	  memoriser(humain);
	}
	private void memoriser(Humain humain) {
		int position;
		
		if (nbConnaissance==NBCONNAISSANCEMAX) {
			
			position=dernierConnaissance;
			dernierConnaissance++;
			
			if (dernierConnaissance==NBCONNAISSANCEMAX) {
				dernierConnaissance=0;
			}
			
		}
		
		else {
			position=nbConnaissance;
			nbConnaissance++;
		}
		memoire[position]=humain;
	}
	
	private void repondre(Humain humain)
	{
		direBonjour();
		memoriser(humain);
		
	}
	
    public void listerConnaissance() {
    	assert nbConnaissance>0;
    	String texte="Je connais beaucoup de monde dont : ";
    	for (int i=0;i<(nbConnaissance-1);i++) {
    		texte+=memoire[i].getNom()+", ";
    	}
    	texte+=memoire[nbConnaissance-1].getNom();
    	parler(texte);
    }
	
}
