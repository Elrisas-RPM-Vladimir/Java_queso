package EjerciciosDeProgramación;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Establecer códigos ANSI para colores
        String reset = "\u001B[0m";
        String cyan = "\u001B[36m";
        String yellow = "\u001B[33m";
        String magenta = "\u001B[35m";
        String green = "\u001B[32m";
        String red = "\u001B[31m";

        System.out.println("┌──────────────────────┬─────────────────────┬──────────────────────┬──────────────────────┬──────────────────────┐");
        System.out.println("│          Lunes       │         Martes      │       Miércoles      │         Jueves       │         Viernes      │");
        System.out.println("├──────────────────────┼─────────────────────┼──────────────────────┼──────────────────────┼──────────────────────┤");
        System.out.println("│ " + cyan + "Algorit. y Program 1" + reset + " │ " + cyan + "Algorit y Program 1" + reset + " │    " + yellow + "Ing. Sistemas" + reset + "     │    " + yellow + "Ing. Sistemas" + reset + "     │     " + magenta + "Estadística" + reset + "      │");
        System.out.println("├──────────────────────┼─────────────────────┼──────────────────────┼──────────────────────┼──────────────────────┤");
        System.out.println("│       " + red + "Economía" + reset + "       │      " + green + "Cálculo 1" + reset + "      │     " + magenta + "Estadística" + reset + "      │                      │      " + red + "Cálculo 1" + reset + "       │");
        System.out.println("├──────────────────────┼─────────────────────┼──────────────────────┼──────────────────────┼──────────────────────┤");
        System.out.println("│ " + yellow + "Matemática Discreta" + reset + "  │ " + yellow + "Matemática Discreta" + reset + " │      " + red + "Economía" + reset + "        │                      │                      │");
        System.out.println("│                      │                     │                      │                      │                      │");
        System.out.println("└──────────────────────┴─────────────────────┴──────────────────────┴──────────────────────┴──────────────────────┘");
    }
}
