/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vvielzeu
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
     * Test of pointLibre method, of class PlateauJeu.
     */
    @Test
    public void testPointLibre() {
        System.out.println("pointLibre");
        Point point =null;
        point.setx(0);
        point.sety(0);
        PlateauJeu instance = new PlateauJeu();
        boolean expResult = true;
        boolean result = instance.pointLibre(point);
        assertEquals(expResult, result);
    }

    /**
     * Test of pointLibreBlanc method, of class PlateauJeu.
     */
    @Test
    public void testPointLibreBlanc() {
        System.out.println("pointLibreBlanc");
        Point point =null;
        point.setx(0);
        point.sety(0);
        PlateauJeu instance = new PlateauJeu();
        boolean expResult = true;
        boolean result = instance.pointLibreBlanc(point);
        assertEquals(expResult, result);
    }

    /**
     * Test of pointLibreNoir method, of class PlateauJeu.
     */
    @Test
    public void testPointLibreNoir() {
        System.out.println("pointLibreNoir");
        Point point =null;
        point.setx(0);
        point.sety(0);
        PlateauJeu instance = new PlateauJeu();
        boolean expResult = true;
        boolean result = instance.pointLibreNoir(point);
        assertEquals(expResult, result);
    }
}
    /**
     * Test of suicide method, of class PlateauJeu.
     */
