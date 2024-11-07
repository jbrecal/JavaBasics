
import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero o letra: ");
        char caracter = sc.next().charAt(0); 
        
        switch (caracter) {
            case 'a':
                System.out.println("La letra es la a");
                break;
            case '1':
                System.out.println("El número es uno");
                break;
            case 'b':
                System.out.println("La letra es la b");
                break;
            case '2':
                System.out.println("El número es el dos");
                
                break;
            default:
                System.out.println("Número no valido");
        }
    }
    
}
