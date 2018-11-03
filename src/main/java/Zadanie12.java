import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj liczbę od 1 do 20, program narysuje trójką z tych liczb");


        int liczba = scanner.nextInt();

        if (liczba > 20) {
            System.out.println("Podaj jeszcze raz liczbe, z zakresu 1-20");
            liczba = scanner.nextInt();
        } else {

            for (int i = 1; i <= liczba; i++) {
                System.out.println();
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            }
        }
    }
}