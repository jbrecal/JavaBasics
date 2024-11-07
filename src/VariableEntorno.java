import java.util.Map;

public class VariableEntorno {
    public static void main(String[] args) {
        
        Map<String, String> varEnv = System.getenv();
        System.out.println("variable de entorno = " + varEnv);

        System.out.println("Listando variables de entorno:");
        for(String key: varEnv.keySet()){
            System.out.println("key = " + key + " value = " + varEnv.get(key));
        }

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("tempDir = " + temDir);
    }
     
}
