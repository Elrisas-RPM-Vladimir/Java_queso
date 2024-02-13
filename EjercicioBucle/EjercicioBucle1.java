package EjercicioBucle;

public class EjercicioBucle1 {
    public static void main(String[] args) {
        System.out.println("Los múltiplos de 5 en el rango de 0 a 100 son: ");
        
        for (int i = 0; i <= 100; i++) {
        if (i % 5 == 0) {
            System.out.println(i);
            }
        }
    }
}