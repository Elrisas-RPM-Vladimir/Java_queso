package ExamenFinal;

import java.util.Random;

import java.util.Scanner;

public class FinalSpace6 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(401);
        }

        System.out.println("Array original:");
        mostrarArray(array);
            Scanner s = new Scanner(System.in);
            System.out.println("\n¿Qué números quiere resaltar?: ");
            System.out.println("múltiplos de 5");
            System.out.println("múltiplos de 7");
            int opcion = s.nextInt();
            System.out.println("\nArray con números resaltados:");
            mostrarArrayResaltado(array, opcion);
            }

            public static void mostrarArray(int[] array) {
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }
            public static void mostrarArrayResaltado(int[] array, int opcion) {
                for (int i = 0; i < array.length; i++) {
                    if ((opcion == 1 && array[i] % 5 == 0) || (opcion == 2 && array[i] % 7 == 0)) {
                        System.out.print("[" + array[i] + "] ");
                    } else {
                        System.out.print(array[i] + "; ");
                    }
                }
                System.out.println();
    }    
}
