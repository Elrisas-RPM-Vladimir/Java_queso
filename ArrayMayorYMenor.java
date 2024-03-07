import java.util.Random;
import java.util.Scanner;

public class ArrayMayorYMenor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int[] numero = new int[100];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = r.nextInt(501);
        }
        System.out.println("Array original:");
        mostrarArray(numero);
        System.out.print("\n¿Quiere destacar el máximo o el mínimo? (max/min): ");
        String opcion = s.nextLine().toLowerCase();

        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        for (int num : numero) {
            maximo = Math.max(maximo, num);
            minimo = Math.min(minimo, num);
        }
        System.out.println("\nArray con el número destacado:");
        for (int num : numero) {
            if (opcion.equals("max") && num == maximo) {
                System.out.print("\033[92m**" + num + "** "+ "\033[37m");
            } else if (opcion.equals("min") && num == minimo) {
                System.out.print("\033[91m**" + num + "** "+ "\033[37m");
            } else {
                System.out.print(num + " ");
            }
        }
        s.close();
    }
    public static void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
