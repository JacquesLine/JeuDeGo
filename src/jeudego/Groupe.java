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
        private String couleur;

    /**
     * Get the value of couleur
     *
     * @return the value of couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * Set the value of couleur
     *
     * @param couleur new value of couleur
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
     * constructeur de Groupe complet
     * @param c
     * @param l 
     */
    public Groupe(String c,List l){
        this.pions=l;
        this.couleur=c;
    }
    
    /**
     * constructeur de Groupe vide
     * @param c 
     */
    public Groupe(String c){
        this.pions=new ArrayList<Pion>();
        this.couleur=c;
    }
    
    /**
     * constructeur de nouveaux groupes
     * @param pion 
     */
    public Groupe(Pion pion){
        this.pions = new ArrayList<>();
        this.pions.add(pion);
        this.couleur= pion.getColor();
        
    }
    
    public List<Pion> getPions(){
        return pions;
    }
    
    public void ajouter(Pion p){
    	this.pions.add(p);
    }
    
    public boolean liberte (PlateauJeu pl){
        boolean a = false;
        for(Pion pion : pions){
            if(pion.getpos().liberte(pl)){
                a=true;
            }
        }
        return a;
    }
    
    /**
     * regroupe 2 groupes de pions en 1 seul
     * @param a
     * @param b
     * @return 
     */
    public Groupe fusion(Groupe a, Groupe b){
    	Groupe c=new Groupe(a.getCouleur());
<<<<<<< HEAD
    	for (Pion pion:a.getPions()) {c.getPions().add(pion);
        }
    	for (Pion pion:b.getPions()) {c.getPions().add(pion);
=======
    	for (Pion pion:a.getPions()) {
            c.getPions().add(pion);
        }
    	for (Pion pion:b.getPions()) {
            c.getPions().add(pion);
>>>>>>> 884732ca9b4cd736a7c9ddb1352ecbef8509b0be
        }
    	return c;
    	
    }
    /**
     * 
     * @param pl
     * @return 
     */
    public List<Point> casesLibres (PlateauJeu pl){
        ArrayList<Point> liste = new ArrayList<Point>();
        liste.add(pions.get(0).getpos().casesLibres(pl).get(0));
        
        for (Pion pion : pions){
            for (Point caseLibre : pion.getpos().casesLibres(pl)){
                for (Point element : liste){
                    
                    if (element.estegal(caseLibre)){
                        System.out.println("Point déjà dans la liste");
                    }
<<<<<<< HEAD
                     else{liste.add(caseLibre);
                     }
=======
                    else{
                        liste.add(caseLibre);
                    }
>>>>>>> 884732ca9b4cd736a7c9ddb1352ecbef8509b0be
                }
                
            }
        }
        return liste;
    }
}
