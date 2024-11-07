public class BucleEtiquetas {
    public static void main(String[] args) {
        

        bucle1: for (int i = 0; i < 10; i++) {
            if (i == 5) { // si i es igual a 5
                continue bucle1; // salta a la siguiente iteracion
            }
            System.out.print(i + " ");
        }

        System.out.println("");

        bucle2: for (int i = 0; i < 10; i++) {
            if (i == 5) { // si i es igual a 5
                break bucle2; // rompe el bucle
            }
            System.out.print(i + " ");
        }
    }
    
}
