package lesson0209;

class Studieadviseur {

    static boolean krijgtPositiefStudieadvies(Student s) {
        int[] cijfers = s.getCijfers();
        int aantalVoldoende = 0;

        for (int cijfer : cijfers) {
            if (cijfer >= 6) {
                aantalVoldoende++;
            }
        }

        return aantalVoldoende >= 4;
    }
}
