package lesson0210;

import processing.core.PApplet;

public class Rectangle extends Shape {
    private float breedte, hoogte;

    public Rectangle(float x, float y, float breedte, float hoogte) {
        super(x, y);
        this.breedte = breedte;
        this.hoogte = hoogte;
        zetStil();
        kleur = 0xFFFFFFFF;
    }

    public void tekenRechthoek(PApplet p) {
        p.noStroke();
        p.fill(kleur);
        p.rect(x, y, breedte, hoogte);
    }

}
