public class PropiedadesDelSistema {
    public static void main(String[] args) {
        
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String path = System.getProperty("user.dir");
        System.out.println("path = " + path);

        String javaHome = System.getProperty("java.home");
        System.out.println("javaHome = " + javaHome);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        // vamos a listar todas las propiedades del sistema
        System.getProperties().list(System.out);
    }
    
}
