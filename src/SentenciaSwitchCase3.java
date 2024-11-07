import java.util.Scanner;

public class SentenciaSwitchCase3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes de 1 - 12");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año");
        int anio = sc.nextInt();
        int numeroDias = 0;
        

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                System.out.println("El mes no es valido");
        }
        System.out.println("Numero de días: " + numeroDias);
        
    }
    
}
