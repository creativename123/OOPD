package lesson0214p;

import processing.core.PApplet;

public class Rectangle extends Figure {

    Rectangle(float xPos, float yPos, int fillColour) {
        super(xPos, yPos, fillColour);
    }

    public void displayObject(PApplet app) {
        if (isCursorOver(app.mouseX, app.mouseY)) {
            this.setFillColour(155);
        } else {
            this.setFillColour(255);
        }
        app.fill(this.fillColour);
        app.rect(this.xPos, this.yPos, this.oWidth, this.oHeight);
    }

    @Override
    protected boolean isCursorOver(int mousex, int mousey) {
        return mousex > this.xPos &&
                mousex < this.xPos + oWidth &&
                mousey > this.yPos &&
                mousey < this.yPos + this.oHeight;
    }
}
