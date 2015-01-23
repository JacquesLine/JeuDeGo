/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jeudego;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Utilisateur
 */
public class PionTest {
    
    
    
    public PionTest() {
        PlateauJeu plateau = new PlateauJeu();
        Point point = new Point(0,0);
        Pion pion = new Pion(point, "noir", plateau);
        assertNotNull(pion);
    }

    /**
     * Test of getpos and setpos methods, of class Pion.
     */
    @Test
    public void testpos() {
        PlateauJeu plateau = new PlateauJeu();
        Point point = new Point(0,0);
        Pion pion = new Pion(point, "noir", plateau);
        
        pion.setpos(new Point(1,2));
        assertTrue(pion.getpos().getx() == 1 && pion.getpos().gety() == 2);
    }

    /**
     * Test of getColor and setColor methods, of class Pion.
     */
    @Test
    public void testColor() {
        PlateauJeu plateau = new PlateauJeu();
        Point point = new Point(0,0);
        Pion pion = new Pion(point, "noir", plateau);
        
        pion.setColor("blanc");
        assertEquals("blanc", pion.getColor());
    }

    /**
     * Test of getPlateau and setPlateau methods, of class Pion.
     */
    @Test
    public void testGetPlateau() {
        
        PlateauJeu plateau = new PlateauJeu();
        Point point = new Point(0,0);
        Pion pion = new Pion(point, "noir", plateau);
        
        pion.setPlateau(new PlateauJeu(50));
        assertEquals(pion.getPlateau().getTaille(), 50);
    }

    

    /**
     * Test of getGroupe method, of class Pion.
     */
    @Test
    public void testGetGroupe() {
        PlateauJeu plateau = new PlateauJeu();
        Point point = new Point(0,0);
        Pion pion = new Pion(point, "noir", plateau);
        Groupe group = new Groupe("noir");
        
        pion.setGroupe(group);
        assertEquals(pion.getGroupe().getCouleur(), "noir");
    }

    /**
     * Test of setGroupe method, of class Pion.
     */
    @Test
    public void testSetGroupe() {
    }
    
}
