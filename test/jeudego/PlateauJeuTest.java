/*
 *JeuDeGo is a library dedicated to the reproduction of a game of go
 *
 * This library is developed at Ecole Centrales de Nantes as part of a practical
 * project.
 *
 * JeuDeGo is a free software: you can redistribute it and/or modify it.
 */
package jeudego;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Charles Brandon
 * @author Roman Krakoviak
 * @author Guillaume Vedeau
 * @author Valentin Vielzeuf
 */
public class PlateauJeuTest {

    public PlateauJeuTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
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
}
/**
 * Test of suicide method, of class PlateauJeu.
 */
