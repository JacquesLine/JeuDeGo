/*
 *JeuDeGo is a library dedicated to the reproduction of a game of go
 *
 * This library is developed at Ecole Centrales de Nantes as part of a practical
 * project.
 *
 * JeuDeGo is a free software: you can redistribute it and/or modify it.
 */

package jeudego;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Charles Brandon
 * @author Roman Krakoviak
 * @author Guillaume Vedeau
 * @author Valentin Vielzeuf
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
