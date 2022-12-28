public class Array {
    public static void main(String[] args) {
        //int arrayUno[] = {1,2,3,4,5};

        String nombres[] = {
                "Pepe",
                "Juan",
                "Francisco"
        };

        System.out.println("Longitud del array:  " + nombres.length);
        for (String nombre: nombres ) {
            System.out.println(nombre);
        }

        String ultimoNombre = "";
        for (int i = 0; i<nombres.length; i++){
            System.out.println("nombre actual:  " + nombres[i] + "en posicion: " + i );
            ultimoNombre = nombres[i];
        }
        System.out.println(ultimoNombre);

        int contador = 0;
        while(contador < nombres.length){
            System.out.println("nombre actual: " + nombres[contador] + "en posicion " + contador);
            contador++;
        }

        //Array Multidimensional
        int arrayBid[][] = new int[2][4];
        arrayBid[0][0] = 1;
        arrayBid[0][1] = 2;
        arrayBid[0][2] = 3;
        arrayBid[0][3] = 4;

        arrayBid[1][0] = 10;
        arrayBid[1][1] = 20;
        arrayBid[1][2] = 30;
        arrayBid[1][3] = 40;

        for(int i = 0; i<arrayBid.length; i++){
            System.out.println("Valor de i: " + i);
            for(int j = 0; j < arrayBid[1].length; j++){
                System.out.println("Estoy en i = " + i + ", j = " + j);
                System.out.println(arrayBid[i][j]);
            }
        }
    }
}
