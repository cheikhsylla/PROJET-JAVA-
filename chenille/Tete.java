import java.awt.Graphics;
/**
 * Permet de créer un objet Tete  et de le déplacer sur le dessin grâce à son cap.
 * C'est une classe enfant de Anneau.
 */
 
public class Tete extends Anneau {
 
	// Attribut 
	private double cap;
 
	// Constructeur	
	public Tete(int xInit, int yInit, int r, double unCap) {
		super(xInit, yInit, r);
		this.cap = unCap;
	}
 
	// on récupère et retourne le rayon . 
	public int getR() {
		return this.r;
	}
 
	// Affichage de L'anneau 
	public void dessiner(Graphics g) { // L'anneu est matérialiser par un cerlcle noir . 
		g.fillOval(this.getX(), this.getY(), this.r, this.r);
	}
 
	// Modifier le cap de la tête en lui ajoutant la déviation définie par le paramètre deltaC.
	public void devierCap(double deltaC) {
		this.cap += deltaC;
	}
 
	// Retourne vrai si le centre de la tête est à une distance inférierure ou égale à R de l’un des bords de la fenêtre de taille xMax, yMax.
	// False sinon.
	public boolean atteintBord(int xMax, int yMax) {
		return (this.xInit >= xMax - this.r || this.yInit >= yMax - this.r || this.xInit <= 0 || this.yInit <= 0);
	}
 
	// Modifie le centre de la tête en lui appliquant un déplacement de longueur R dans la direction définie par le cap.
	public void deplacerSelonCap() {
		this.xInit = (int) (this.getX() + (this.r / 2 * Math.cos(this.cap)));
		this.yInit = (int) (this.getY() + (this.r / 2 * Math.sin(this.cap)));
		this.placerA(this.xInit, this.yInit);
	}
} // Tete 
