/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jeudego;

import java.util.ArrayList;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Utilisateur
 */
public class PointTest {
    
    public PointTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getx and setx methods, of class Point.
     */
    @Test
    public void testx() {
        Point point = new Point(0,0);
        point.setx(5);
        assertEquals(5,point.getx());
    }

    /**
     * Test of gety and sety method, of class Point.
     */
    @Test
    public void testGety() {
        Point point = new Point(0,0);
        point.sety(5);
        assertEquals(5,point.gety());
    }

   


    /**
     * Test of setpos method, of class Point.
     */
    @Test
    public void testSetpos() {
        Point point = new Point(0,0);
        point.setpos(5,10);
        assertEquals(5,point.getx());
        assertEquals(10,point.gety());
    }

    /**
     * Test of toString method, of class Point.
     */
    @Test
    public void testToString() {
        (new Point(0,0)).toString();
    }

    /**
     * Test of equals method, of class Point.
     */
    @Test
    public void testEquals() {
        
    }

    /**
     * Test of liberte method, of class Point.
     */
    @Test
    public void testLiberte() {
        PlateauJeu plateau = new PlateauJeu();
        Point pointtest = new Point(5,5);
        Point point1 = new Point(5,5);
        Point point2 = new Point(4,5);
        Point point3 = new Point(5,4);
        Point point4 = new Point(6,5);
        Point point5 = new Point(5,6);
        
        plateau.getBlanc().add(pointtest);
        
        assertEquals(pointtest.liberte(plateau),true);
        plateau.getNoir().add(point2);
        assertEquals(pointtest.liberte(plateau),true);
        plateau.getNoir().clear();
        
        assertEquals(pointtest.liberte(plateau),true);
        plateau.getNoir().add(point3);
        assertEquals(pointtest.liberte(plateau),true);
        plateau.getNoir().clear();
        
        assertEquals(pointtest.liberte(plateau),true);
        plateau.getNoir().add(point4);
        assertEquals(pointtest.liberte(plateau),true);
        plateau.getNoir().clear();
        
        assertEquals(pointtest.liberte(plateau),true);
        plateau.getNoir().add(point5);
        assertEquals(pointtest.liberte(plateau),true);
        plateau.getNoir().clear();
        
        plateau.getNoir().add(point2);
        plateau.getNoir().add(point3);
        plateau.getNoir().add(point4);
        plateau.getNoir().add(point5);
        
        assertEquals(pointtest.liberte(plateau),false);
        
        
        
    }

    /**
     * Test of casesLibres method, of class Point.
     */
    @Test
    public void testCasesLibres() {
        
        PlateauJeu plateau = new PlateauJeu();
        Point pointtest = new Point(5,5);
        Point point1 = new Point(5,5);
        Point point2 = new Point(4,5);
        Point point3 = new Point(5,4);
        Point point4 = new Point(6,5);
        Point point5 = new Point(5,6);
        
        plateau.getBlanc().add(pointtest);
        
        assertEquals(pointtest.casesLibres(plateau).size(), 4 );
        plateau.getNoir().add(point2);
        assertEquals(pointtest.casesLibres(plateau).size(),3);
        if(pointtest.casesLibres(plateau).size() == 3)
        {
        assertTrue( (   pointtest.casesLibres(plateau).get(0).equals(point5)
                        || pointtest.casesLibres(plateau).get(0).equals(point4)
                        || pointtest.casesLibres(plateau).get(0).equals(point3))
                   &&(  pointtest.casesLibres(plateau).get(1).equals(point5)
                        || pointtest.casesLibres(plateau).get(1).equals(point4)
                        || pointtest.casesLibres(plateau).get(1).equals(point3))
                   &&(  pointtest.casesLibres(plateau).get(2).equals(point5)
                        || pointtest.casesLibres(plateau).get(2).equals(point4)
                        || pointtest.casesLibres(plateau).get(2).equals(point3)));
        }
        plateau.getNoir().clear();
        
        assertEquals(pointtest.casesLibres(plateau).size(), 4 );
        plateau.getNoir().add(point3);
        assertEquals(pointtest.casesLibres(plateau).size(),3);
        if(pointtest.casesLibres(plateau).size() == 3)
        {
        assertTrue( (   pointtest.casesLibres(plateau).get(0).equals(point5)
                        || pointtest.casesLibres(plateau).get(0).equals(point4)
                        || pointtest.casesLibres(plateau).get(0).equals(point2))
                   &&(  pointtest.casesLibres(plateau).get(1).equals(point5)
                        || pointtest.casesLibres(plateau).get(1).equals(point4)
                        || pointtest.casesLibres(plateau).get(1).equals(point2))
                   &&(  pointtest.casesLibres(plateau).get(2).equals(point5)
                        || pointtest.casesLibres(plateau).get(2).equals(point4)
                        || pointtest.casesLibres(plateau).get(2).equals(point2)));
        }
        plateau.getNoir().clear();
        
         assertEquals(pointtest.casesLibres(plateau).size(), 4 );
        plateau.getNoir().add(point4);
        assertEquals(pointtest.casesLibres(plateau).size(),3);
        if(pointtest.casesLibres(plateau).size() == 3)
        {
        assertTrue( (   pointtest.casesLibres(plateau).get(0).equals(point5)
                        || pointtest.casesLibres(plateau).get(0).equals(point2)
                        || pointtest.casesLibres(plateau).get(0).equals(point3))
                   &&(  pointtest.casesLibres(plateau).get(1).equals(point5)
                        || pointtest.casesLibres(plateau).get(1).equals(point2)
                        || pointtest.casesLibres(plateau).get(1).equals(point3))
                   &&(  pointtest.casesLibres(plateau).get(2).equals(point5)
                        || pointtest.casesLibres(plateau).get(2).equals(point2)
                        || pointtest.casesLibres(plateau).get(2).equals(point3)));
        }
        plateau.getNoir().clear();
        
         assertEquals(pointtest.casesLibres(plateau).size(), 4 );
        plateau.getNoir().add(point5);
        assertEquals(pointtest.casesLibres(plateau).size(),3);
        if(pointtest.casesLibres(plateau).size() == 3)
        {
        assertTrue( (   pointtest.casesLibres(plateau).get(0).equals(point2)
                        || pointtest.casesLibres(plateau).get(0).equals(point4)
                        || pointtest.casesLibres(plateau).get(0).equals(point3))
                   &&(  pointtest.casesLibres(plateau).get(1).equals(point2)
                        || pointtest.casesLibres(plateau).get(1).equals(point4)
                        || pointtest.casesLibres(plateau).get(1).equals(point3))
                   &&(  pointtest.casesLibres(plateau).get(2).equals(point2)
                        || pointtest.casesLibres(plateau).get(2).equals(point4)
                        || pointtest.casesLibres(plateau).get(2).equals(point3)));
        }
        plateau.getNoir().clear();
    }
    
}
