package EXP1examenVOC;

import java.util.Scanner;

public class ejercicio5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero > 0) {
                contadorPositivos++;
            } else if (numero < 0) {
                contadorNegativos++;
            }
        }
        
        System.out.println("El número de números positivos es: " + contadorPositivos);
        System.out.println("El número de números negativos es: " + contadorNegativos);
        
        scanner.close();
    }
}
