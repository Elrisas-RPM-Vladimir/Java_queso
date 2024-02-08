package EjerciciosDeSCondi;

import java.util.Scanner;

public class EjercicioSC07 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número entero: ");
        int num3 = scanner.nextInt();
        int temp;
        switch (num1 > num2 ? 1 : 0) {
            case 1:
                temp = num1;
                num1 = num2;
                num2 = temp;
                break;
            default:
                break;
        }
        switch (num1 > num3 ? 1 : 0) {
            case 1:
                temp = num1;
                num1 = num3;
                num3 = temp;
                break;
            default:
                break;
        }
        switch (num2 > num3 ? 1 : 0) {
            case 1:
                temp = num2;
                num2 = num3;
                num3 = temp;
                break;
            default:
                break;
        }
        System.out.println("Los números ordenados son: " + num1 + ", " + num2 + ", " + num3);
        scanner.close();
    }
}
