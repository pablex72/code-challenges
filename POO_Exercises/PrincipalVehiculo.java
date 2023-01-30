package POO_Exercises;

import java.util.Scanner;

public class PrincipalVehiculo {

    //se pasara un arreglo de objetos de la clase vehiculo
    //cual de los coches tiene el menor precio
    public static int indiceCocheMBarato(Vehiculo coches[]){
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for(int i=1; i<coches.length; i++){
            if (coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;

        System.out.println("digite la cantidad de vehiculos ");
        numeroVehiculos = scanner.nextInt();

        //creamos los objetos  para los coches // array de objetos
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];

        for (int i = 0; i<coches.length; i++){
            scanner.nextLine();
            System.out.println("digite caractereisticas del coche " + (i+1));
            System.out.println("introduzca marca ");
            marca = scanner.nextLine();
            System.out.println("introduzca modelo ");
            modelo = scanner.nextLine();
            System.out.println("introduzca precio ");
            precio = scanner.nextFloat();

            coches[i] = new Vehiculo(marca, modelo, precio);
        }

        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\n el coche mas barato es ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
