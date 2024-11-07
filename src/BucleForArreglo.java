
import javax.swing.JOptionPane;

public class BucleForArreglo {
    public static void main(String[] args) {
        
        String [] nombres = {"Pedro", "Maria", "Jose", "Juan", "Ana", "Luis", "Carlos"};// declaro un arreglo de Strings
        int count = nombres.length; // obtengo la longitud del arreglo

        for (int i = 0; i <= count -1; i++) {  // bucle para recorrer el arreglo
            if(nombres[i].equalsIgnoreCase("Juan")){  // si el elemento es igual a Juan
                continue; // salta a la siguiente iteracion
            }
            System.out.print(nombres[i] + " ");  // imprime el valor de cada elemento
        }
        System.out.println("");
        System.out.println("El arreglo tiene " + count + " elementos");


        //Otro ejemplo como buscar un elemento

        String buscar = JOptionPane.showInputDialog("Dame el nombre a buscar");
        System.out.println("Buscando: " + buscar);

        boolean encontrado = false;

        for (int i = 0; i <= count -1; i++) {  // bucle para recorrer el arreglo
            if(nombres[i].equalsIgnoreCase(buscar)){  // si el elemento es igual a los nombres del arreglo
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, "Encontrado");
        }else{
            JOptionPane.showMessageDialog(null, "No encontrado");
        }

    }
    
}
