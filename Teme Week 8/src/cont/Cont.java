package cont;

import java.util.Scanner;

public class Cont {
    Scanner scanner = new Scanner(System.in);
    private int idCont;
    private double sold;
    private double anualInterestRate;
    private String dateCreated;

    private Cont() {

    }

    public Cont(int idCont, double sold) {
        this.idCont = idCont;
        this.sold = sold;
    }

    public int getIdCont() {
        return idCont;
    }

    public void setIdCont(int idCont) {
        this.idCont = idCont;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public double getAnualInterestRate() {
        return anualInterestRate;
    }

    public void setAnualInterestRate(double anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double monthlyInterestRate(double sold, double anualInterestRate) {
        double taxa = sold - (anualInterestRate / 100 * sold);
        return taxa;
    }

    public double retrage (double sold) {
        System.out.println("Ce suma doresti sa retragi?");
        double sumaRetrasa = scanner.nextDouble();
        scanner.nextLine();
        if (sumaRetrasa > sold) {
            System.out.println("Nu aveti sold-ul disponibil");
        } else {
            System.out.println("Ati retras " + sumaRetrasa + " cu succes");
        }
        System.out.println("Sold cont: " + (sold - sumaRetrasa));
        return sumaRetrasa;
    }

    public double depunere () {
        System.out.println("Introduceti suma: ");
        double sumaDepusa = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ati depus " + sumaDepusa + " lei cu succes");
        System.out.println("Sold curent: " + (sumaDepusa + sold));
        return sumaDepusa;
    }
}
