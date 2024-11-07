
import java.io.IOException;

public class EjecutarProgramaOS {
    public static void main(String[] args) {
        
        // Ejecuta un programa en el sistema operativo
        Runtime rt = Runtime.getRuntime();  // rt es un objeto de la clase Runtime
        Process proceso;  // proceso es un objeto de la clase Process

        try {
            if(System.getProperty("os.name").startsWith("Windows")) {  
                proceso = rt.exec("notepad");
            } else {
                proceso = rt.exec("gedit");
            }
            
            
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
       
    
    }
    
}
