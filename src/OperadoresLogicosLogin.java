
import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String[] usuarios = {"Juan", "Mariate", "Pedro", "Jordi", "Maria"};
        String[] passwords = {"admin", "admin2", "admin3", "admin4", "admin5"};

       

        Scanner sc = new Scanner(System.in);

        System.out.println("Usuario: ");
        String user = sc.nextLine();
        System.out.println("Password: ");
        String pass = sc.nextLine();

        boolean esAutenticado = false;

        for(int i = 0; i < usuarios.length; i++){
            if(usuarios[i].equals(user) && passwords[i].equals(pass)){
                esAutenticado = true;
                break; // se sale del bucle en el caso del que el primero es verdadero

                // con un operador ternario seria de la sigueinte forma
                // esAutenticado = (usuarios[i].equals(user) && passwords[i].equals(pass)) ? true : esAutenticado;
            }
        }
        

        if(esAutenticado){
            System.out.println("Bienvenido ".concat(user).concat("!"));
        }else{
            System.out.println("Lo siento, no eres un usuario registrado");
        }
        // con un operador ternario seria de la sigueinte forma

        // String mensaje = esAutenticado ? "Bienvenido ".concat(user).concat("!") : 
        // "Lo siento, no eres un usuario registrado");
    }
    
}
