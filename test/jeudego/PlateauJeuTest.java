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
