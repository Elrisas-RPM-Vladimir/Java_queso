package EjerciciosDeVariables;

public class EjercicioVariable1 {
    public static void main(String[] args) {
        int x; // Declara la variable x como entera
        x = 144; // Asigna el valor 144 a la variable x
        // Muestra el valor de x

        int y; // Declara la variable y como entera
        y = 999; // Asigna el valor 999 a la variable x
        // Muestra el valor de y
        System.out.println(x +" + "+ y +" = "+ (x + y));
        System.out.println(x +" - "+ y +" = "+ (x - y));
        System.out.println(x +" / "+ y +" = "+ (x / y));
        System.out.println(x +" / "+ y +" = "+ ((double) x / y) +" Con decimales");
        System.out.println(x +" * "+ y +" = "+ (x * y));
    }
}