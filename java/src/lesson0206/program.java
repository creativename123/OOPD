package lesson0206;

import tools.tools;

public class program extends tools {
    public static void main(String[] args) {
        School theSchool = new School("ICA");

        Student s1 = new Student("Hanneke", 1, theSchool);
        Student s2 = new Student("Jan", 2, theSchool);

        println(s1.school);
        println(theSchool);
        println(s2.school);
    }
}