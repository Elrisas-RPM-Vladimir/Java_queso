import java.util.Random;

public class BarajeandoCartasdeManeraInsana {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Barajeando cartas, ¿haber qué te tocará?");
        String[] cartas = {"pica", "corazones", "diamantes", "treboles"};
        String[] literales = {"J", "Q", "K", "A"};
        String[] numerales = {"2", "3", "4", "5", "6", "7", "8", "9"};
        int i = r.nextInt(4);
        String palo = cartas[i];

        String baraja;
        if (r.nextBoolean()) {
            int indiceNumerales = r.nextInt(9);
            baraja = numerales[indiceNumerales];
        } else {
            int indiceLiterales = r.nextInt(4);
            baraja = literales[indiceLiterales];
        }
        System.out.println("La carta que te tocó de la baraja es: ["+ baraja +" de "+ palo +"]");
    }
}
