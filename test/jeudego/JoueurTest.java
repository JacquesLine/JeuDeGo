/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cbrandon
 */
public class JoueurTest {
    
    public JoueurTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of toString method, of class Joueur.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Joueur instance = new Joueur("blanc");;
        String expResult = "Je suis le joueur de couleur blanc.";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCouleur method, of class Joueur.
     */
    @Test
    public void testGetCouleur() {
        System.out.println("getCouleur");
        Joueur instance = new Joueur("blanc");
        String expResult = "blanc";
        String result = instance.getCouleur();
        assertEquals(expResult, result);
    }

    /**
     * Test of Jouer method, of class Joueur.
     */
    @Test
    public void testJouer() {
        System.out.println("Jouer");
        PlateauJeu pl = new PlateauJeu();
        pl.getNoir().add(new Point(3,3));
        pl.getNoir().add(new Point(2,4));
        pl.getNoir().add(new Point(4,4));
        pl.getNoir().add(new Point(3,5));
        Joueur instance = new Joueur("blanc");
        
        
        Point expResult = new Point(1,1);
        File file = new File("testjoueur.txt");
        FileInputStream in = null;
        try {in = new FileInputStream(file);}
        catch (IOException e) {e.printStackTrace();}
        
        System.setIn(in);
        Point result = instance.Jouer(pl,in);
        assertEquals(expResult, result);
    }
}