public class ClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-10);  // valor absoluto
        System.out.println("absoluto = " + absoluto);

        double random = Math.random();  // entre 0 y 1
        System.out.println("random = " + random);
         
        double max = Math.max(10, 20);  // maximo
        System.out.println("max = " + max);

        double min = Math.min(10, 20);  // minimo
        System.out.println("min = " + min);

        double redondeoArriba = Math.ceil(10.5);  // redondea hacia arriba
        System.out.println("redondeoArriba = " + redondeoArriba);

        double redondeoAbajo = Math.floor(10.5);  // redondea hacia abajo
        System.out.println("redondeoAbajo = " + redondeoAbajo);

        double redondeo = Math.round(10.5);  // redondea hacia arriba o  abajo depende de la parte decimal
        System.out.println("redondeo = " + redondeo);

        double raizCuadrada = Math.sqrt(100);  // raiz cuadrada
        System.out.println("raizCuadrada = " + raizCuadrada);

        double raizCubica = Math.cbrt(100);  // raiz cubica
        System.out.println("raizCubica = " + raizCubica);

        double seno = Math.sin(Math.PI / 2);  // seno
        System.out.println("seno = " + seno);

        double coseno = Math.cos(Math.PI / 2);  // coseno
        System.out.println("coseno = " + coseno);   

        double tangente = Math.tan(Math.PI / 2);  // tangente
        System.out.println("tangente = " + tangente);   

        double arcoseno = Math.asin(1);  // arcoseno
        System.out.println("arcoseno = " + arcoseno);

        double PI = Math.PI;  // PI
        System.out.println("PI = " + PI);

        double E = Math.E;  // E
        System.out.println("E = " + E);

        double logaritmo = Math.log(10);  // logaritmo natural
        System.out.println("logaritmo = " + logaritmo);

        double potencia = Math.pow(2, 10);  // potencia
        System.out.println("potencia = " + potencia);

        double grados = Math.toDegrees(1.57);  // grados
        System.out.println("grados = " + grados);

        double radianes = Math.toRadians(90);  // radianes
        System.out.println("radianes = " + radianes);
    }
    
}
