public class Variables {
    public static void main(String[] args) {
        //Vlariable
        /*
         * Nombre de las Variables, siempre empezar con una letra
         * la nomenglatura lowerComelCase, ejemplos:
         * volumen
         * volumenCilindrico
         * edadMinima / edadMin
         * edad_minima
         * e1a1_23
         */
        /*
         * Tipos de dato
         * Entero(int y long)
         */
        byte edad; // declara una variable de nombre edad y tipo de dato entero
        edad = 18; // asignamos el valor de 18 a la variable edad


        System.out.println(edad);

        edad = 56;
        System.out.println("y ahora es "+edad);


        //Numero decimales (doble y float)
        double x, y;

        x = 7;
        y = 25.01;

        System.out.println(x);
        System.out.println(y);

        /*
         * Cadena de caracteres (String)
         */
        String miPalabra = "Cervesa";
            String miFrase = "¿Quién tomo mi cervesa?";
            System.out.println("Una palabra que uso frecuentemente es: " + miPalabra);
            System.out.println("Una frase que uso a veces es: " + miFrase);


            String cadenaInicial = "";

            /*
             * Caracteres (char)
             */
            char letra1 = 'c';
            char letra2 = 'a';
            char letra3 = 's';
            char letra4 = 'a';

            System.out.println(letra1+""+letra2+""+letra3+""+letra4);
    }
}
