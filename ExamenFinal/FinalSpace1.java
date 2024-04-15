package ExamenFinal;

import java.util.Scanner;

public class FinalSpace1 {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de uso se los equipos de construcción: ");
        Scanner s = new Scanner(System.in);
        int dias = s.nextInt();
        double total = calcularMontoTotal(dias);
        double montoconIGV = calcularMontoConIGV(total);

        System.out.println("\033[91m El monto total a pagar por " + dias + " días de uso es: $" + total);
        System.out.println("\033[92m El monto total a pagar con IGV incluido es: $" + montoconIGV);
        System.out.println("\033[37m");
    }

    public static double calcularMontoTotal(int dias) {
        double total = 0;
        if (dias <= 100) {
            total = 14500.00;
        } else if (dias > 100 && dias <= 150) {
            total = 17000.00;
        } else if (dias > 150 && dias <= 200) {
            total = 17000.00 + 1000.00 * (dias - 150);
        } else if (dias > 200) {
            total = 20000.00 + 400.00 * (dias - 200);
        }
        return total;
    }

    public static double calcularMontoConIGV(double monto) {
        double montoconIGV = monto * 18/100;
        return montoconIGV;
    }
}

