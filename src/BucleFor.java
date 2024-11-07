public class BucleFor {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) { // cuenta de 0 a 10
            System.out.print(i + " ");
        }
        System.out.println("");

        for (int i = 10; i >= 0; i--) {  // cuenta hacia atras
            System.out.print(i + " ");
        }
        System.out.println("");

        for (int i = 0; i <= 10; i += 2) {   // saltos de 2
            System.out.print(i + " ");
        }
        System.out.println("");

        for (int i = 0; i <= 50; i++){
            if (i % 2 == 0) {  // si es par imprime
                System.out.print(i + " ");
            }
        }

    }
    
}
