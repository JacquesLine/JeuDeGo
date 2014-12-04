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

    private static int taille;
    public List<Point> blanc;
    public List<Point> noir;
    public List<Point> vide;

    /**
     * Constructeur de plateau
     *
     * @param l
     */
    public PlateauJeu(int l) {
        taille = l;
        blanc = new ArrayList<Point>();
        noir = new ArrayList<Point>();
        vide = new ArrayList<Point>();
    }
    
    /**
    * Accesseur
    * @return 
    */
    public int getTaille() {
        return taille;
    }
}
