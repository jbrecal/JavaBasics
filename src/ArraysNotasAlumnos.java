
import java.util.Scanner;

public class ArraysNotasAlumnos {
    public static void main(String[] args) {
        
        double[] programacion, baseDatos, sistemas;

        programacion = new double[5]; // para 5 alumnos
        baseDatos = new double[5];
        sistemas = new double[5];
        double sumaProgramacion = 0, sumaBaseDatos = 0, sumaSistemas = 0;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la nota de programacion de 5 alumnos: ");
        for (int i = 0; i < programacion.length; i++) {
            
            programacion[i] = sc.nextDouble();

        }

        System.out.println("Introduce la nota de base de datos de 5 alumnos: ");
        for (int i = 0; i < baseDatos.length; i++) {
            
            baseDatos[i] = sc.nextDouble();

        }

        System.out.println("Introduce la nota de sistemas de 5 alumnoS: ");
        for (int i = 0; i < sistemas.length; i++) {
            
            sistemas[i] = sc.nextDouble();

        }

        //otro for que itere hasta 5 porque son 5 alumnos
        for (int i = 0; i < 5; i++) {
            sumaProgramacion += programacion[i];
            sumaBaseDatos += baseDatos[i];
            sumaSistemas += sistemas[i];
        }
        System.out.println("La media de programacion es: " + (sumaProgramacion / programacion.length));
        System.out.println("La media de base de datos es: " + (sumaBaseDatos / baseDatos.length));
        System.out.println("La media de sistemas es: " + (sumaSistemas / sistemas.length));

        System.out.println("El promedio general es: " + ((sumaProgramacion + sumaBaseDatos + sumaSistemas) / (programacion.length + baseDatos.length + sistemas.length)));

        System.out.println("Ingresa el identificador del alumno del 0 - 5: ");
        int identificador = sc.nextInt();
        double promedioAlumno = (programacion[identificador] + baseDatos[identificador] + sistemas[identificador]) / 3;

        System.out.println("El primedio del alumno " + identificador + " es: " + promedioAlumno);


    }
    
}
