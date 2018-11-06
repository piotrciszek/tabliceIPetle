package zadaniaPetle;

public class Zadanie2 {

    public static void main(String[] args) {
        int[] tab = new int[]{-1, 19, 78, -46, 9, 33, 67, -17, 0, 99};

        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }

        double sum = 0;
        for (int i : tab) {
            sum += i;
        }

        double sred = sum/tab.length;



        System.out.println("Największa liczba to: " + max);
        System.out.println("Najmniejsza liczba to: " + min);
        System.out.println("Suma liczba w tablicy to: " + (int)sum);

        System.out.println("Srednia liczb z tablicy to: " + sred);
    }
}
