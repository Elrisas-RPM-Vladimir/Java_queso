package ExamenFinal;

import java.util.Scanner;

public class FinalSpace2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Venta de entradas CineCampa para ver la sinegrita");
        System.out.print("Número de entradas por persona, por favor: ");
        int personas = s.nextInt();
        
        System.out.print("Semana: ");
        String semana = s.next().toLowerCase();

        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        String tarjeta = s.next().toLowerCase();

        double preciobase = 8.0;
        double total = 0.0;

        if (semana.equals("miércoles")) {
            preciobase = 5.0;
        } else if (semana.equals("jueves")) {
            int parejas = personas / 2;
            int individuales = personas % 2;
            total = parejas * 11.0 + individuales * preciobase;
        } else {
            total = personas * preciobase;
        }

        if (tarjeta.equals("s")) {
            double descuento = total * 0.10;
            total -= descuento;
        }

        System.out.println("Aquí tiene sus entradas cholo. Gracias por su plata.");
        System.out.println("Entradas para abandonados: " + personas);
        System.out.println("Precio por entrada individual: "+ "S/."+ preciobase);
        System.out.println("Total:     "+ "S/."+ (preciobase * personas));
        System.out.println("Descuento: "+ "S/."+ (total == 0.0 ? "S/. 0.00" : (total - (preciobase * personas))));
        System.out.println("A pagar:   "+ "S/."+ total);
    }
}
