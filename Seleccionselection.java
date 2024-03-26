public class Seleccionselection {
    public static void main(String[] args) {
             
        int numeros[] = new int[]{8,2,3,20,5,0,1,9,12,14,13,7,15,10,19,4,18,6,11,16,17};
        //Declaración del array que en este caso sera un Array unidimencional

        for(int dato:numeros){
            System.out.print(dato+", ");
        } //Con for empezamos a generar los datos puestos por el array


        //Aqui empezamos con el Algoritmo de selección(SelectionSort), para empezar a seleccionar a los numeros,
        //de menor a mayor.
        for(int Ordenar = 0; Ordenar < numeros.length -1; Ordenar++){ 
            //Creamos el valor ordenar para empezar el comando selection, por el cual creamos el Minimo
            int Minimo = Ordenar; //para empezar a recorre el Array
            for(int comp = Ordenar+1; comp < numeros.length; comp++){
                //el comp(comparar) será quien seleccione los valores menores del array para
                //seleccionar los números para su respectiva clasificación
                if(numeros[comp] < numeros[Minimo]){
                    Minimo = comp;
                } 
                //hacemos que la condición if seleccione los numeros con comp para cumplir con
                //que los numeros se ordenen de manera ascendente.
            }
            int auxiliar = numeros[Ordenar];
            numeros[Ordenar] = numeros[Minimo];
            numeros[Minimo] = auxiliar;
            //El int auxiliar generara los números de manera ordenada de acuerdo a los datos que
            //le indica el SelectionSort
        }
        System.out.println("");
        System.out.println("Datos ordenados:");
        for(int dato:numeros){
        System.out.print(dato +", ");
        } //Después de ordenar el array, este bloque de código imprime los datos nuevamente,
        //pero esta vez después de que han sido ordenados. Para evitar conflictos de código
    }
    
}