/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

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
    
}
