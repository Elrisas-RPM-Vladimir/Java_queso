package EjerciciosDeSCondi;

import java.util.Scanner;

public class EjercicioSC02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[91m Ingrese las horas trabajadas esta semana: ");
        int horasTrabajadas = scanner.nextInt();

        double salario;

        switch (horasTrabajadas) {
            case 0:
                salario = 0;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                salario = horasTrabajadas * 12;
                break;
            default:
                salario = 40 * 12 + (horasTrabajadas - 40) * 16;
                break;
        }

        System.out.println("\033[92m El salario semanal es: " + salario + " soles");

        scanner.close();
    }
}