/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

import java.util.ArrayList;

/**
 *
 * @author Artemisia
 */
public class Plocha {

    private Robo r;
    private ArrayList<Políčko> hraciaP = new ArrayList<Políčko>();

    public Plocha() {
        r = new Robo(this);
        this.vytvorHraciuPlochu();

    }

    public void vytvorHraciuPlochu() {
        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= 9; i++) {
                Políčko p = new Políčko(0, 0, false);
                p.setX(j);
                p.setY(i);
                hraciaP.add(p);
            }

        }
        /* for (Políčko políčko : hraciaP) {
            System.out.println(políčko.getX());
            System.out.println(políčko.getY());
        }*/

    }

    public void poloz(int x, int y) {
        //System.out.println(x);
        //System.out.println(y);
        for (Políčko políčko : hraciaP) {
            //System.out.println(políčko.getX());
            //System.out.println(políčko.getY());
            if (políčko.getX() == x && políčko.getY() == y) {

                if (políčko.isZnačka() == false) {
                    políčko.setZnačka(true);

                } else {
                    System.out.println("MaxPocetZnaciek");
                }

            }
        }

    }

    public void zdvihni(int x, int y) {
        for (Políčko políčko : hraciaP) {
            if (políčko.getX() == x && políčko.getY() == y) {
                if (políčko.isZnačka() == true) {
                    políčko.setZnačka(false);
                } else {
                    System.out.println("NieJeZnacka");
                }
            }
        }

    }

    public Robo dajRobota() {
        return r;

    }

    public void vypis() {
        String a = "";
        for (int y = 0; y <= 9; y++) {
            for (int x = 0; x <= 9; x++) {  
                for (Políčko políčko : hraciaP) {
                    if (políčko.getY() == y && políčko.getX() == x) {
                        a+= políčko.getVypis();
                        
                    }
                } 
            } System.out.println(a);
              a = "";

        }

        /*for (Políčko políčko : hraciaP) {
            System.out.println(políčko.getX());
            System.out.println(políčko.getY());
        }*/

    }

    @Override
    public String toString() {
        return "Plocha{" + "r=" + r + '}';
    }

}
