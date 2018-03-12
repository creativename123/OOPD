package lesson0210;

import processing.core.PApplet;


public class Main extends PApplet {
    Circle c = new Circle(20, 20, 50);
    Rectangle r = new Rectangle(20, 50, 100, 200);

    public static void main(String[] args) {
        PApplet.main("lesson0210.Main");
    }

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        c.setSnelheid(1, 1);
        c.setVersnelling(1, 1);
        c.doeStap();
        c.setKleur(255);
        c.tekenCirkel(this);
        System.out.print(c.staatStil());
        c.zetStil();
        System.out.print(c.staatStil());

        r.setSnelheid(1, 1);
        r.setVersnelling(1, 1);
        r.doeStap();
        r.setKleur(255);
        r.tekenRechthoek(this);
        System.out.print(r.staatStil());
        r.zetStil();
        System.out.print(r.staatStil());

    }

    public void draw() {

    }

}
