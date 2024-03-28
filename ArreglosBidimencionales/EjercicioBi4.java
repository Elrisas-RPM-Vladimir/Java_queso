package ArreglosBidimencionales;

import java.util.Random;

public class EjercicioBi4 {
    public static void main(String[] args) {
        int[][] numeros = new int[4][5];
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = rand.nextInt(900) + 100;
            }
        }
        System.out.println("Tabla de números:");
        mostrarConRetraso(numeros, 1000);
        calcularYMostrarSumas(numeros);
    }
    public static void mostrarConRetraso(int[][] array, int retraso) {
        try {
            Thread.sleep(retraso);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void calcularYMostrarSumas(int[][] array) {
        int plusUltra = 0;
        for (int i = 0; i < array.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumaFila += array[i][j];
                plusUltra += array[i][j];
            }
            System.out.print("| Suma fila " + (i + 1) + ": " + sumaFila + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("|");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("---------------------------------");
        for (int j = 0; j < array[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < array.length; i++) {
                sumaColumna += array[i][j];
            }
            System.out.print(sumaColumna + "\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("|");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("---------------------------------");
        System.out.println("Suma total: " + plusUltra);
    }
}
