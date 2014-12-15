/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vvielzeu
 */
public class PlateauJeu {

    private List<Point> blanc;
    private List<Point> noir;
    private Point tourPrecedent;
    private boolean captureAuTourPrecedent;
    private int taille;
    private Joueur joueur1;
    private Joueur joueur2;

    /**
     * Constructeur de base
     *
     * @param taille
     */
    public PlateauJeu(int taille) {
        this.taille = taille;
        this.blanc = new ArrayList<Point>();
        this.noir = new ArrayList<Point>();
        this.tourPrecedent = new Point(1,1);
        this.captureAuTourPrecedent=false;
        this.joueur1 = new Joueur("blanc");
        this.joueur2 = new Joueur("noir");
    }
    
    public PlateauJeu(PlateauJeu plateau){
    	this.taille=plateau.taille;
    	this.blanc=plateau.blanc;
    	this.noir=plateau.noir;
        this.tourPrecedent = new Point(1,1);
        this.captureAuTourPrecedent=false;
    	this.joueur1=plateau.joueur1;
    	this.joueur2=this.joueur2;
    	
    		
    }

    /*
     * constructeur par defaut
     */
    public PlateauJeu() {
        this.taille = 9;
        this.blanc = new ArrayList<Point>();
        this.noir = new ArrayList<Point>();
        this.joueur1 = new Joueur("blanc");
        this.joueur2 = new Joueur("noir");
    }

    /**
     * Get the value of taille
     *
     * @return the value of taille
     */
    public int getTaille() {
        return taille;
    }

    /**
     * Set the value of taille
     *
     * @param taille new value of taille
     */
    public void setTaille(int taille) {
        this.taille = taille;
    }

    /**
     * Get the value of Noir
     *
     * @return the value of Noir
     */
    public List<Point> getNoir() {
        return noir;
    }

    /**
     * Set the value of Noir
     *
     * @param noir new value of Noir
     */
    public void setNoir(List<Point> noir) {
        this.noir = noir;
    }

    /**
     * Get the value of blanc
     *
     * @return the value of blanc
     */
    public List<Point> getBlanc() {
        return blanc;
    }

    /**
     * Set the value of blanc
     *
     * @param blanc new value of blanc
     */
    public void setBlanc(List<Point> blanc) {
        this.blanc = blanc;
    }

    public Point getTourPrecedent() {
        return tourPrecedent;
    }

    public void setTourPrecedent(Point tourPrecedent) {
        this.tourPrecedent = tourPrecedent;
    }

    public boolean isCaptureAuTourPrecedent() {
        return captureAuTourPrecedent;
    }

    public void setCaptureAuTourPrecedent(boolean captureAuTourPrecedent) {
        this.captureAuTourPrecedent = captureAuTourPrecedent;
    }
    
    public Joueur getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
    }

    /**
     * Method to determine if the point is empty
     *
     * @param point
     * @return <pre>true</pre> if point is empty, else <pre>false</pre>
     */
    public boolean pointLibre(Point point) {
        boolean res = true;
        for (int i = 0; i < blanc.size(); i++) {
            if (this.getBlanc().get(i) == point) {
                res = false;
            }
        }
        for (int i = 0; i < noir.size(); i++) {
            if (this.getNoir().get(i) == point) {
                res = false;
            }
        }
        return res;
    }

    /**
     * Method to determine if the point is empty of a determinate color
     *
     * @param point,couleur
     * @return <pre>true</pre> if point is empty of white, else <pre>false</pre>
     */
    public boolean pointLibreCouleur(Point point, String couleur) {
        boolean res = true;
        List<Point> pionsCouleur;
        if(couleur.equals("blanc")){
            pionsCouleur=blanc;
        }
        else{pionsCouleur=noir;}
        
        for (int i = 0; i < pionsCouleur.size(); i++) {
            if (pionsCouleur.get(i).equals(point)) {
                res = false;

            }
        }
        return res;
    }

    /**
     * Method to determine if there is a suicide 
     *
     * @param point
     * @return <pre>false</pre> if suicide, else <pre>false</pre>
     */
    public boolean suicide(Point point) {
        boolean res = false;

        Point A = new Point(point.getx(), point.gety() + 1);
        Point D = new Point(point.getx() - 1, point.gety());
        Point F = new Point(point.getx(), point.gety() - 1);
        Point H = new Point(point.getx() + 1, point.gety());

        if (this.pointLibre(A)) {
            res = true;
        }

        if (this.pointLibre(D)) {
            res = true;
        }

        if (this.pointLibre(F)) {
            res = true;
        }


        if (this.pointLibre(H)) {
            res = true;
        } else {
        }
        return res;
    }
    
    /**
     * Method to determine if an precedent configuration come back
     *
     * @param point
     * @param couleur 
     * @return
     */
    public boolean ko(Point point, String couleur){
        boolean voisin = false;
        if (this.isCaptureAuTourPrecedent()==true){
            if (this.getTourPrecedent().getx()==point.getx() && (this.getTourPrecedent().gety()-point.gety()==-1 || this.getTourPrecedent().gety()-point.gety()==1)){
                voisin = true;          
            } else if (this.getTourPrecedent().gety()==point.gety() && (this.getTourPrecedent().getx()-point.getx()==-1 || this.getTourPrecedent().getx()-point.getx()==1)){
                voisin = true;
            }
        } 
        if(voisin){
            Point A = new Point(point.getx() + 1, point.gety() );
            Point B = new Point(point.getx(), point.gety() + 1);
            Point C = new Point(point.getx() - 1, point.gety() );
            Point D = new Point(point.getx(), point.gety() - 1);
            if (couleur.contains("blanc")){
                if(this.pointLibreCouleur(A,"noir") && this.pointLibreCouleur(B,"noir") && this.pointLibreCouleur(C,"noir") && this.pointLibreCouleur(D,"noir")){
                    return false;
                }
            }
            if (couleur.contains("noir")){
                if(this.pointLibreCouleur(A,"blanc") && this.pointLibreCouleur(B,"blanc") && this.pointLibreCouleur(C,"blanc") && this.pointLibreCouleur(D,"blanc")){
                    return false;
                }
            }
        }
        return true;    
    }
    
    public PlateauJeu tourDeJeu(Joueur A){
    	System.out.println("C'est au tour du joueur "+A.getCouleur()+" de jouer");
    	PlateauJeu futur=new PlateauJeu(this);
    	A.jouer(futur);
    	if (futur.suicide()) {return futur;}
    	else {if (futur.ko()) {return futur;}
    	      else {System.out.println("Ce coup est impossible");
    	            return this;}
    	      }
    	
    	
    }

    public void miseAJour(Joueur A) {
    }
}
