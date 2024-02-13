package EjercicioBucle;

public class EjercicioBucle3 {
    public static void main(String[] args) {
        System.out.println("Los múltiplos de 5 en el rango de 0 a 100 son: ");

        int i = 0; 
        do { if (i % 5 ==0) { 
            System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }
}