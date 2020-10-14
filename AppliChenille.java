import javax.swing.JFrame;
import javax.swing.WindowConstants;
/**
* Animation d'une chenille dans une fenêtre graphique.
* Une chenille est dessiné à l'intérieur d'une fenêtre et se déplace. Chaque fois
* que l'un des bords est atteint, la chenille change de direction.
*/
 
public class AppliChenille {
 
   public static void main(String[] args) {
 
       // La fenêtre graphique.
       JFrame laFenetre = new JFrame("Animation Chenille");
       laFenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       laFenetre.setSize(512, 512);
 
       // Créé la zone de dessin et la place dans la fenêtre.
       Dessin d = new Dessin();
       laFenetre.add(d);
 
       // Affiche la fenêtre.
       laFenetre.setVisible(true);
 
       // Création d'un objet Chenille.
       Chenille c1 = new Chenille(8, d);
       Chenille c2 = new Chenille(8, d);
       Chenille c3 = new Chenille(8, d);
 
       // On rajoute cet objet à la zône de dessin.
       d.ajouterObjet(c1);
       d.ajouterObjet(c2);
       d.ajouterObjet(c3);
 
       // La boucle d'animation.
       // C'est une boucle infinie, le programme devra être interrompu
       // par CTRL-C ou en cliquant dans le cas de fermeture de la fenêtre.
       while (true) {
           // La chenille effectue un déplacement élémentaire.
           c1.deplacer();
           c2.deplacer();
           c3.deplacer();
 
           // La zone de dessin se réaffiche.
           d.repaint();
 
           // Un temps de pause pour avoir le temps de voir le nouveau dessin.
           d.pause(50);
       }
   }
}   // AppliChenille



