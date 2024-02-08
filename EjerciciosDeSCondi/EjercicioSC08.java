package EjerciciosDeSCondi;

import java.util.Scanner;

public class EjercicioSC08 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        boolean esPar = (numero % 2 == 0);
        boolean esDivisiblePor5 = (numero % 5 == 0);

        switch (esPar ? 1 : 0) {
            case 1:
                System.out.println(numero + " es par.");
                break;
            default:
                System.out.println(numero + " no es par.");
                break;
        }

        switch (esDivisiblePor5 ? 1 : 0) {
            case 1:
                System.out.println(numero + " es divisible entre 5.");
                break;
            default:
                System.out.println(numero + " no es divisible entre 5.");
                break;
        }
        scanner.close();
    }
}
