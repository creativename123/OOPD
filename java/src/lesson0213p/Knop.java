package lesson0213p;

import processing.core.PApplet;

abstract class Knop {

    protected PApplet app;

    protected float x, y, breedte, hoogte;

    public Knop(PApplet app, float x, float y, float breedte, float hoogte) {
        this.app = app;
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

     boolean isMuisOverKnop() {
        if (app.mouseX >= x && app.mouseX < x + breedte &&
                app.mouseY >= y && app.mouseY < y + hoogte) {
            return true;
        } else {
            return false;
        }
    }

     abstract void tekenKnop();

     void handelInteractieAf() {
        doeKnopActie();
    }

     void doeKnopActie() {
    }

     void voegDoelwitToe(IDoelwit doelwit) {
    }
}
