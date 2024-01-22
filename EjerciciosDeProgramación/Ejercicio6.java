package EjerciciosDeProgramación;
public class Ejercicio6 {
    public static void main(String[] args) {
        int altura = 5; // Altura de la pirámide

        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios en blanco a la izquierda
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Imprimir salto de línea
            System.out.println();
        }
    }
}

