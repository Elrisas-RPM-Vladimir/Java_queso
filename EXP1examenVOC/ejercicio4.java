package EXP1examenVOC;

import java.util.Scanner;

public class ejercicio4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diasMes[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int year, month, day;
        int magicNumber;
        
        System.out.println("Introduzca el año, mes y día de su fecha de nacimiento:");
        System.out.print("Año: ");
        year = scanner.nextInt();
        System.out.print("Mes: ");
        month = scanner.nextInt();
        System.out.print("Día: ");
        day = scanner.nextInt();
        
        if (year <= 0 || month < 1 || month > 12 || day < 1 || day > diasMes[month-1]) {
            System.out.println("Fecha inválida.");
            scanner.close();
            return;
        }
        
        magicNumber = sumDigits(year) + sumDigits(month) + sumDigits(day);
        while (magicNumber >= 10) {
            magicNumber = sumDigits(magicNumber);
        }
        
        System.out.println("El número mágico asociado a su fecha de nacimiento es: "+ magicNumber);
        
        scanner.close();
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
