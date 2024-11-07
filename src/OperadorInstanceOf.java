public class OperadorInstanceOf {
    public static void main(String[] args) {
        
        String texto = "Creamos un objeto de la clase String"; // crea un objeto de la clase String

        Integer num = 100;  // crea un objeto de la clase Integer

        // Vamos a utilizar el operador instanceof para saber si un objeto es de una clase determinada
        // Primero, es el tipo de objeto que queremos saber si es de esa clase o no

        boolean b1 = texto instanceof String; // devuelve true si es de la clase String
        System.out.println("texto es de la clase String = " + b1);

        b1 = texto instanceof Object; // devuelve true si es de la clase Object
        System.out.println("texto es de la clase Object = " + b1);

        b1 = num instanceof Integer; // devuelve true si es de la clase Integer
        System.out.println("num es de la clase Integer = " + b1);


    }
    
}
