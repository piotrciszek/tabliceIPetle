import java.util.Random;
import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kontynuacja;
        double iloscPaliwa = 0;
        double cenaLaczna = 0;

        System.out.println("Dzien dobry, prosimy rozpoczac tankowanie");
        do {
            double[] tablica1 = tankuj();

            iloscPaliwa += tablica1[1];
            cenaLaczna += tablica1[0] * tablica1[1];

            System.out.println("Cena za litr paliwa to: " + tablica1[0]);
            System.out.println("Nalano: " + (double)Math.round((iloscPaliwa)*100)/100);
            System.out.println("Do zaplacenia " + (double)Math.round((cenaLaczna)*100)/100);

            System.out.println("Czy chcesz kontynuowac?");
            System.out.println("t - tak/ n - nie");
            kontynuacja = scanner.nextLine();

        }
        while (kontynuacja != "n");

    }

    private static double[] tankuj(){
        Random random = new Random();
        double[] tablica = new double[2];
        double cena = 5.21;
        double ilosc = 0;

        ilosc += (double)Math.round(random.nextDouble()*500)/100;
        tablica[0] = cena;
        tablica[1] = ilosc;

        return tablica;
    }
}
