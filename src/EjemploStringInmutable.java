 public class EjemploStringInmutable{
    public static void main(String[] args) {
        
        String curso = "Programación Java";
        String profesor = "Juan Brenes";
        
        String resultado = curso.concat(" ".concat(profesor));
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);


        curso.transform(c -> {  // transform es un método y retorna un String
            return c + " por " + profesor;
        });
        System.out.println("curso = " + curso);

        // sino creamos otro string nuevo e intentamos hacer replace sobre el mismo string no se hará
        // porque es inmutable por eso creamos a continuación un nuevo string llamado resultado3
        String resultado3 = resultado.replace("a", "e");  // replace va a reemplazar la a por la e
        System.out.println("resultado3 = " + resultado3);
       
    
    
    
    }
       
       

    }
    
