package ArreglosUnidimencionales;

import java.util.Scanner;

public class EjercicioAU05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[15];

        System.out.println("\033[36m Introduce los siguientes 15 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Números "+ (i + 1) +": ");
            numeros[i] = s.nextInt();
        }
        int ultimo = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;
        System.out.println("Después de cambiar los lugares:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Números "+ (i + 1) +": "+ numeros[i]);
        }
    }
}
