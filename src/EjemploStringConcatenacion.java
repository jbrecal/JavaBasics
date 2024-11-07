public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        
        String curso = "Programación Java";
        String profesor = "Juan Brenes";
        
        String detalle = curso + " por " + profesor;
        
        System.out.println(detalle);

        int numeroA = 5;
        int numeroB = 10;

        System.out.println(detalle  + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(" por ").concat(profesor); // concat es un método
        System.out.println(detalle2);


    }
    
}
