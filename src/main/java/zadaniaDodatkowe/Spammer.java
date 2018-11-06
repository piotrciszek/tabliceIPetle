package zadaniaDodatkowe;

import java.util.Scanner;

public class Spammer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj słowo");
        String slowo = scanner.nextLine();
        System.out.println("Ilosc powtorzen");
        int powtorzenia = scanner.nextInt();

        spam(slowo,powtorzenia);
    }

    private static void spam (String slowo, int ile){
        do {
            System.out.println(slowo);
        }while(--ile > 0);
    }
}