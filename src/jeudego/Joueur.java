/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import java.util.List;
import java.util.Scanner;

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
    
    public Point Jouer(PlateauJeu pl){
        Point po = new Point(0,0);
        
        System.out.println("Veuillez choisir une case du plateau /n x=");
        
        Scanner saisie=new Scanner(System.in);
        po.setx(saisie.nextInt());
        System.out.println("y=");
        po.sety(saisie.nextInt());
        
        if (pl.suicide(po)){
            return po;}
        else{
            System.out.println("Vous ne pouvez pas poser de pions sur cette case");
            return Jouer(pl);
        }
    }
    
}
