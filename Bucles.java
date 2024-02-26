public class Bucles {
    public static void main(String[] args) {
        /*Bucles sirven para repetir un conjunto de instrucciones
         * para hacer mas optimo el còdigo
         * 
         * FOR: este se utiliza cuando se sabe la cantidad de 
         * repeticiones que tendra una instrucción
         * 
         * WHILE: repetir un conjunto de instrucciones siempre y cuando cumpla
         * una condición.
         * 
         * DO-WHILE: 
         */
        {System.out.println("Números del 1 al 10 con FOR");
        for (int i = 1; i <= 10 ; i++) {
        System.out.println(i);
        }
    }
        {System.out.println("Números del 1 al 10 con WHILE");
        int i = 10; // contar
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
        {System.out.println("Números del 1 al 10 con DO-WHILE");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 11);
    }
    
    }
}
