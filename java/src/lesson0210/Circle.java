package lesson0210;

import processing.core.PApplet;

public class Circle extends Shape {
    private float diameter;

    Circle(float x, float y, float diameter) {
        super(x, y);
        this.diameter = diameter;
    }


    public void tekenCirkel(PApplet p) {
        p.noStroke();
        p.fill(kleur);
        p.ellipse(x, y, diameter, diameter);
    }
}