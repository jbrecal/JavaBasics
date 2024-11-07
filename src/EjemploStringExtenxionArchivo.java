public class EjemploStringExtenxionArchivo {
    public static void main(String[] args) {

        String path = "C:\\Users\\brenes\\Desktop\\prueba.txt";
        int i = path.lastIndexOf(".");  //porque como tenga mas de un punto toma el primera de la izquierda
        System.out.println(path.length()); // 34
        System.out.println(path.substring( i + 1 )); // .txt
    }
    
}
