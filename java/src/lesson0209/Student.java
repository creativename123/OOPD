package lesson0209;

class Student {
    private String naam;
    private int[] cijfers;

    Student(String naam) {
        this.naam = naam;
        cijfers = new int[8];
    }

    void setCijfer(int vaknummer, int cijfer) {
        cijfers[vaknummer] = cijfer;
    }

    int[] getCijfers() {
        return cijfers;
    }

    public String toString() {
        String representatie = "naam: " + naam + "\ncijfers: ";
        for (int cijfer : cijfers) {
            representatie += " " + cijfer;
        }
        return representatie;
    }
}
