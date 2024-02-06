import java.util.Scanner;

public class HoraDelDia {
    public static void main(String[] args) {
         /*
         * Programa que muestra el menu de calculo de switch
         * 
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("\033[92m Introduce la hora (en formato de 24 horas): ");
        System.out.println("\033[94m ____________________________________________");
        int hora = scanner.nextInt();

        String periodo;

        switch (hora) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                periodo = hora +" AM";
                break;
            case 12:
                periodo = hora +" PM";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                periodo = hora +" PM";
                break;
            default:
                periodo = "\u001B[31m No es válida, no exíste";
                break;
        }

        System.out.println("\u001B[35m La hora introducida es: " + periodo);

        scanner.close();
    }
}
