package personnages;
import java.util.*;
public class Traitre extends Samourai {

	private int niveauTraitise=0;

	public Traitre(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler( "Mais je suis un traître et mon niveau de traîtrise est : "+niveauTraitise+" . Chut" );

	}
	public void ranconner(Commerçant commercant) {
		int argentCommercant;
		int argentRanconner;
		if (niveauTraitise<3) {
			argentCommercant=commercant.getArgent();
			argentRanconner=(argentCommercant*2)/10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			niveauTraitise++;
		    parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer! Donne-moi "+ argentRanconner+" sous ou gare a toi!");
			commercant.parler("Tout de suite grand " + getNom()+".");
		}
		else {			
			parler("Mince je ne peux plus ranconner personne sinon un samourai risque de me demasquer !");
		}
	}
	public void faireLeGentil() {
		Random r =new Random();
		String nomAmi;
		int don;
		Humain connaissance;
		if (nbConnaissance<1) {			
			parler("Je ne peux faire ami ami avec personne car je ne connais personne! Snif.");
		}
		else {
			connaissance=memoire[r.nextInt(nbConnaissance)];
			don=(getArgent()*1)/20;
			nomAmi=connaissance.getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "+nomAmi+".");
			parler("Bonjour l'ami! Je voudrais vous aiser en vous donnant "+don+ " sous");
			connaissance.gagnerArgent(don);
			perdreArgent(don);
			connaissance.parler("Merci "+getNom()+". Vous etes quelqu'un de bien");
			if(niveauTraitise>1) {
				niveauTraitise--;
			}
		}
		
	}
}
