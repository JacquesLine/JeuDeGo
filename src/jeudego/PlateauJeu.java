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
    private List<Point> Noir;
    private int taille = 1;

    /**
     * Constructeur de base
     *
     * @param taille
     */
    public PlateauJeu(int taille) {
        this.taille = taille;
    }

    /*
     * constructeur par defaut
     */
    public PlateauJeu() {
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
        return Noir;
    }

    /**
     * Set the value of Noir
     *
     * @param Noir new value of Noir
     */
    public void setNoir(List<Point> Noir) {
        this.Noir = Noir;
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
}