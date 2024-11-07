public class EjemploStringValidar {
    public static void main(String[] args) {
        
        String curso = null; // variable nula de tipo String y no puede ser nula

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if(esNulo){ // si es diferente de nulo, entonces lo muestra en mayúsculas 
            curso = "Programación Java";
        }
        //en el caso de que curso este inciado y vacio curso = " ";
        boolean esVacio = curso.length() == 0;
        //otro mejor forma de hacerlo
        esVacio = curso.isEmpty();
        System.out.println("esVacio = " + esVacio);


        System.out.println(curso.toUpperCase());
        System.out.println("Bienvenidos al curso de " + curso); // muestra el valor nulo pero si realizamos el método concat darß un error
    }
    
}

