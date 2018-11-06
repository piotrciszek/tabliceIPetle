package zadaniaPetle;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ciąg znaków");
        sumaZnakow(scanner.nextLine());

    }
    private static void sumaZnakow(String znaki) {


        /*String znaki = scanner.nextLine();*/

        String[] tablica = znaki.split("");

        int liczby = 0;
        int litery = 0;
        int spacje = 0;
        int pozostale = 0;

        for (String z : tablica) {
            int ascii = z.codePointAt(0); //https://pl.wikipedia.org/wiki/ASCII
            if (ascii > 47 && ascii <58) {
                liczby++;
            } else if ((ascii > 64 && ascii <91) || (ascii > 96 && ascii < 123)) {
                litery++;
            } else if (ascii == 32) {
                spacje++;
            } else {
                pozostale++;
            }
        }

        System.out.println("Podany ciag znakow to: " + znaki + " zawiera");
        System.out.println(litery + " liter");
        System.out.println(liczby + " liczb");
        System.out.println(spacje + " spacji");
        System.out.println(pozostale + " innych znakow");


    }

}
