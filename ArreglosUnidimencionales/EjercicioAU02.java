package ArreglosUnidimencionales;

import java.util.Scanner;

public class EjercicioAU02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("\033[36m Introduce los siguientes 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Números "+ (i + 1) +": ");
            numeros[i] = s.nextInt();
        }
        System.out.println("\033[91m Números en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Números "+ (i + 1) +": "+ numeros[i]);
        }
    }
}
