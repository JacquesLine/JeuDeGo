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
        this.joueur1 = new Joueur("blanc");
        this.joueur2 = new Joueur("noir");
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
     * Method to determine if the point is empty (true) or not (false)
     *
     * @param point
     * @return boolean res
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

    public boolean pointLibreBlanc(Point point) {
        boolean res = true;
        for (int i = 0; i < blanc.size(); i++) {
            if (this.getBlanc().get(i) == point) {
                res = false;

            }
        }
        return res;
    }

    public boolean pointLibreNoir(Point point) {
        boolean res = true;
        for (int i = 0; i < noir.size(); i++) {
            if (this.getNoir().get(i) == point) {
                res = false;
            }
        }
        return res;
    }

    /**
     * Method to determine if there is a suicide (false) or not (true)
     *
     * @param point
     * @return
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

    public void miseAJour(Joueur A) {
    }
}
