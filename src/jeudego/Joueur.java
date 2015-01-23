/*
 *JeuDeGo is a library dedicated to the reproduction of a game of go
 *
 * This library is developed at Ecole Centrales de Nantes as part of a practical
 * project.
 *
 * JeuDeGo is a free software: you can redistribute it and/or modify it.
 */
package jeudego;

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Charles Brandon
 * @author Roman Krakoviak
 * @author Guillaume Vedeau
 * @author Valentin Vielzeuf
 */
public class Joueur {

    private final String couleur;

    public Joueur(String c) {
        this.couleur = c;
    }

    @Override
    public String toString() {
        return "Je suis le joueur de couleur " + couleur + ".";
    }

    public String getCouleur() {
        return couleur;
    }

    public void jouer(PlateauJeu pl, InputStream in) {
        Point po = new Point(0, 0);

        System.out.println("Veuillez choisir une case du plateau /n x=");

        Scanner saisie = new Scanner(System.in);

        System.out.println("x=");
        po.setx(saisie.nextInt());
        System.out.println("y=");
        po.sety(saisie.nextInt());

        if (pl.pointLibre(po, null)) {
            if (this.getCouleur().equals("blanc")) {
                pl.getBlanc().add(po);
            } else {
                pl.getNoir().add(po);
            }
        } else {
            System.out.println("Vous ne pouvez pas poser de pions sur cette case");
        }
        saisie.close();
    }

}
