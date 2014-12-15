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
    private List<Pion> pions;
    private final String couleur;
    
    public Groupe(String c,List l){
        this.pions=l;
        this.couleur=c;
    }
    
    public Groupe(String c){
        this.pions=new ArrayList<Pion>();
        this.couleur=c;
    }
    
    public String getCouleur(){
        return couleur;
    }
    
    public List<Pion> getPions(){
        return pions;
    }
    
    public void ajouter(Pion p){
    	this.pions.add(p);
    }
    
    public int liberte (PlateauJeu pl){
        int S=0;
        for(Pion pion : pions){
            S=S+pion.getpos().liberte(pl);
        }
        return S;
    }
    
    public Groupe fusion(Groupe a, Groupe b){
    	Groupe c=new Groupe(a.getCouleur());
    	for (Pion pion:a.getPions()) {c.getPions().add(pion);}
    	for (Pion pion:b.getPions()) {c.getPions().add(pion);}
    	return c;
    	
    }
    
    public ArrayList<Point> casesLibres (PlateauJeu pl){
        ArrayList<Point> liste = new ArrayList<Point>();
        liste.add(pions.get(0).getpos().casesLibres(pl).get(0));
        
        for (Pion pion : pions){
            for (Point caseLibre : pion.getpos().casesLibres(pl)){
                for (Point element : liste){
                    
                    if (element.equals(caseLibre)){
                        System.out.println("Point déjà dans la liste");
                    }
                    else{liste.add(caseLibre);}
                }
                
            }
        }
        return liste;
    }
}
