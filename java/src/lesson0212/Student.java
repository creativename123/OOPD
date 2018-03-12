package lesson0212;

import java.util.ArrayList;

public class Student extends Persoon {
    protected int nummer;
    protected Docent SLBer;

    public Student(String naam, String voornaam, int nummer, Docent SLBer) {
        super(naam, voornaam);
        this.nummer = nummer;
        this.SLBer = SLBer;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }


    public void setSLBer(Docent sLBer) {
        SLBer = sLBer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nummer=" + nummer +
                ", SLBer=" + SLBer +
                "} " + super.toString();
    }

    @Override
    public Docent getSLBer() {
        return SLBer;
    }
}
