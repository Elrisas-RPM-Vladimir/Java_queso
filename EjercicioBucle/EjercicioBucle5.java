package EjercicioBucle;

public class EjercicioBucle5 {
    public static void main(String[] args) {
        System.out.println("Los números del 320 al 160, contando de 20 en 20: ");
        
        int i = 320;
        while (i >= 160) {
            System.out.println(i);
            i -= 20;
        }
    }
}