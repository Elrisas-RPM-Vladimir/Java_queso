package EXP1examenVOC;

import java.util.Scanner;

public class ejercicio4 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int diasMes[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int año, mes, dia;
        int numeromagico;
        //va a leer los dias, meses y año introducido para el número magico
        System.out.println("Introduzca el Dia, mes y año de su fecha de nacimiento:");
        System.out.print("Día: ");
        dia = s.nextInt();
        System.out.print("Mes: ");
        mes = s.nextInt();
        System.out.print("Año: ");
        año = s.nextInt();
// if realizara una examinación de los valores introducidos para su respectiva inspección y verificación
        if (año <= 0 || mes < 1 || mes > 12 || dia < 1 || dia > diasMes[mes-1]) {
            System.out.println("Fecha inválida.");
            s.close();
            return;
        } //Luego verifica si la fecha es válida
        //teniendo en cuenta que el número de días del mes de febrero es 28 
        //independientemente del año
        
        numeromagico = sumDigits(año) + sumDigits(mes) + sumDigits(dia);
        while (numeromagico >= 10) {
            numeromagico = sumDigits(numeromagico);
        }//Si la fecha es válida, calcula el número mágico asociado a esa fecha y lo muestra por pantalla
        //Si la fecha no es válida, muestra un mensaje de error.
        System.out.println("El número mágico asociado a su fecha de nacimiento es: "+ numeromagico);
    }
    private static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
