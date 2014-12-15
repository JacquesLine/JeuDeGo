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
    
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    public Point (Point p){
        this.x=p.x;
        this.y=p.y;
    }
    
    public int getx(){
        return x;
    }
    
    public int gety(){
        return y;
    }
    
    public void setx(int x){
        this.x = x;
    }
    
    public void sety(int y){
        this.y=y;
    }
    
    public void setpos(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    @Override
    public String toString(){
        return "Je suis un point en ["+x+","+y+"].";
    }
    
    public int liberté(PlateauJeu pl){
        Point p1=new Point(x+1,y);
        Point p2=new Point(x-1,y);
        Point p3=new Point(x,y+1);
        Point p4=new Point(x,y-1);
        int S=0;
        if(pl.pointLibre(p1)){S++;};
        if(pl.pointLibre(p2)){S++;};
        if(pl.pointLibre(p3)){S++;};
        if(pl.pointLibre(p4)){S++;};
        
        return S;
    }
    
    public ArrayList<Point> casesLibres(PlateauJeu pl){
        Point p1=new Point(x+1,y);
        Point p2=new Point(x-1,y);
        Point p3=new Point(x,y+1);
        Point p4=new Point(x,y-1);
        ArrayList<Point> liste = new ArrayList<Point>();
        
        if(pl.pointLibre(p1)){liste.add(p1);};
        if(pl.pointLibre(p2)){liste.add(p2);};
        if(pl.pointLibre(p3)){liste.add(p3);};
        if(pl.pointLibre(p4)){liste.add(p4);};
        
        return liste;
    }
    
}
