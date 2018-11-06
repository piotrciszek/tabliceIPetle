package zadaniaPetle;

public class Zadanie13 {
    public static void main(String[] args) {
        for (int i=0; i<=5; i++) {
            System.out.println();
            for (int j=0; j<i; j++){
                System.out.print("#");
            }
        }
        System.out.println();
        System.out.print("------");

        for (int i=5; i>0; i--) {
            System.out.println();
            for (int j=0; j<i; j++){
                System.out.print("#");
            }
        }
        System.out.println();
        System.out.print("------");

        for(int i = 5; i > 0; i-- ){
            System.out.println();
            for(int k = 5; k > i ; k--){
                System.out.print(" ");
            }
            for( int j = 0; j < i; j++){
                System.out.print("#");
            }
        }
        System.out.println();
        System.out.print("------");

        for (int i=0; i<5; i++){
            System.out.println();
            for (int k =5; k > i; k--){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){
                System.out.print("#");
            }
        }
    }


}
