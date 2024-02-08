import java.util.Scanner;

public class HoraDelDia02 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\033[32m Introduzca la hora en formato 24 horas: ");
        int hour = s.nextInt();
        System.out.print("\033[35m Introduzca los minutos: ");
        int minutes = s.nextInt();

        if (minutes > 60) {
            hour += minutes / 60;
            minutes = minutes % 60;
        }

        String period = (hour < 12) ? "AM" : "PM";
        hour = (hour > 12) ? hour - 12 : hour;

        switch (period) {
            case "AM":
                System.out.println("\033[33m La hora es: " + hour + ":" + minutes + " AM");
                break;
            case "PM":
                System.out.println("\033[36m La hora es: " + hour + ":" + minutes + " PM");
                break;
            default:
                break;
        }
    }
}
