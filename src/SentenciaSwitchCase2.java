import java.util.Scanner;

public class SentenciaSwitchCase2 {
    public static void main(String[] args) {
        
        String mes = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el mes con la primera letra en mayúscula: ");
        
        mes = sc.nextLine();
        

        switch(mes) {
            case "Enero":
                 System.out.println("Enero tiene 31 dias");
                 break;
            case "Febrero":
                 System.out.println("Febrero tiene 28 dias");
                 break;
            case "Marzo":
                 System.out.println("Marzo tiene 31 dias");
                 break;
            case "Abril":
                 System.out.println("Abril tiene 30 dias");
                 break;
            case "Mayo":
                 System.out.println("Mayo tiene 31 dias");
                 break;
            case "Junio":
                 System.out.println("Junio tiene 30 dias");     
                 break;
            case "Julio":
                 System.out.println("Julio tiene 31 dias");
                 break;
            case "Agosto":
                 System.out.println("Agosto tiene 31 dias");
                 break;
            case "Septiembre":
                 System.out.println("Septiembre tiene 30 dias");
                 break;
            case "Octubre":
                 System.out.println("Octubre tiene 31 dias");
                 break;
            case "Noviembre":
                 System.out.println("Noviembre tiene 30 dias");
                 break;
                case "Diciembre":
                System.out.println("Diciembre tiene 31 dias");
                
                break;
                default:
                    System.out.println("No es un mes");
        }
    }
    
}
