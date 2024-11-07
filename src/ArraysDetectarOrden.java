import java.util.Scanner;

public class ArraysDetectarOrden {
    public static void main(String[] args) {
        
        int[] a = new int[7];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce 7 numeros: ");
        for (int i = 0; i < a.length; i++) {
            a[i] =sc.nextInt();
        }

        boolean asc = false;
        boolean desc = false;
        
        for (int i = 0; i < a.length - 1; i++) {  // -1 porque vamos a comparar con el elemento siguiente
            if(a[i] > a[i+1]) {  //si el valor de a[i] es mayor que el siguiente significa que es descendiente
                desc = true;
            } else if(a[i] < a[i+1]) {  //si el valor de a[i] es menor que el siguiente significa que es ascendiente
                asc = true;
            }
        }

        if (asc && desc == true) {  //si ambos son true entonces el arreglo no esta ordenado
            System.out.println("El array no esta ordenado");
        }
        if (asc && desc == false) {  //si ambos son false entonces el arreglo esta ordenado
            System.out.println("El array esta ordenado");
        }
        if( asc == true && desc == false) {  //si solo un true entonces el arreglo esta ordenado de forma ascendente
            System.out.println("El array esta ordenado de forma ascendente");
        }
        if( asc == false && desc == true) {  //si solo un true entonces el arreglo esta ordenado de forma descendente
            System.out.println("El array esta ordenado de forma descendente");
        }
        
       
    }
    
}
