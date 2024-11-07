public class PrimitivosCaracteres {
    public static void main(String[] args) {

        // tres formas de mostrar el mismo caracter

        char decimal = 64;
        char caracter = '\u0040';
        char simbolo = '@';

        System.out.println(caracter == decimal);
        System.out.println(decimal == simbolo);

        char espacio = ' ';
        char espacio2 = '\u0020';
        char retroceso = '\b';  // retrocede un espacio
        char tabulador = '\t'; // avanza un espacio más grande
        char nuevaLinea = '\n';
        char retornoCarro = '\r'; // reinicia la línea y muestra lo que hay a continuación


        System.out.println("char corresponde en bytes:" + espacio + Character.BYTES);
        System.out.println("char corresponde en bites:" + espacio2 +  Character.SIZE);
        System.out.println("el valor mínimo del char: " + Character.MIN_VALUE);
        System.out.println("el valor máximo del char: " + Character.MAX_VALUE);

    }
}
