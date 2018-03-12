package lesson0213p;

import processing.core.PApplet;

public class Tekstraam implements IDoelwit {
    private PApplet app;
    private String s;
    private float x;
    private float y;

    public Tekstraam(KnoppenApp app, String s, int x, int y) {
        this.app = app;
        this.s = s;
        this.x = x;
        this.y = y;
    }

    public void schakel() {
        app.text(s, x, y);
    }

    public void teken() {

    }
}
