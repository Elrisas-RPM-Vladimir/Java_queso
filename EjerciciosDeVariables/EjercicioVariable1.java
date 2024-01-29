package EjerciciosDeVariables;

public class EjercicioVariable1 {
    /**
     * @param args
    /** */
    public static void main(String[] args) {
        int x;  // Declara la variable x como entero

        x = 144; // Asignar el valor 144 a la variable x

        // Muestra el valor de x

        int y; // Declarar la variable y como entero

        y = 999; // Asignar el valor 999 a la variable y

        // Muestra el valor de y

        System.out.println(x);
        System.out.println(y);
        /*
         * Operadores aritmeticos
         * + suma
         * - resta
         * * multiplica
         * / división
         */
        System.out.println(x +" + "+ y +" = "+ (x + y));
        System.out.println(x +" - "+ y +" = "+ (x - y));
        System.out.println(x +" / "+ y +" = "+ (x / y));
        System.out.println(x +" / "+ y +" = "+ ((double) x / y) +" Con decimales");
        System.out.println(x +" * "+ y +" = "+ (x * y));
    }
}

