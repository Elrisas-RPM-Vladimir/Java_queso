package EjerciciosDeSCondi;

import java.util.Scanner;

public class EjercicioSC03 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        double solucion;

        switch ((int)a) {
            case 0:
                if (b == 0) {
                    System.out.println("La ecuación tiene infinitas soluciones.");
                } else {
                    System.out.println("La ecuación no tiene solución.");
                }
                break;
            default:
                solucion = -b / a;
                System.out.println("La solución de la ecuación " + a + "x + " + b + " = 0 es x = " + solucion);
                break;
        }

        scanner.close();
    }
}
