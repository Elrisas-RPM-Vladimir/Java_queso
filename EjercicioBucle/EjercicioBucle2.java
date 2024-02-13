package EjercicioBucle;

public class EjercicioBucle2 {
    public static void main(String[] args) {
        System.out.println("Los múltiplos de 5 en el rango de 0 a 100 son: ");

        int i = 0;
        while (i <= 100) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        i++;
        }
    }
}