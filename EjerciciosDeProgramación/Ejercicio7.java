package EjerciciosDeProgramación;
public class Ejercicio7 {
    public static void main(String[] args) {
        int altura = 5; // Altura de la pirámide

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int k = 1; k <= 2 * i - 3; k++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
