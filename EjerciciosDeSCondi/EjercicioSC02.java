package EjerciciosDeSCondi;

import java.util.Scanner;

public class EjercicioSC02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\033[32m Introdusca las horas trabajadas de la semana: ");
        int horas = s.nextInt();
        System.out.print("\033[35m Paga por hora: ");
        int soles = 12;

        if (horas > 40) {
            horas += soles;
        }

        String period = (horas < 40) ? "AM" : "PM";
        horas = (horas > 40) ? horas : horas;

        switch (period) {
            case "AM":
                System.out.println("\033[33m La hora trabajadas es: " + horas + ", la paga es de:" + soles + " soles");
                break;
            default:
                System.out.println("\033[31m ");
                break;
        }
    }
}
