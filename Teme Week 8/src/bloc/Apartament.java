package bloc;

public class Apartament {
    private String numeFamilie;
    private int numarApartament;

    public Apartament(String numeFamilie, int numarApartament) {
        this.numeFamilie = numeFamilie;
        this.numarApartament = numarApartament;
    }

    public String getNumeFamilie() {
        return numeFamilie;
    }

    public void setNumeFamilie(String numeFamilie) {
        this.numeFamilie = numeFamilie;
    }

    public int getNumarApartament() {
        return numarApartament;
    }

    public void setNumarApartament(int numarApartament) {
        this.numarApartament = numarApartament;
    }
}
