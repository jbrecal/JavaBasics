
import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        
        int max = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        int num2 = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        int num3 = sc.nextInt();
        System.out.println("Introduce otro numero: ");    
        int num4 = sc.nextInt();
        
        max  = (num > num2 && num > num3 && num > num4) ? num : ((num2 > num3 && num2 > num4) ? num2 : ((num3 > num4) ? num3 : num4));
        System.out.println("El maximo es: " + max);
    }
    
}
