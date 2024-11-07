import java.lang.reflect.Method;

public class GetClassMethod {
    public static void main(String[] args) {
        
        String texto = "Hola, que tal?"; // crea un objeto de la clase String

        Class strClass = texto.getClass(); //obtiene la clase de un objeto String
        System.out.println("La clase de texto es: " + strClass.getName());      // obtiene el nombre de la clase
        System.out.println("La clase de texto es: " + strClass.getSimpleName());  // obtiene el nombre de la clase
        System.out.println(strClass.getPackage());                              // obtiene el paquete de la clase
        System.out.println(strClass.getSuperclass());                           // obtiene la superclase de la clase

        for(Method metodo : strClass.getMethods()) { //obtiene todos los metodos de la clase
            System.out.println(metodo.getName());
        }

        Integer numero = 34;
        Class intClass = numero.getClass();
        System.out.println("La clase de numero es: " + intClass.getName());
    }
    
}
