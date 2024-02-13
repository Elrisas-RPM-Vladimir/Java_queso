package EjercicioBucle;

import java.util.Scanner;

public class EjercicioBucle10 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int cantidadPositivos = 0;
        int cantidadNegativos = 0;

        System.out.println("\033[35m Introduce diez números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("\033[33m Número "+ (i + 1) +": ");
            int numero = s.nextInt();

            if (numero > 0) {
                cantidadPositivos++;
            } else if (numero < 0) {
                cantidadNegativos++;
                }
            }
            System.out.println("\033[32m Cantidad de números positivos: " + cantidadPositivos);
            System.out.println("\033[31m Cantidad de números negativos: " + cantidadNegativos);
        s.close();
    }
}