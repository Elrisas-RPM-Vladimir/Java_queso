package ExamenFinal;

import java.util.Scanner;

public class FinalSpace4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduzca la altura de la L: ");
        int altura = s.nextInt();

        int longitudPaloHorizontal = (altura / 2) + 1;

        // Dibujar la letra L
        for (int i = 0; i < altura; i++) {
            if (i < altura - 1) {
                System.out.println("*");
            } else {
                for (int j = 0; j < longitudPaloHorizontal; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
