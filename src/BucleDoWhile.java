public class BucleDoWhile {
    public static void main(String[] args) {
        
        boolean prueba = true;
        int i = 0;


        do {  // primero se ejecuta y luego se compara
            if (i == 1500000) {
                prueba = false; // se rompe el bucle
            }
            System.out.println(i);
            i+=100;
        } while (prueba);  // mientras se cumpla la condicion el bucle no se rompe
    }
    
}
