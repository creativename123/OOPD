package lesson0214p;

public abstract class Figure extends DisplayObject {
    int fillColour;

    Figure(float xPos, float yPos, int fillColour) {
        super(xPos, yPos);
        this.fillColour = fillColour;
    }

    public int getFillColour() {
        return fillColour;
    }

    void setFillColour(int fillColour) {
        this.fillColour = fillColour;
    }
}
