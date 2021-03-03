package bloc;

public class Main {

    public static void main(String[] args) {
        Bloc bloc = new Bloc("E2");
        Etaj etajul0 = new Etaj(0);
        Apartament apartament1 = new Apartament("Popescu", 1);
        int numarEtaj = etajul0.getNumarEtaj();
        int numarApartament = apartament1.getNumarApartament();
        adaugaApartament(1,"Popescu");
    }

    public static int[] adaugaApartament(int numarApartament, String numeFamilie) {
        int[] etaj0 = new int[100];
            for (int i = 0; i < etaj0.length; i++) {
                etaj0[i] = numarApartament;
            }
        return etaj0;
    }


}
