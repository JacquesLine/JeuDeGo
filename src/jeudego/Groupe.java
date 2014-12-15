/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cbrandon
 */
public class Groupe {
    private List<Point> pions;
    private final String couleur;
    
    public Groupe(String c,List l){
        this.pions=l;
        this.couleur=c;
    }
    
    public Groupe(String c){
        this.pions=new ArrayList<Point>();
        this.couleur=c;
    }
    
    public String getCouleur(){
        return couleur;
    }
    
    public List<Point> getPions(){
        return pions;
    }
    
    public void ajouter(Point p){
    	this.pions.add(p);
    }
}
