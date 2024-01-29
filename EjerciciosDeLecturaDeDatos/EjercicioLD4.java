package EjerciciosDeLecturaDeDatos;

import java.util.Scanner;

public class EjercicioLD4 {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
        
        System.out.println("\033[32m Ingresa dos números, por escacios: ");
        double x = s.nextDouble();
        double y = s.nextDouble();

        System.out.println("\033[35m x es igual a: "+ x);
        System.out.println("\033[36m y es igual a: "+ y);
        /*
         * Operadores aritmeticos
         * + suma
         * - resta
         * * multiplica
         * / división
         */
        System.out.println("\033[33m"+ x +" + "+ y +" = "+ (x + y));
        System.out.println(x +" - "+ y +" = "+ (x - y));
        System.out.println(x +" / "+ y +" = "+ (x / y));
        System.out.println(x +" / "+ y +" = "+ ((double) x / y) +" Con decimales");
        System.out.println(x +" * "+ y +" = "+ (x * y));
    }
}
