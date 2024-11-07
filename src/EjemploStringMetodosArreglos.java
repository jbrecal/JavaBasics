public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
        
        String trabalenguas = "Trabalenguas";
        
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] caracteres = trabalenguas.toCharArray();  // convierte el string en un arreglo de caracteres
        int largo = caracteres.length; // asi sabemos cuantos caracteres tiene el string

        for (int i = 0; i < largo; i++) {
            System.out.println("caracteres[" + i + "] = " + caracteres[i]);
        }
        System.out.println();
        
        String[] arreglotrabalenguas = trabalenguas.split("a");

        for (int i = 0; i < arreglotrabalenguas.length; i++) {
            System.out.println("arreglotrabalenguas[" + i + "] = " + arreglotrabalenguas[i]);
        }

        String archivo = "alguna imagen.pdf";

        // el método split separa el string por el caracter que le indiques

        String[] archivoArr = archivo.split("\\."); // con doble \\ puedo indicar que es un caracter especial como en este caso un punto

        for (int i = 0; i < archivoArr.length; i++) {
            System.out.println("archivoArr[" + i + "] = " + archivoArr[i]);
        }
    }
    
}
