/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

/**
 *
 * @author Artemisia
 */
public class Políčko {

    private int x;
    private int y;
    private boolean značka = false;
    private String vypis = "";

    Políčko(int x, int y, boolean značka) {
        this.x = x;
        this.y = y;
        this.značka = značka;   

    }

    public String getVypis() {
        this.kontrola();
        return vypis;
    }

    public void setVypis(String vypis) {
        this.vypis = vypis;
    }

    public boolean isZnačka() {
        return značka;
    }

    public void setZnačka(boolean značka) {
        this.značka = značka;
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

    public void kontrola() {

        if (značka == true) {
            vypis = "X";
        } else {
            vypis = ".";
        }

    }

}
