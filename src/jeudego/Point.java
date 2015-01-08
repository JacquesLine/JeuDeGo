/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import java.util.ArrayList;

/**
 *
 * @author cbrandon
 */
public class Point {
    private int x;
    private int y;
    
    /**
     * constructeur basé sur les coordonnées
     * @param x
     * @param y 
     */
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    /**
     * constructeur basé sur la copie d'un point existant
     * @param p 
     */
    public Point (Point p){
        this.x=p.x;
        this.y=p.y;
    }
    
    /**
     * constructeur par defaut: point de coordonnées 0 0
     */
    public Point (){
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * getteur du parametre x
     * @return 
     */
    public int getx(){
        return x;
    }
    
    /**
     * getteur du parametre y
     * @return 
     */
    public int gety(){
        return y;
    }
    
    /**
     * setteur du parametre x
     * @param x 
     */
    public void setx(int x){
        this.x = x;
    }
    
    /**
     * setteur du parametre y
     * @param y 
     */
    public void sety(int y){
        this.y=y;
    }
    
    /**
     * 
     * @param x
     * @param y 
     */
    public void setpos(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    /**
     * overwrite de la métode toString
     */
    public String toString(){
        return "Je suis un point en ["+x+","+y+"].";
    }
    /**
     * Compare les coordonnées du point avec celles du point po
     * @param po point avec lequel on compare
     * @return 
     */
    public boolean equals(Point po){
        return((this.getx()==po.getx())&&(this.gety()==po.gety()));
    }
    
    /**
     * cherche si les cases directement juxtaposées sont occupé ou non
     * @param pl plateau de jeu actuel
     * @return 
     */
    public boolean liberte(PlateauJeu pl){
        Point p1=new Point(x+1,y);
        Point p2=new Point(x-1,y);
        Point p3=new Point(x,y+1);
        Point p4=new Point(x,y-1);
        
        return (pl.pointLibre(p1,"tout")||pl.pointLibre(p2,"tout") ||pl.pointLibre(p3,"tout") ||pl.pointLibre(p4,"tout"));
    }
    
    /**
     * pareil que liberté, mais renvoie la liste des emplacements libres plutôt que leur existence
     * @param pl plateau de jeu
     * @return liste liste de cases libres autour du point
     */
    public ArrayList<Point> casesLibres(PlateauJeu pl){
        Point p1=new Point(x+1,y);
        Point p2=new Point(x-1,y);
        Point p3=new Point(x,y+1);
        Point p4=new Point(x,y-1);
        ArrayList<Point> liste = new ArrayList<Point>();
        
        if(pl.pointLibre(p1,"tout")){liste.add(p1);};
        if(pl.pointLibre(p2,"tout")){liste.add(p2);};
        if(pl.pointLibre(p3,"tout")){liste.add(p3);};
        if(pl.pointLibre(p4,"tout")){liste.add(p4);};
        
        return liste;
    }
    
}
