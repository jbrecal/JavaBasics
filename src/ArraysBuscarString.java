
import java.util.Scanner;

public class ArraysBuscarString {
    public static void main(String[] args) {
        
        String[] a = new String[4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce una palabra: ");
            a[i] = sc.next();
        }

        System.out.println("Introduce una palabra a buscar: ");
        String palabra = sc.next();
        int i = 0;

        while (i < a.length && !a[i].equals(palabra)) {
            i++;
        }

        if (i == a.length) {
            System.out.println("No se ha encontrado la palabra");
        } else if (a[i].equalsIgnoreCase(palabra)) {
            System.out.println("Se ha encontrado la palabra en la posicion " + i);
        }
    }
    
}
