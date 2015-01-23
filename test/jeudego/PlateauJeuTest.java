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
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Charles Brandon
 * @author Roman Krakoviak
 * @author Guillaume Vedeau
 * @author Valentin Vielzeuf
 */
public class PlateauJeuTest {

    /**
     * test des constructeurs et setteurs
     */
    public PlateauJeuTest() {
        PlateauJeu plateau = new PlateauJeu();
        plateau.setTaille(12);
        assertEquals(plateau.getTaille(), 12);
        
        Point bl = new Point(1,1);
        Point no = new Point(2,2);
        ArrayList<Point> pblanc = new ArrayList<>();
        ArrayList<Point> pnoir = new ArrayList<>();
        pnoir.add(no);
        pblanc.add(bl);
        plateau.setBlanc(pblanc);
        plateau.setNoir(pnoir);
        plateau.setJoueur1(new Joueur("noir"));
        plateau.setJoueur2(new Joueur("blanc"));
        
         assertEquals(plateau.getJoueur1().getCouleur(), "noir");
         assertEquals(plateau.getJoueur2().getCouleur(), "blanc");
        
         plateau.setCaptureAuTourPrecedent(true);
         assertTrue(plateau.isCaptureAuTourPrecedent());
         
         plateau.setTourPrecedent(new Point(5,6));
         assertTrue(plateau.getTourPrecedent().getx() == 5 && plateau.getTourPrecedent().gety() == 6);
         
         
    }


    /**
     * Test of pointLibreBlanc method, of class PlateauJeu.
     */
    @Test
    public void testPointLibre() {
        System.out.println("pointLibre");
        Point point = new Point(0,0);
        String couleur = "blanc";
        PlateauJeu instance = new PlateauJeu();
        boolean expResult = true;
        boolean result = instance.pointLibre(point, couleur);
        assertEquals(expResult, result);
        
        
    }

    

    /**
     * Test of addNoir method, of class PlateauJeu.
     */
    @Test
    public void testAddNoir() {
    }

    /**
     * Test of addBlanc method, of class PlateauJeu.
     */
    @Test
    public void testAddBlanc() {
    }


    /**
     * Test of suicide method, of class PlateauJeu.
     */
    @Test
    public void testSuicide() {
    }

    /**
     * Test of ko method, of class PlateauJeu.
     */
    @Test
    public void testKo() {
    }

    /**
     * Test of miseAJour method, of class PlateauJeu.
     */
    @Test
    public void testMiseAJour() {
    }
}
/**
 * Test of suicide method, of class PlateauJeu.
 */
