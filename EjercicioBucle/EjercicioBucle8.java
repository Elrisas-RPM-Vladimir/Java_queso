package EjercicioBucle;

import java.util.Scanner;

public class EjercicioBucle8 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print(" \033[36m Introduce un número entero: ");
        long numero = s.nextLong();

        int contadorDigitos = 0;
        long numeroTemporal = Math.abs(numero);

        do {
            numeroTemporal /= 10;
            contadorDigitos++;
        } while (numeroTemporal != 0);

        System.out.println(" \033[32m El número "+ numero +" tiene "+ contadorDigitos +" dígitos.");
        s.close();
    }
}