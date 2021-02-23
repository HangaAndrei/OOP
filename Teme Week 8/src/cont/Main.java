package cont;

public class Main {

    public static void main(String[] args) {
        Cont cont = new Cont(4144, 125);
        double afisareRetragere = cont.retrage(cont.getSold());
        System.out.println(afisareRetragere);


        double afisareDepunere = cont.depunere();
        System.out.println(afisareDepunere);



    }

}
