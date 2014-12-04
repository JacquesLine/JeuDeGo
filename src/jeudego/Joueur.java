/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

/**
 *
 * @author cbrandon
 */
public class Joueur {
    private final String couleur;
    
    public Joueur(String c){
        this.couleur=c;
    }
    
    @Override
    public String toString(){
        return "Je suis le joueur de couleur "+couleur+".";
    }
    
    public String getCouleur(){
        return couleur;
    }
    
}
