package lesson0214p;

import processing.core.PApplet;

import java.util.ArrayList;

public abstract class DisplayObject extends PApplet {
    private ArrayList<IReactor> reactorList = new ArrayList<>();
    float xPos;
    float yPos;
    float vx;
    float vy;
    float ax;
    float ay;
    float oWidth;
    float oHeight;
    boolean isVisible;


    public abstract void displayObject(PApplet app);

    protected abstract boolean isCursorOver(int mousex, int mousey);

    DisplayObject(float xPos, float yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void takeStep() {

    }

    void giveMousePressedEvent(int mouseX, int mouseY) {
        for (IReactor rl : reactorList) {
            rl.doAction();
        }
    }

    protected void treatMousePressedEvent() {

    }

    void addReactor(IReactor reactor) {
        reactorList.add(reactor);
    }

    public void removeReactor(IReactor reactor) {
        reactorList.remove(reactor);
    }

    /*
    setters and getters
     */
    public float getxPos() {
        return xPos;
    }

    public void setxPos(float xPos) {
        this.xPos = xPos;
    }

    public float getyPos() {
        return yPos;
    }

    public void setyPos(float yPos) {
        this.yPos = yPos;
    }

    public float getVx() {
        return vx;
    }

    public void setVx(float vx) {
        this.vx = vx;
    }

    public float getVy() {
        return vy;
    }

    public void setVy(float vy) {
        this.vy = vy;
    }

    public float getAx() {
        return ax;
    }

    public void setAx(float ax) {
        this.ax = ax;
    }

    public float getAy() {
        return ay;
    }

    public void setAy(float ay) {
        this.ay = ay;
    }

    public float getoWidth() {
        return oWidth;
    }

    public void setoWidth(float oWidth) {
        this.oWidth = oWidth;
    }

    public float getoHeight() {
        return oHeight;
    }

    public void setoHeight(float oHeight) {
        this.oHeight = oHeight;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }
}
