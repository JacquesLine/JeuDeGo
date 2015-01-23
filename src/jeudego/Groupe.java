/*
 *JeuDeGo is a library dedicated to the reproduction of a game of go
 *
 * This library is developed at Ecole Centrales de Nantes as part of a practical
 * project.
 *
 * JeuDeGo is a free software: you can redistribute it and/or modify it.
 */
package jeudego;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Charles Brandon
 * @author Roman Krakoviak
 * @author Guillaume Vedeau
 * @author Valentin Vielzeuf
 */
public class Groupe {

    private List<Pion> pions;
    private String couleur;

    /**
     * Get the value of couleur
     *
     * @return the value of couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * Set the value of couleur
     *
     * @param couleur new value of couleur
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
     * constructeur de Groupe complet
     *
     * @param c
     * @param l
     */
    public Groupe(String c, List l) {
        this.pions = l;
        this.couleur = c;
    }

    /**
     * constructeur de Groupe vide
     *
     * @param c
     */
    public Groupe(String c) {
        this.pions = new ArrayList<Pion>();
        this.couleur = c;
    }

    /**
     * constructeur de nouveaux groupes
     *
     * @param pion
     */
    public Groupe(Pion pion) {
        this.pions = new ArrayList<>();
        this.pions.add(pion);
        this.couleur = pion.getColor();

    }

    public List<Pion> getPions() {
        return pions;
    }

    /**
     * ajoute un pion au groupe
     *
     * @param p
     */
    public void ajouter(Pion p) {
        this.pions.add(p);
    }

    public boolean liberte(PlateauJeu pl) {
        boolean a = false;
        for (Pion pion : pions) {
            if (pion.getpos().liberte(pl)) {
                a = true;
            }
        }
        return a;
    }

    /**
     * regroupe 2 groupes de pions en 1 seul
     *
     * @param a
     * @param b
     * @return
     */
    public static Groupe fusion(Groupe a, Groupe b) {
        Groupe c = new Groupe(a.getCouleur());

        for (Pion pion : a.getPions()) {
            c.getPions().add(pion);
        }
        for (Pion pion : b.getPions()) {
            c.getPions().add(pion);
        }

        return c;

    }

    /**
     * Recherche et renvoie la liste des cases libres autour d'un groupe de
     * pions
     *
     * @param pl
     * @return
     */
    public ArrayList<Point> casesLibres(PlateauJeu pl) {
        ArrayList<Point> liste = new ArrayList<Point>();

        for (Pion pion : pions) {
            for (Point caseLibre : pion.getpos().casesLibres(pl)) {
                if (!liste.contains(caseLibre)) {
                    liste.add(caseLibre);
                }
            }
        }
        return liste;
    }
}
