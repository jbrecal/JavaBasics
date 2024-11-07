public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Juan";

        System.out.println("nombre.length() = " + nombre.length()); // medirá la longitud del string

        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); // lo pasaremos a mayúsculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // lo pasaremos a minúsculas

        System.out.println("nombre.equals(\"Juan\") = " + nombre.equals("juan")); // compara el string con otro string
        System.out.println("nombre.equalsIgnoreCase(\"juan\") = " + nombre.equalsIgnoreCase("juan")); // compara el string con otro string ignorando mayúsculas y minúsculas
        System.out.println("nombre.contains(\"u\") = " + nombre.contains("u")); // compara el string con otro string
        System.out.println("nombre.startsWith(\"J\") = " + nombre.startsWith("J")); // compara el string con otro string
        System.out.println("nombre.endsWith(\"n\") = " + nombre.endsWith("n")); // compara el string con otro string
        System.out.println("nombre.compareTo(\"Juan\") = " + nombre.compareTo("Juan")); // compara el string con otro string, si es 0 es igual 

        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // muestra el primer caracter
        System.out.println("Nombre.charAt(2) = " + nombre.charAt(2)); // muestra el tercer caracter
        System.out.println("nombre.charAt(nombre.lenght() - 1) = " + nombre.charAt(nombre.length() - 1)); // muestra el último caracter

        System.out.println("nombre.substring(1, 3) = " + nombre.substring(1, 3)); // muestra un substring el endIndex no es inclusivo
        System.out.println("nombre.substring(nombre.length() - 1) = " + nombre.substring(nombre.length() - 1)); // muestra el último caracter, los dos ultimos ponemos -2

        String nombre2 = "JuanJuan";

        System.out.println("nombre.replace(\"J\", \"j\") = " + nombre2.replace("J", "j")); // reemplaza un caracter por otro
        System.out.println("nombre.replace(\"j\", \"J\") = " + nombre2.replace("j", "J")); // reemplaza un caracter por otro

        System.out.println("nombre.indexOf(\"u\") = " + nombre2.indexOf("u")); // muestra la primera vez que aparece el caracter, su posición
        System.out.println("nombre.lastIndexOf(\"u\") = " + nombre2.lastIndexOf("u")); // muestra la último vez que aparece el caracter, su posición
        System.out.println("nombre.contains(\"u\") = " + nombre2.contains("u")); // compara el string con otro string

        System.out.println("   JuanJuan    ".trim()); // elimina los espacios en blanco al inicio y al final.
        

    }
}
