package ArreglosUnidimencionales;

import java.util.Scanner;

public class EjercicioAU04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int[] numeros = new int[10];

        System.out.println("\033[36m Introduce los siguientes 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Números "+ (i + 1) +": ");
            numeros[i] = s.nextInt();
            mayor = Math.max(mayor, numeros[i]);
            menor = Math.min(menor, numeros[i]);
        }
        System.out.println("Números introducidos:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == mayor) {
                System.out.print(" mayor");
            }
            if (numeros[i] == menor) {
                System.out.print(" mmenor");
            }
            System.out.println();
        }
    }
}
