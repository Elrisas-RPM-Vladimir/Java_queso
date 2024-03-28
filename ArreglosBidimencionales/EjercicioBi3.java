package ArreglosBidimencionales;

import java.util.Random;

public class EjercicioBi3 {
    public static void main(String[] args) {
        int[][] numeros = new int[4][5];
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Número en la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                numeros[i][j] = rand.nextInt(900) + 100;
            }
        }

        System.out.println("\nTabla de números:");
        int plusUltra = 0;
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print(numeros[i][j] + "\t");
                sumaFila += numeros[i][j];
                plusUltra += numeros[i][j];
            }
            System.out.println("| Suma fila " + (i + 1) + ": " + sumaFila);
        }
        System.out.println("---------------------------------");
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += numeros[i][j];
            }
            System.out.print(sumaColumna + "\t");
        }
        System.out.println("|");
        System.out.println("---------------------------------");
        System.out.println("Suma total: " + plusUltra);
    }
}
