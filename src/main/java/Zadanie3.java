import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę");
        int liczba = scanner.nextInt();
        int[] tablica = new int[liczba-1];
        for (int i=0 ; i<tablica.length; i++){
            tablica[i] = liczba-1;
            liczba--;
        }

        int[] dzielone3 = new int[10000];
        int[] dzielone2 = new int[10000];


        int i=0;
        for (int z : tablica) {
            if (z%3==0) {
                dzielone3[i] = z;
                i++;
            }
        }
        int j=0;
        for (int z : tablica) {
            if (z%2==0) {
                dzielone2[j] = z;
                j++;
            }
        }

        System.out.print("Liczby podzielne przez 3 mniejsze od podanej to: ");
        for (int z : dzielone3) {
            if (z != 0) {
                System.out.print(z);
                System.out.print(" ");
            }
        }
        System.out.println("");
        System.out.print("Liczby podzielne przez 2 mniejsze od podanej to: ");
        for (int z : dzielone2) {
            if (z != 0) {
                System.out.print(z);
                System.out.print(" ");
            }
        }

    }
}
