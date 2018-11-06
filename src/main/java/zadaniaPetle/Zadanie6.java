package zadaniaPetle;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz, program wyświeti go na odwrót");
        String word = scanner.nextLine();
        String[] letters = word.split("");
        String drow = "";
        for (int i = letters.length-1; i >= 0; i--) {
            drow += letters[i];
        }
        System.out.println("Wyraz po odwroceniu to: " + drow);
    }

}
