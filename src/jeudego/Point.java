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
    
    public boolean estegal(Point po){
        boolean a;
        if(this.x==po.getx() && this.y==po.gety()){
            a=true;
        } else{a=false;
              }
        return a;
    }
    
    public boolean liberte(PlateauJeu pl){
        Point p1=new Point(x+1,y);
        Point p2=new Point(x-1,y);
        Point p3=new Point(x,y+1);
        Point p4=new Point(x,y-1);
        boolean a=false;
        if(pl.pointLibre(p1,null)){
            a=true;};
        if(pl.pointLibre(p2,null)){
            a=true;
        };
        if(pl.pointLibre(p3,null)){
            a=true;
        };
        if(pl.pointLibre(p4,null)){
            a=true;
        };
        
        return a;
    }
    
    public List<Point> casesLibres(PlateauJeu pl){
        Point p1=new Point(x+1,y);
        Point p2=new Point(x-1,y);
        Point p3=new Point(x,y+1);
        Point p4=new Point(x,y-1);
        ArrayList<Point> liste = new ArrayList<Point>();
        
        if(pl.pointLibre(p1,null)){
            liste.add(p1);
        };
        if(pl.pointLibre(p2,null)){
            liste.add(p2);
        };
        if(pl.pointLibre(p3,null)){
            liste.add(p3);
        };
        if(pl.pointLibre(p4,null)){
            liste.add(p4);
        };
        
        return liste;
    }
    
}
