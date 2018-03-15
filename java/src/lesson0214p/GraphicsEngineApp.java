package lesson0214p;

import processing.core.PApplet;

import java.util.ArrayList;

public class GraphicsEngineApp extends PApplet {
    private ArrayList<DisplayObject> displayList = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("lesson0214p.GraphicsEngineApp");
    }

    public void settings() {
        size(250, 250);
    }

    public void setup() {
        //make obbjects
        Rectangle rect1 = new Rectangle(10, 10, 255);
        Rectangle rect2 = new Rectangle(50, 30, 255);
        HelloReactor message = new HelloReactor();

        //add to reactor
        rect1.addReactor(message);

        //set rect vars
        rect1.setoWidth(20);
        rect1.setoHeight(30);
        rect2.setoWidth(30);
        rect2.setoHeight(20);

        //add them to list
        displayList.add(rect1);
        displayList.add(rect2);
    }

    public void draw() {
        background(0);
        for (DisplayObject wo : displayList) {
            ((Rectangle) wo).displayObject(this);
        }
    }

    public void mousePressed() {
        for (DisplayObject wo : displayList) {
            if (wo.isCursorOver(mouseX, mouseY)) {
                wo.giveMousePressedEvent(mouseX, mouseY);
            }
        }
    }
}
