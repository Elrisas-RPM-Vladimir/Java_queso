package EjercicioBucle;

import java.util.Scanner;

public class EjercicioBucle12 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("\033[36m Introduce un número entero positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.println("\033[33m Error. Debes introducir un número entero positivo.");
                System.out.print("Introduce un número entero positivo: ");
                scanner.next();
            }
            numero = scanner.nextInt();
        } while (numero <= 0);

        long suma = 0;
        for (int i = numero + 1; i <= numero + 100; i++) {
            suma += i;
        }

        System.out.println("La suma de los 100 números siguientes a " + numero + " es: " + suma);
        scanner.close();
    }
}