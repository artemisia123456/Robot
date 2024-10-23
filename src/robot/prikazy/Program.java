/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot.prikazy;

import java.util.ArrayList;
import robot.Plocha;

/**
 *
 * @author Artemisia
 */
public class Program {

    private Plocha p;
    private ArrayList <IPrikaz> prikaze = new ArrayList <IPrikaz> ();
    
    public Program (){ 
        //p = new Plocha ();
    }
    
    public void pridajPrikaz (IPrikaz prikaz){
        prikaze.add(prikaz);
    }
    
    public void spusti (Plocha p){
        for (IPrikaz iPrikaz : prikaze) {
            iPrikaz.vykonaj(p.dajRobota());    
        }p.vypis(); 
    }
    
}
