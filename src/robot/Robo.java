/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

/**
 *
 * @author Artemisia
 */
public class Robo {

    private int x;
    private int y;
    private Plocha p;
    private String smer;
    
    
    Robo (Plocha p){
        this.y = 9;
        this.x = 0;
        this.p = p;
        this.smer = "hore";
        
        
    }

    public String getSmer() {
        return smer;
    }

    public void setSmer(String smer) {
        this.smer = smer;
    }
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Plocha getP() {
        return p;
    }

    public void setP(Plocha p) {
        this.p = p;
    }
    
    
    public void vlavo (){
        if ("vpravo".equals(smer)){
            smer = "hore";
        } else if ("dole".equals(smer)){
            smer = "vpravo";
        }else if ("hore".equals(smer)){
            smer = "vlavo";
        }else {
            smer = "dole";
        }
    }
    
    public void vpravo (){
        if ("vpravo".equals(smer)){
            smer = "dole";
        } else if ("dole".equals(smer)){
            smer = "vlavo";
        }else if ("hore".equals(smer)){
            smer = "vpravo";
        }else {
            smer = "hore";
        }
        
    }
    
    public void krok (){
        if ( "vlavo".equals(smer)){
            x -=1;
        } else if ("vpravo".equals(smer)){
            x +=1;
        } else if ("hore".equals(smer)){
            y -=1;
        } else {
            y +=1;
        }
        
    }
    
    public void poloz (){
        p.poloz(this.x, this.y);
    }
    
    public void zdvihni (){
        p.zdvihni(this.x, this.y);
    }
}
