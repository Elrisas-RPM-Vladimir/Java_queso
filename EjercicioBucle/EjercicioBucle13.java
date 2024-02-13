package EjercicioBucle;

import java.util.Scanner;

public class EjercicioBucle13 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero1, numero2;
        do {
            System.out.print("\033[35m Introduce el primer número entero: ");
            numero1 = s.nextInt();
            System.out.print("\033[36m Introduce el segundo número entero (distinto del primero): ");
            numero2 = s.nextInt();

            if (numero1 == numero2) {
                System.out.println("\033[31m Error. Debes introducir dos números distintos.");
            }
        } while (numero1 == numero2);

        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        System.out.println("\033[32m Números entre " + menor + " y " + mayor + ", incrementando de 7 en 7:");
        for (int i = menor; i <= mayor; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        s.close();
    }
}
