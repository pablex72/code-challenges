package POO_Exercises.ex4Atletismo;

import POO_Exercises.Vehiculo;

import java.util.Scanner;

public class Principal {

    //metodo conseguir el numro de atleta ganador

    public static int indexWinner(Atleta atletas[]){
        float time;
        int indice = 0;

        time = atletas[0].getTime();
        for (int i=1; i< atletas.length; i++){
            if (atletas[i].getTime() < time){
                time = atletas[i].getTime();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        int number;
        float time;
        int numeroAtletas, indiceWinner;


        System.out.println("digite la cantidad de atletas ");
        numeroAtletas = scanner.nextInt();

        //creamos los objetos  para los coches // array de objetos
        Atleta atletas[] = new Atleta[numeroAtletas];

        for (int i = 0; i<atletas.length; i++){
            scanner.nextLine();
            System.out.println("digite caractereisticas del atleta " + (i+1));
            System.out.println("introduzca nombre ");
            name = scanner.nextLine();
            System.out.println("introduzca number ");
            number = scanner.nextInt();
            System.out.println("introduzca time ");
            time = scanner.nextFloat();

            atletas[i] = new Atleta(number, name, time);
        }

        indiceWinner = indexWinner(atletas);
        System.out.println("\n el atleta ganador es ");
        System.out.println(atletas[indiceWinner].mostrarDatos());
    }
}
