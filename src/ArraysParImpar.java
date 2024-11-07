
import java.util.Scanner;

public class ArraysParImpar {
    public static void main(String[] args) {
        
        int[] a, par, impar;

        a = new int[10];
        int totalPar = 0;
        int totalImpar = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalPar++;
            } else {
                totalImpar++;
            }
        }

        par = new int[totalPar];
        impar = new int[totalImpar];

        int j = 0;
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                par[j++] = a[i];
                
            } else {
                impar[k++] = a[i];
                
            }
        }
        System.out.println("Par: ");
        for (int i = 0; i < par.length; i++) {
            System.out.println("par[" + i + "] = " + par[i]);
        }
        System.out.println("Impar: ");
        for (int i = 0; i < impar.length; i++) {
            System.out.println("impar[" + i + "] = " + impar[i]);
        }
        
    }
    
}
