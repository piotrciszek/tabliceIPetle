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

        System.out.println();
        while (iloscSzans>0){
            System.out.println("Podaj literę");
            String literaS = scanner.nextLine();
            char listeraSS = literaS.charAt(0);

            if (czyZawiera(tablicaHaslo, listeraSS)) {
                System.out.println("Brawo trafiles");


                System.out.println(wyswietlHaslo(tablicaHaslo, tablicaKopia, listeraSS));
                System.out.println();
            }

             else {
                System.out.println("Nie ma takiej litery, tracisz szanse");
                iloscSzans--;
            }
        }

    }
    private static boolean czyZawiera(char[] hasloTablica, char znak){
        for (int i=0; i<hasloTablica.length; i++) {
            if (hasloTablica[i] == znak){
                return true;
            }
        }
        return false;
    }
    private static String wyswietlHaslo(char[] hasloTablica, char[] kopia, char znak){
        int index = 0;
        for (int i=0; i<hasloTablica.length; i++) {
            if (hasloTablica[i] == znak){


            }
            kopia[index] = znak;
        }
        return kopia.toString();
    }

}
