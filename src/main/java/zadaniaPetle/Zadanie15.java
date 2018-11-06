package zadaniaPetle;

import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        System.out.println("Programo zwroci najwiekszy wspolny mianownik dowch liczb");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int liczba2 = scanner.nextInt();

        while (liczba1 != liczba2) {
            if (liczba1 > liczba2) {
                liczba1 -= liczba2;
            } else {
                liczba2 -= liczba1;
            }
        }
        System.out.println("Najwyzszy wspolny dzielnik to: " + liczba1);
    }
}
