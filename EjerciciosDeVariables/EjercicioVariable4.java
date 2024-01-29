package EjerciciosDeVariables;

public class EjercicioVariable4 {
    public static void main(String[] args) {
        // Cantidad en soles a convertir
        double soles1 = 200.0;
        double soles2 = 100.0;
        double soles3 = 150.0;
        double soles4 = 300.0;
        // Tasa de cambio: 1 euro = 4.2 soles (cambio ficticio)
        double tasaCambio = 4.2;

        // Mostrar el resultado por pantalla
        System.out.println(soles1 + " soles equivalen a "+ tasaCambio +" euros."+ (soles1 / tasaCambio));
        System.out.println(soles2 + " soles equivalen a "+ tasaCambio +" euros."+ (soles2 / tasaCambio));
        System.out.println(soles3 + " soles equivalen a "+ tasaCambio +" euros."+ (soles3 / tasaCambio));
        System.out.println(soles4 + " soles equivalen a "+ tasaCambio +" euros."+ (soles4 / tasaCambio));
    }
}
