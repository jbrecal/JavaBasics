
import java.io.FileInputStream;
import java.util.Properties;

public class AsignarPropiedadesDelSistema {

    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties prop = new Properties(System.getProperties()); // añadimos las propiedades del sistema al objeto prop
            prop.load(archivo); // cargamos las propiedades del archivo en el objeto prop

            // asignamos las propiedades del archivo al sistema
            System.setProperty("mi.propiedad.personalizada", "mi valor personalizado 2"); 

            System.setProperties(prop); // asignamos las propiedades del objeto prop (prop, null)

            // mostramos las propiedades del sistema
            System.getProperties().list(System.out);



        } catch (Exception e) {
            System.err.println("No se encontro el archivo");
        }

    }
}
