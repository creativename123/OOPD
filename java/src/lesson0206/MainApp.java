package lesson0206;

import processing.core.PApplet;

class MainApp extends PApplet {
    public static void main(String[] args) {
        PApplet.main("lesson0206.MainApp");
    }

    public void settings() {
        size(250, 250);
    }

    public void setup() {
        School theSchool = new School("ICA");

        Student s1 = new Student("Hanneke", 1, theSchool);
        Student s2 = new Student("Jan", 2, theSchool);

        println(s1.school.name);
        println(theSchool);
        println(s2.school);
    }

    public void draw() {

    }
}