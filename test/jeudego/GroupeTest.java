/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jeudego;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Utilisateur
 */
public class GroupeTest {
    
    public GroupeTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCouleur and setCouleur methods, of class Groupe.
     */
    @Test
    public void testCouleur() {
        Groupe groupe = new Groupe("noir");
        groupe.setCouleur("blanc");
        groupe.getCouleur();
        assertEquals("blanc",groupe.getCouleur());
        
    }



    /**
     * Test of getPions method, of class Groupe.
     */
    @Test
    public void testGetPions() {
       
    }

    /**
     * Test of ajouter method, of class Groupe.
     */
    @Test
    public void testAjouter() {
    }

    /**
     * Test of liberte method, of class Groupe.
     */
    @Test
    public void testLiberte() {
    }

    /**
     * Test of fusion method, of class Groupe.
     */
    @Test
    public void testFusion() {
    }

    /**
     * Test of casesLibres method, of class Groupe.
     */
    @Test
    public void testCasesLibres() {
    }
    
}
