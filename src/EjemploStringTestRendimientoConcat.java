public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        
        String a = "a";
        String b = "b"; 
        String c = "c";

        StringBuilder sb = new StringBuilder(a); // este método hace poder concatenar strings ademas de otras operaciones

        long inicio = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
            //c = c.concat(a).concat(b).concat("\n");  // concatenar strings este es el método más lento 5591 milisegundos
            //c  = c + a + b + "\n";  // concatenar strings 2143 milisegundos
            sb.append(a).append(b).append("\n");  // este es el método más recomendado para concatenar strings solo 12 milisegundos
            
        }

        long fin = System.currentTimeMillis();
        
        System.out.println("fin - inicio = " + (fin - inicio) + " milisegundos");
    }
    
}
