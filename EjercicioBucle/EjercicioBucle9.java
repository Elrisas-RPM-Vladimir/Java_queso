package EjercicioBucle;

import java.util.Scanner;

public class EjercicioBucle9 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
                System.out.print(" \033[36m Introduce un número entero: ");
            int numeroInicial = s.nextInt();

            System.out.println("\033[32m Número   Cuadrado   Cubo");
            System.out.println("-------   --------   ----");

            for (int i = numeroInicial; i < numeroInicial + 5; i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%-9d%-11d%d%n", i, cuadrado, cubo);
        }
        s.close();
    }
}