package EXP1examenVOC;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Los números del 1 al 1000, contando de 20 en 20: ");
        Scanner s = new Scanner(System.in);
        int inicio = 1;
        int fin = 1000;
        int grupo = 20;

        System.out.println("Números del 1 al 1000 de 20 en 20:");
        for (int i = inicio; i <= fin; i += grupo) {
            for (int j = i; j < i + grupo && j <= fin; j++) {
                System.out.print(j + " - ");
            }
            System.out.println();
            System.out.println("¿Quiere continuar? (S/N)");
            String respuesta = s.nextLine();
            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        }
        System.out.println("Introduzca dos valores enteros para mostrar los números entre ellos:");
        inicio = s.nextInt();
        fin = s.nextInt();
        System.out.println("Introduzca el tamaño del grupo:");
        grupo = s.nextInt();
        System.out.println("Números entre "+ inicio +" y "+ fin +" de "+ grupo +" en "+ grupo +":");
        for (int i = inicio; i <= fin; i += grupo) {
            for (int j = i; j < i + grupo && j <= fin; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            System.out.println("¿Quiere continuar? (S/N)");
            String respuesta = s.nextLine();
            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        }
    }
}