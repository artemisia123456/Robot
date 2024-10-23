/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robot;

import robot.prikazy.Krok;
import robot.prikazy.Poloz;
import robot.prikazy.Program;
import robot.prikazy.Vlavo;
import robot.prikazy.Vpravo;

/**
 *
 * @author Artemisia
 */
public class Robot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Program a = new Program ();
        Plocha p = new Plocha ();
        
        a.pridajPrikaz(new Poloz());
       //a.pridajPrikaz(new Vlavo());
       //a.pridajPrikaz(new Vpravo());
        a.pridajPrikaz(new Krok()); 
        a.pridajPrikaz(new Krok());
        a.pridajPrikaz(new Poloz());
        
        a.spusti(p);
    }
    
}
