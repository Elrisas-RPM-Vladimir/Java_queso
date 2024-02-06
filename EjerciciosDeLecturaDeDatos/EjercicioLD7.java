package EjerciciosDeLecturaDeDatos;

import java.util.Scanner;

public class EjercicioLD7 {
        public static void main(String[] args) {
            double TarifaPorHora = 12.0;
      Scanner s = new Scanner(System.in);
        
        System.out.println("\033[31m Ingresa la hora chambeada de la semana: ");
        double HorasTrabajadas = s.nextDouble();

        System.out.println("\033[36m Las horas trabajadas: "+ HorasTrabajadas +" horas");
        System.out.println("\033[34m La tarifa por la hora: "+ TarifaPorHora +" soles");

        double salarioSemana = TarifaPorHora * HorasTrabajadas;
        System.out.println("\033[35m El salario semanal es: " + salarioSemana + " soles");
    }
}
