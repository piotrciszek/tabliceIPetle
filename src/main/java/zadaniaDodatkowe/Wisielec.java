package zadaniaDodatkowe;

import java.util.Scanner;

public class Wisielec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int iloscSzans = 5;

        System.out.println("Podaj haslo dla przeciwnika");
        String haslo = scanner.nextLine();
        char[] tablicaHaslo = haslo.toCharArray();

        char[] tablicaKopia = new char[tablicaHaslo.length];
        for (int i =0; i<tablicaKopia.length; i++){
            tablicaKopia[i] = '*';
        }
        for (char f : tablicaKopia) {
            System.out.print(f);
        }
        while (iloscSzans>0){
            System.out.println("Podaj literę");
            char litera = scanner.nextLine().charAt(0);

            if (czyZawiera(haslo, litera)) {
                System.out.println("Brawo trafiles");

                }
             else {
                System.out.println("Nie ma takiej litery, tracisz szanse");
                iloscSzans--;
            }
        }







    }
    private static boolean czyZawiera(String tekst, char znak){
        for (int i=0; i<tekst.length(); i++) {
            if (tekst.charAt(i) == znak){
                return true;
            }
        }
        return false;
    }

}
