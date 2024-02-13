package EjercicioBucle;

import java.util.Scanner;

public class EjercicioBucle11 {
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\033[32m Introduce un número entero positivo mayor que 1: ");
        int numero = s.nextInt();
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo) {
            System.out.println(numero + "\033[33m es un número primo.");
        } else {
            System.out.println(numero + "\033[36m no es un número primo.");
        }

        s.close();
    }
}