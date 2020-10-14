 /**
 * Dessin.java
 */
 
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JPanel;
/**
 * Defini le contenu de la fenêtre de l'application d'animation des Chenille. 
 */
 
public class Dessin extends JPanel {
    /**
     * stocke la liste des Chenille ayant été ajoutées à cette zone de
     * dessin.
     */
    private List<Chenille> listeDesChenilles = new ArrayList<Chenille>();
 
    /**
     * retourne la largeur de la zone de dessin.
     * @return la largeur.
     */
    public int getLargeur() {
        return getWidth();
    }
 
    /**
     * retourne la hauteur de la zone de dessin.
     * @return la hauteur.
     */
    public int getHauteur() {
        return getHeight();
    }
 
    /**
     * ajoute un Chenille à la zone de dessin.
     * @param c la Chenille à ajouter au Dessin
     * @see Chenille
     */
    public void ajouterObjet(Chenille c) {
 
        if (!listeDesChenilles.contains(c)) {
            // l'objet n'est pas déjà dans la liste
            // on le rajoute a la liste des objets du dessin
            listeDesChenilles.add(c);
			// fixe le dessin associé au visage rond v : c'est CE dessin
            c.setDessin(this);
            // le dessin se réaffiche
            repaint();
        }
    }
 
    /**
     * temporisation de l'animation.
     * @param durée delai de temporisation en ms.
     */
    public void pause(int duree) {
        try {
            Thread.sleep(duree);
        } catch (Exception e) {}
    }
 
    /**
     * affiche la zone de dessin et son contenu
     * @param g le contexte graphique
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        dessinerLesChenilles(g);
    }
 
    /**
     * Parcourt la liste des Chenille pour afficher chacune d'elle.
     * @param g le contexte graphique
     */
    private void dessinerLesChenilles(Graphics g) {
        Iterator<Chenille> lesObjets = listeDesChenilles.iterator();
 
        while (lesObjets.hasNext()) {
            Chenille objCour = lesObjets.next();
            objCour.dessiner(g);
        }
    }    
} // Dessin
