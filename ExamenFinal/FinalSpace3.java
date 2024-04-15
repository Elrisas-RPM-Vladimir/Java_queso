package ExamenFinal;

import java.util.Scanner;

public class FinalSpace3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("\033[36m Bienvenido a la pastelería Tìa Veneno. Vamos a calcular el presupuesto para su tarta.");
        System.out.println("Elija el sabor de la tarta: ");
        System.out.println("1. Manzana (S/.18)");
        System.out.println("2. Fresa (S/.16)");
        System.out.println("3. Chocolate (negro: S/.14, blanco: S/.15)");

        int opcionsabor = s.nextInt();
        double base = 0.0;
        String tipoTarta = "";

        switch (opcionsabor) {
            case 1:
                base = 18.0;
                tipoTarta = "Tarta de Manzana";
                break;
            case 2:
                base = 16.0;
                tipoTarta = "Tarta de Fresa";
                break;
            case 3:
                System.out.println("\033[92m ¿Qué tipo de chocolate desea?");
                System.out.println("1. Chocolate negro (S/.14)");
                System.out.println("2. Chocolate blanco (S/.15)");
                int opcionChocolate = s.nextInt();
                if (opcionChocolate == 1) {
                    base = 14.0;
                    tipoTarta = "Tarta de Chocolate Negro";
                } else if (opcionChocolate == 2) {
                    base = 15.0;
                    tipoTarta = "Tarta de Chocolate Blanco";
                }
                break;
            default:
                System.out.println("\033[91m Opción no válida.");
                return;
        }
        System.out.println("¿Desea añadir nata a la tarta? (s/n)");
        String opcionNata = s.next().toLowerCase();
        if (opcionNata.equals("s")) {
            base += 2.50;
        }
        System.out.println("¿Desea personalizar la tarta con un nombre? (s/n)");
        String opcionNombre = s.next().toLowerCase();
        if (opcionNombre.equals("s")) {
            base += 2.75;
        }
        System.out.println("\033[92m Presupuesto para su tarta:");
        System.out.println("Tipo de tarta: " + tipoTarta);
        System.out.println("Precio base: S/." + base);
    }
}
