package lesson0213;

import processing.core.PApplet;

import java.util.ArrayList;

public class MainApp extends PApplet {
    private ArrayList<IDoelwit> knoppenLijst = new ArrayList<IDoelwit>();

    public static void main(String[] args) {
        PApplet.main("lesson0213.MainApp");
    }

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        RadioKnop rk = new RadioKnop(this, 50, 50, 40, 40);
        RadioKnop rk2 = new RadioKnop(this, 100, 50, 40, 40);
        RadioKnop rk3 = new RadioKnop(this, 150, 50, 40, 40);

        knoppenLijst.add(rk);
        knoppenLijst.add(rk2);
        knoppenLijst.add(rk3);

        for (IDoelwit knop : knoppenLijst) {
            for (IDoelwit knop2 : knoppenLijst) {
                if (knop != knop2) {
                    ((RadioKnop) knop).voegDoelwitToe(knop2);
                }
            }
        }

    }

    public void draw() {
        background(0);
        for (IDoelwit k : knoppenLijst) {
            ((RadioKnop) k).tekenKnop();
        }
    }

    public void mousePressed() {
        for (IDoelwit k : knoppenLijst) {
            if (((RadioKnop) k).isMuisOverKnop()) {
                k.schakel();
            }
        }
    }
}
