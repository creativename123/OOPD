package lesson0210;

public class Shape {
    protected float x, y, vx, vy, ax, ay;
    protected int kleur;

    Shape(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void doeStap() {
        if (!staatStil()) {
            pasVersnellingToe();
            pasSnelheidToe();
        }
    }

    protected void setSnelheid(float vx, float vy) {
        this.vx = vx;
        this.vy = vy;
    }

    protected void setVersnelling(float ax, float ay) {
        this.ax = ax;
        this.ay = ay;
    }

    protected void zetStil() {
        vx = vy = ax = ay = 0;
    }

    protected boolean staatStil() {
        return (vx == 0 && vy == 0 && ax == 0 && ay == 0);
    }


    protected void setKleur(int kleur) {
        this.kleur = kleur;
    }

    protected void pasVersnellingToe() {
        vx += ax;
        vy += ay;
    }

    protected void pasSnelheidToe() {
        x += vx;
        y += vy;
    }

}
