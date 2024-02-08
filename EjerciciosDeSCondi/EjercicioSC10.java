package EjerciciosDeSCondi;

import java.util.Scanner;

public class EjercicioSC10 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Programador junior");
        System.out.println("2 - Programador senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = scanner.nextInt();

        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int diasViaje = scanner.nextInt();

        System.out.println("1 - Soltero");
        System.out.println("2 - Casado");
        System.out.print("Introduzca su estado civil (1 - 2): ");
        int estadoCivil = scanner.nextInt();
        double sueldoBase;
        switch (cargo) {
            case 1: 
                sueldoBase = 950.00;
                break;
            case 2: 
                sueldoBase = 1200.00;
                break;
            case 3: 
                sueldoBase = 1600.00;
                break;
            default:
                System.out.println("Cargo no válido.");
                return;
        }

        double dietas = diasViaje * 30.00;

        double sueldoBruto = sueldoBase + dietas;

        double retencionIRPF;
        switch (estadoCivil) {
            case 1: 
                retencionIRPF = sueldoBruto * 0.25;
                break;
            case 2: 
                retencionIRPF = sueldoBruto * 0.20;
                break;
            default:
                System.out.println("Estado civil no válido.");
                return;
        }
        double sueldoNeto = sueldoBruto - retencionIRPF;

        System.out.println("---------------------------------");
        System.out.println("| Sueldo base           " + sueldoBase +        " |");
        System.out.println("| Dietas (" + diasViaje + " viajes)     " + dietas + " |");
        System.out.println("|------------------------------|");
        System.out.println("| Sueldo bruto          " + sueldoBruto + " |");
        System.out.println("| Retención IRPF ("
                + (estadoCivil == 1 ? "25%" : "20%") + ")   " + retencionIRPF + " |");
        System.out.println("|------------------------------|");
        System.out.println("| Sueldo neto           " + sueldoNeto + " |");
        System.out.println("---------------------------------");

        scanner.close();
    }
}
