package ExamenFinal;

import java.util.Scanner;

public class FinalSpace7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el valor mínimo: ");
        int min = s.nextInt();
        System.out.print("Introduce el valor máximo: ");
        int max = s.nextInt();
        if (min >= max) {
            System.out.println("Error: El valor mínimo debe ser menor que el valor máximo.");
            return;
        }
        System.out.print("Introduce el tamaño del grupo para visualizar los números: ");
        int grupo = s.nextInt();

        }
    }
