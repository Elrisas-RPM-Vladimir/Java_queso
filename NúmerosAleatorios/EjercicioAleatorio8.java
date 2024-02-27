import java.util.Random;

public class EjercicioAleatorio8 {
    public static void main(String[] args) {
        Random r = new Random();
        String[] figuras = {"corazón", "diamante", "herradura", "campana", "limón"};

        String fg1 = figuras[r.nextInt(figuras.length)];
        String fg2 = figuras[r.nextInt(figuras.length)];
        String fg3 = figuras[r.nextInt(figuras.length)];
        System.out.println("Tirada: " + fg1 + " " + fg2 + " " + fg3);
        if (fg1.equals(fg2) && fg2.equals(fg3)) {
            System.out.println("Enhorabuena, ha ganado 10 monedas.");
        } else if (fg1.equals(fg2) || fg2.equals(fg3) || fg1.equals(fg3)) {
            System.out.println("Bien, ha recuperado su moneda.");
        } else {
            System.out.println("Lo siento, ha perdido.");
        }
    }
}
