package zadaniaPetle;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program posortuje podane przez Ciebie liczby" +
                " rosnąco oraz malejąco");
        System.out.println("Ile liczb chesz podać");
        int ilosc = scanner.nextInt();
        int[] liczby = new int[ilosc];
        for (int i=0; i<ilosc; i++) {
            System.out.println("Podaj " + ((int)i+1) + " liczbę");
            int liczba = scanner.nextInt();
            liczby[i] = liczba;
        }
        System.out.println("Liczby od największej: ");
        wyswietlTablice(sortowanieMalejace(liczby));
        System.out.println("");
        System.out.println("Liczby od najmniejszej: ");
        wyswietlTablice(sortowanieRosnace(liczby));


    }
    private static int[] sortowanieMalejace(int[] liczby){
        boolean zmieniony;

        do {
            zmieniony = false;
            for (int i = 0; i < liczby.length-1; i++) {
                if (liczby[i] < liczby[i+1]) {
                    int temp = liczby[i];
                    liczby[i] = liczby[i+1];
                    liczby[i+1] = temp;
                    zmieniony = true;
                }
            }
        }while(zmieniony);

        return liczby;
    }

    private static int[] sortowanieRosnace(int[] liczby) {
        boolean zmieniony;

        do {
            zmieniony = false;
            for (int i = 0; i <liczby.length-1; i++) {
                if (liczby[i] > liczby[i+1]) {
                    int temp = liczby[i];
                    liczby[i] = liczby[i+1];
                    liczby[i+1] = temp;
                    zmieniony = true;
                }
            }
        } while(zmieniony);
        return liczby;
    }

    private static void wyswietlTablice(int[] tablicaDoWyswietlenia) {
        for (int i : tablicaDoWyswietlenia ) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
