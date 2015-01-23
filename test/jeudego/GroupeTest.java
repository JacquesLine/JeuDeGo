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
import static java.util.Collections.list;
import java.util.List;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Charles Brandon
 * @author Roman Krakoviak
 * @author Guillaume Vedeau
 * @author Valentin Vielzeuf
 */
public class GroupeTest {
    
    public GroupeTest() {
        
        PlateauJeu plateau = new PlateauJeu();
        Pion pion = new Pion(new Point(0,0), "blanc", plateau);
        Groupe groupe = new Groupe("blanc");
        Groupe groupe2 = new Groupe(pion);
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
        PlateauJeu plateau = new PlateauJeu();
        Point point = new Point(5,5);
        Point point2 = new Point(10,10);
        Pion pion = new Pion(point,"noir", plateau);
        Pion pion2 = new Pion(point2,"noir", plateau);
        List<Pion> pions = new ArrayList<>();
        pions.add(pion);
        pions.add(pion2);
       Groupe groupe = new Groupe("noir",pions);
       
       assertNotNull(groupe.getPions());
       assertSame(groupe.getPions().get(0), pion);
       assertSame(groupe.getPions().get(1), pion2);
       Assert.assertNotSame(groupe.getPions().get(0), pion2);
       
    }

    /**
     * Test of ajouter method, of class Groupe.
     */
    @Test
    public void testAjouter() {
        PlateauJeu plateau = new PlateauJeu();
        Point point = new Point(5,5);
        Point point2 = new Point(10,10);
        Pion pion = new Pion(point,"noir", plateau);
        Pion pion2 = new Pion(point2,"noir", plateau);
        List<Pion> pions = new ArrayList<>();
        pions.add(pion);
       Groupe groupe = new Groupe("noir",pions);
       groupe.ajouter(pion2);
       
       assertSame(groupe.getPions().get(1), pion2);
    }

    /**
     * Test of liberte method, of class Groupe.
     */
    @Test
    public void testLiberte() {
        PlateauJeu plateau = new PlateauJeu();
        Point point = new Point(1,0);
        Point point2 = new Point(1,2);
        Point point3 = new Point(2,1);
        Point point4 = new Point(0,1);
        Point point5 = new Point(1,1);
        Pion pion = new Pion(point,"noir", plateau);
        Pion pion2 = new Pion(point2,"noir", plateau);
        Pion pion3 = new Pion(point3,"noir", plateau);
        Pion pion4 = new Pion(point4,"noir", plateau);
        Pion pion5 = new Pion(point5, "blanc", plateau);
        List<Point> pions = new ArrayList<>();
        List<Pion> pions2 = new ArrayList<>();
        pions.add(pion.getpos());
        pions.add(pion2.getpos());
        pions.add(pion3.getpos());
        plateau.setNoir(pions);
        
        pions2.add(pion5);
        
        Groupe group = new Groupe("blanc",pions2);
        assertTrue(group.liberte(plateau));
  
        pions.add(pion4.getpos());
        assertFalse(group.liberte(plateau));
    
    }

    /**
     * Test of fusion method, of class Groupe.
     */
    @Test
    public void testFusion() {
        PlateauJeu plateau = new PlateauJeu();
        Point point = new Point(1,1);
        Point point2 = new Point(1,2);
        Pion pion = new Pion(point,"noir", plateau);
        Pion pion2 = new Pion(point2,"noir", plateau);
        List<Pion> pions = new ArrayList<>();
        pions.add(pion);
        pions.add(pion2);
       Groupe groupe = new Groupe("noir",pions);
       
 
        Point point3 = new Point(2,1);
        Point point4 = new Point(2,2);
        Pion pion3 = new Pion(point3,"noir", plateau);
        Pion pion4 = new Pion(point4,"noir", plateau);
        List<Pion> pions2 = new ArrayList<>();
        pions2.add(pion3);
        pions2.add(pion4);
       Groupe groupe2 = new Groupe("noir",pions2);
       
       Groupe groupe3 = Groupe.fusion(groupe, groupe2);
       
       assertSame(groupe3.getPions().get(0), pion);
       assertSame(groupe3.getPions().get(1), pion2);
       assertSame(groupe3.getPions().get(2), pion3);
       assertSame(groupe3.getPions().get(3), pion4);
    }

    /**
     * Test of casesLibres method, of class Groupe.
     */
    @Test
    public void testCasesLibres() {
        PlateauJeu plateau = new PlateauJeu(9);
        Point point = new Point(5,5);
        Point point2 = new Point(5,6);
        Point point3 = new Point(6,6);
        Pion pion = new Pion(point,"noir", plateau);
        Pion pion2 = new Pion(point2,"noir", plateau);
        Pion pion3 = new Pion(point3,"blanc", plateau);
        
        List<Pion> pions = new ArrayList<>();
        pions.add(pion);
        pions.add(pion2);
        List<Pion> pions2 = new ArrayList<>();
        pions2.add(pion3);
        plateau.addNoir(pions);
        plateau.addBlanc(pions2);
        
        Groupe groupe1 = new Groupe("noir", pions);
        
        ArrayList<Point> liste = new ArrayList<>();
        liste = groupe1.casesLibres(plateau);
        
        assertTrue(liste.size() == 5);
        assertFalse(liste.contains(new Point(6,6)));
        
        
    }
    
}
