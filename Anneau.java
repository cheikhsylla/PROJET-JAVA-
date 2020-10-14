import java.awt.Graphics;

/**
* cree un Anneau en fixant sa position initiale et son rayon
* @param xInit abscisse du centre de l’anneau
* @param yInit ordonnee du centre de l’anneau
* @param r rayon de l’anneau
*/

public class Anneau{
    // Déclaration des Attribut de la classe Anneau .  
    protected int xInit;
    protected int yInit;
    protected int r ; 
    


        /* création du 1 er constructeur 
        *@param xInit abscisse du centre de l'anneau
        *@param yInit ordonnee du centre de l'anneau
        *@param r rayon de l'anneau
        */
        public Anneau(int xInit, int yInit, int r){
            this.xInit= xInit; // abcisse du centre de l'anneau
            this.yInit=yInit; // ordonné du centre de l'anneau
            this.r=r; // rayon du centre de l'anneau 
            
            }

        // on récupére et retourne x 
        public int getX(){
            return this.xInit;
        }

        
        // onn récupèure et retourne y 
        public int getY(){
            return this.yInit;
        }
        

        
        // positionne le centre de l’anneau en un point donné
        

        public void placerA(int px, int py){
            
            this.xInit=px;
            this.yInit=py;
        }
        
        
            

        /**
        *affiche l’anneau en le materialisant par un cercle noir
        *@param g objet de classe Graphics qui prend en charge la gestion
        *de l'affichage dans la fenetre de dessin
        */

        public void dessiner (Graphics g){
            g.drawOval(this.getX(), this.getY(), this.r, this.r);
       
       }
              
    }
