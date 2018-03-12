package lesson0212;

import java.util.ArrayList;

public class PersonenLijst {
    private ArrayList<Persoon> lijst;

    public PersonenLijst() {
        lijst = new ArrayList<>();
    }

    public ArrayList<Persoon> getSLBStudenten(Docent SLBer) {
        ArrayList<Persoon> list = new ArrayList<>();
        for (Persoon student : lijst) {
            if (student.getSLBer() == SLBer) {
                list.add(student);
                System.out.println(student.naam);

            }
        }
        return list;
    }

    public static void main(String[] args) {
        PersonenLijst p = new PersonenLijst();
        Docent piet = new Docent("Piet", "Jansen", "jnsnp");
        Student marie = new Student("Marie", "Pieters", 31415, piet);
        Student jan = new Student("Jan", "de Vries", 92653, null); // nog geen SLB’er
        p.lijst.add(piet);
        p.lijst.add(marie);
        p.lijst.add(jan);

        ArrayList<Persoon> studentenVanPiet = p.getSLBStudenten(piet);

    }
}
