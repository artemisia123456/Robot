/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot.prikazy;

import robot.Robo;

/**
 *
 * @author Artemisia
 */
public class Vpravo implements IPrikaz{
    

    @Override
    public void vykonaj(Robo r) {
       r.vpravo();
    }
    
}
