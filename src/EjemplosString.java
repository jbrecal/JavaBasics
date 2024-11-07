public class EjemplosString {
    public static void main(String[] args) {
        
        String curso = "Programación Java"; 
        String curso2 = new String("Programación Java"); // una nueva instancia de String

        boolean iguales = curso == curso2; // compara las direcciones de memoria
        System.out.println("iguales = " + iguales);  // iguales = false porque son objetos distintos

        iguales = curso.equals(curso2); // compara el contenido
        System.out.println("iguales = " + iguales); // iguales = true porque el contenido es el mismo

        // el ignorecase es para ignorar mayúsculas y minúsculas
        iguales = curso.equalsIgnoreCase(curso2); // compara el contenido ignorando mayúsculas y minúsculas
        System.out.println("iguales = " + iguales); // iguales = true porque el contenido es el mismo

        System.out.println("curso.length() = " + curso.length()); // 15 caracteres
        System.out.println("curso.substring(0, 6) = " + curso.substring(0, 6));
    }
}
