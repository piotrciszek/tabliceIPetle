package zadaniaDodatkowe;

public class StatystykiTablicy {
    public static void main(String[] args) {



        int[] tablica = new int[]{2,5,1,-3,5,22,21,66,21,54};

        System.out.println("---");
        System.out.println(srednia(tablica));
        System.out.println("-----");
        srednia(tablica);
        System.out.println("--------");

        int min = tablica[0];

        for (int i= 1; i<tablica.length; i++) {
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }
        System.out.println("Minimalna wartosc tabeli to: " + min);

        int max = tablica[0];

        for (int i=0; i<tablica.length; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
        System.out.println("Maksymalna wartosc tabeli to: " + max);

        double sum = 0;
        for (int z : tablica) {
            sum += z;
        }
        System.out.println("Srednia z tabeli to: " + sum/tablica.length);

        System.out.println("W tabeli znajduje się " + tablica.length + " elementów");
    }
    private static double srednia(int[] tablica){
        double sum = 0;
        for (int z : tablica) {
            sum+= z;
        }
        return sum/tablica.length;
    }

}
