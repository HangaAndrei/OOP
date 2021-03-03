package stock;

public class Main {

    public static void main(String[] args) {

        Stock Tesla = new Stock("Triunghi", "Tesla");
        double rezultat = Tesla.changePercentage(100,88.5);
        System.out.println(rezultat);
    }
}
