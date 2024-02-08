package EjerciciosDeSCondi;

import java.util.Scanner;

public class EjercicioSC09 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base imponible del producto: ");
        double baseImponible = scanner.nextDouble();

        System.out.println("Seleccione el tipo de impuesto aplicado:");
        System.out.println("1. General (21%)");
        System.out.println("2. Reducido (10%)");
        System.out.println("3. Superreducido (4%)");
        System.out.print("Ingrese el número correspondiente: ");
        int tipoImpuesto = scanner.nextInt();

        System.out.println("Seleccione el código promocional:");
        System.out.println("1. Nopro (Sin promoción)");
        System.out.println("2. Mitad (Descuento del 50%)");
        System.out.println("3. Meno5 (Descuento de 5 soles)");
        System.out.println("4. 5porc (Descuento del 5%)");
        System.out.print("Ingrese el número correspondiente: ");
        int codigoPromocional = scanner.nextInt();

        double impuesto = 0;
        double precioFinal = baseImponible;

        switch (tipoImpuesto) {
            case 1: 
                impuesto = baseImponible * 0.21;
                break;
            case 2: 
                impuesto = baseImponible * 0.10;
                break;
            case 3:
                impuesto = baseImponible * 0.04;
                break;
            default:
                System.out.println("Opción de impuesto no válida.");
                return;
        }

        switch (codigoPromocional) {
            case 1: 
                break;
            case 2: 
                precioFinal = precioFinal / 2;
                break;
            case 3:
                precioFinal = precioFinal - 5;
                break;
            case 4:
                precioFinal = precioFinal - (precioFinal * 0.05);
                break;
            default:
                System.out.println("Código promocional no válido.");
                return;
        }

        precioFinal += impuesto;

        System.out.println("El precio final del producto es: " + precioFinal + " soles");

        scanner.close();
    }
}

