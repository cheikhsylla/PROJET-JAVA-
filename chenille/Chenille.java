import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Permet de créer un objet Chenille à partir des classe Anneau et Tête.
 */
 
public class Chenille {
 
	// Les attibuts de la classe Chenille .
	private Tete t;
	private Anneau[] listeA;
	private Dessin d;
 
	
	public Chenille(int nbA, Dessin unDessin) { // constructeur 
		this.d = unDessin;
		this.listeA = new Anneau[nbA];
 
		int tx = d.getLargeur() / 2; // Position en x de la Tete.
		int ty = d.getHauteur() / 2; // Position en y de la Tete.
		this.t = new Tete(tx, ty, 50, 0);
 
		int ax = t.getX() - t.getR() / 2;
		int ay = t.getY();
		for (int i = 0; i < nbA; i++) {
			listeA[i] = new Anneau(ax, ay, 50);
			ax = listeA[i].getX() - t.getR() / 2;
		}
	}
 
	// Dessine la chenille.
	public void dessiner(Graphics g) {
		t.dessiner(g);
		for (Anneau a : this.listeA) {
			a.dessiner(g);
		}
	}
 
	// On déplace la chenille .
	public void deplacer() {
		int aCourant = listeA.length - 1;
		for(int i = aCourant; i > 0; i--) {
			int aPre = i - 1;
        	listeA[i].placerA(listeA[aPre].getX(), listeA[aPre].getY());
        }
		listeA[0].placerA(t.getX(), t.getY());
 
		int dh = d.getLargeur();
		int dl = d.getHauteur();
		if (this.t.atteintBord(dh, dl))
			this.t.devierCap(Math.toRadians(90));
		else {
			double capRdm = (Math.random() * 60) - 30;
			this.t.devierCap(Math.toRadians(capRdm));
		}
		t.deplacerSelonCap();
	}
 
	// Fixe le dessin dans lequel la chenille se déplace.
	public void setDessin(Dessin d) {
		this.d = d;
	}
}
