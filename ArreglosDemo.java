import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class ArrayInitial1 {

    public static void arrayEx1() {

        int[] numeros = new int[3];

        //2da forma
        //int[] numeros2 = {1,2,3};

        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;
        //return numeros;
        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }
    }
}

class ArregloInputOutput{

    public static void arrEx2()
    {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaSize = new Scanner(System.in);

        System.out.println("introduce the size of: ");
        int nElementos = entradaSize.nextInt();
        char[] letras = new char[nElementos];

        //take data from scanner
        System.out.println("Digite los numeros del arreglo : ");
        for (int i=0; i<nElementos; i++){
            System.out.println((i+1) + ". Digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }

        //print the data
        System.out.println("\n los caracteres del arrreglo son: ");
        for(int i=0; i<nElementos;i++){
            System.out.println(letras[i]+ " ");
        }
    }
}

class ArrayForEach{

    public static void arrExer3(){
        String[] nombres = {"Alejandro", "Maria", "Miguel", "Juan"};

        for (int i =0; i< nombres.length; i++){
            System.out.println(nombres[i]);
        }

        for (String nombre : nombres ) {
            System.out.println("\n" + nombre);
        }
    }
}

class ArraysProb1{

    public static void Ex1(){

        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];

        System.out.println("Guarando los datos en el arreglo ");
        for (int i =0; i<5;i++){
            System.out.println((i+1) + "Digite un numeor");
            numeros[i] = entrada.nextFloat();
        }

        //imprimir

        System.out.println("\n Imprimir los leementos del array");
        for (float num : numeros ) {
            System.out.println(num);
        }
    }
}

/**
 * * Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y a continuación
 * * realizar la media de los números positivos, la media de los negativos y conteo el número de ceros.
 */
class ArraysProb3{
    public static void ex3(){
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];
        float sumaPositivos = 0, sumaNegativos = 0, mediaPositivos, mediaNegativos;
        int conteoPositivos = 0, conteoNegativos = 0, conteoCeros = 0;

        //Save or Taking the numbers in the arrange
        System.out.println("Guardando los numeros en el arreglo ");
        for (int i=0;i<5; i++){
            System.out.println((i+1) + "Digite un nuero");
            numeros[i] = entrada.nextFloat();

            if(numeros[i] == 0){
                conteoCeros++;
            }
            else if (numeros[i]>0){
                sumaPositivos += numeros[i];
                conteoPositivos++;
            }
            else {
                sumaNegativos += numeros[i];
                conteoNegativos++;
            }
        }
        //sacar los datos que nos piden
        //media de los numeros positivos
        if(conteoPositivos == 0){
            System.out.println("no se puede e cero");
        }
        else {
            mediaPositivos = sumaPositivos / conteoPositivos;
            System.out.println(" media positivos " + mediaPositivos);
        }
        //media de numeros negativos
        if(conteoNegativos == 0){
            System.out.println("conteoNegativos es cero");
        }else{
            mediaNegativos = sumaNegativos / conteoNegativos;
            System.out.println("mediaNegativos " + mediaNegativos);
        }
        System.out.println("la cantidad de ceros es " + conteoCeros);
    }
}
class ArrayProb3b{
    //read 10 numbers, save in array, order 1st,n,2nd,n-1,3nd,n-2
    // i | size-1 | i+1 | size-2 | i+2 | size-3 | i+3 |
    // 0 |    1   | 2   | 3      | 4   | 5      | 6   |  --> i
    // 0 |    9   | 1   | 8      | 2   | 7      | 3   |

    public static void ex3b(){

        Scanner entrada = new Scanner(System.in);
        //int num = entrada.nextInt();
        int[] numbers = new int[10];
        //read
        for (int i = 0; i < 10; i++){
            numbers[i] = entrada.nextInt();;
        }
        //display
        for (int i = 0,j=9; i<=4 ; i++,j--){
            System.out.println(numbers[i]);
            System.out.println(numbers[j]);
        }
    }
}
class ArrayProb5{
    /**
     * Leer por teclado dos tablas de 10 números enteros y
     * * mezclarlas en una tercera de la forma: el 1º de A, el 1ºde B, el 2º de A, el 2º de B, etc.*
     */
    public static void ex5(){
        Scanner entrada= new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        //read
        System.out.println("introduce elements for A \n");
        for (int i = 0; i<10; i++){
            System.out.println("introduce el " + (i+1) + " : ");
            A[i] = entrada.nextInt();
        }

        System.out.println("introduce elements for B \n ");
        for (int i = 0; i<10; i++){
            System.out.println("introduce el " + (i+1) + " : ");
            B[i] = entrada.nextInt();
        }
        //val C--> | 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20
        //c// j--> | 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20

        //val A--> | 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20
        //a// i--> | 0  | -  | 1  | -  | 2  | -  | 3  | -  | 4  | -  | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20

        //val B--> | 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20
        //b// i--> | -  | 0  | -  | 1  | -  | 2  | -  | 3  | -  | 4  | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20
        //operation mezclar los 2 arreglos
        //utilzar i-> A y B :: j->C

        int j=0;
        for (int i=0;i<10;i++){
            C[j] = A[i]; //C[0] = A[0]// C[2] = A[1]// C[4] = A[2]// copiamos el primer elemnto
            j++;
            C[j] = B[i]; //C[1] = B[0]// C[3] = B[1]// C[5] = A[2]//
            j++;
        }

//        int j=0;
//        for (int i=0;i<10;i++){
//            C[j] = A[i]; //C[0] =
//            j++;
//            C[j] = B[i]; //C[1] =
//            j++;
//        }
//
//
// display
        System.out.println("el tercer arreglo es: ");
        for (int i=0;i<20;i++){
            System.out.println(C[i] + " ");
        }
        System.out.println();
    }

}
class ArrayProb6{
    public static void ex6(){
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[12];
        int b[] = new int[12];
        int c[] = new int[24];

        //read
//        System.out.println("introduce a");
//        for (int i = 0; i<12; i++){
//            System.out.println("introduce elements of a " + (i+1) + " :");
//            a[i] = entrada.nextInt();
//        }
//        System.out.println("introduce b");
//        for (int i = 0; i<12; i++){
//            System.out.println("introduce elements of b " + (i+1) + " :");
//            b[i] = entrada.nextInt();
//        }
        //operation mezclar
        //read 10 numbers, save in array, order 1st,n,2nd,n-1,3nd,n-2
        // A--> | 1A | 2A | 3A | 4A | 5A | 6A | 7A | 8A | 9A |
        //index:| 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20

        // C--> | 1A | 2A | 3A | 1B | 2B | 3B | 4A | 5A | 6A | 4B | 5B | 6B | 7A | 8A | 9A | 7B | 8B | 9B |
        //index:| 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20
        //index:| 0  | 1  | 2  | 0  | 1  | 2  | 3  | 4  | 5  | 3  | 4  | 5  | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20

        // B--> | 1B | 2B | 3B | 4B | 5B | 6B | 7B | 8B | 9B |
        //index:| 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20
        //index:| 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20

        // i      j
        //cuales indices se pueden repetir --> de a y b

        int[] arrA = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};
        int[] arrB = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};
        int[] arrC = new int[arrA.length + arrB.length];
        int j = 0, k = 0, m = 0;
        System.out.println(arrC.length / 4);
        System.out.println(arrA.length - 1);
        System.out.println(arrC.length / 3);
        for (int i = 0; i < 4; i++) {
            for (int l = 0; l < 3; l++) {
                    arrC[j] = arrA[k];
                    j++;
                    k++;
            }
            for (int l = 0; l < 3; l++) {
                    arrC[j] = arrB[m];
                    j++;
                    m++;
            }
        }
        System.out.println(Arrays.toString(arrC));
    }
}

class ArrayProb7{
    /**
     * Ejercicio 7: Leer por teclado una serie de 10 números enteros
     * La aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente, o si están desordenados.
     */
    public static void ex7(){
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean creciente = false, decreciente = false;

        //read
        System.out.println("intrduce your array ");
        for (int i=0; i<10; i++){
            System.out.println("introduce your array 1x1" + (i+1));
            numeros[i] = entrada.nextInt();
        }
        //operation
        for (int i=0;i<9;i++){
            if(numeros[i] < numeros[i+1]){
                creciente = true;
            }
            if(numeros[i] > numeros[i+1]){
                decreciente = true;
            }
        }
        if(creciente == true && decreciente==false){
            System.out.println("\n el arreglo esta en forma creciente");
        }
        else if(creciente==false && decreciente==true){
            System.out.println("\n el arreglo esta en forma decreciente");
        }
        else if(creciente==true && decreciente==true){
            System.out.println("\n el arreglo esta en forma desordenado");
        }
        else if (creciente==false && decreciente==false){
            System.out.println("\n el arreglo esta en forma Iguales");
        }
        //display
    }
}
class ArrayProb8{
    //10 elements
    public static void ex8(){
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[10];
        int numero, posicion;

// Introduciendo los primeros 8 elementos del arreglo.
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            a[i] = entrada.nextInt();
        }

// Ingresar 2 número en posiciones determinadas por el usuario.
        for (int i = 0; i < 2; i++) {

            System.out.print("\nDigite una posición entre 1-10 del arreglo "
                    + "\ndonde quiere ingresar el número anterior: ");
            posicion = entrada.nextInt();

            System.out.print("\nDigite un número más para ingresar: ");
            numero = entrada.nextInt();

            int cont = 9;
            for (int j = cont; j >= posicion; j--) {
                a[j] = a[j - 1];
            }
            a[posicion-1] = numero;

        }

// Imprimiendo el arreglo.
        System.out.print("El arreglo es: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("\b\b.");

    }

}
class ArrayProb9{
    /**
     *
     * Ejercicio 9: Crear un programa que lea por teclado una tabla de 10 números enteros y la
     * * desplace una posición hacia abajo: el primero pasa a ser el segundo,
     * * el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero.*
     */
    public static void ex9(){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int ultimo;

        System.out.println("llenar");
        for (int i=0; i<10; i++){
            System.out.println( i + ". Digite un numero:");
            arreglo[i] = entrada.nextInt();
        }

        ultimo = arreglo[9]; //guardamos el ultimo elemento

        for (int i=8; i>=0; i--){ //avanzar una posicion abajo en el arreglo
            arreglo[i+1] = arreglo[i];
        }

        arreglo[0] = ultimo; //ponemos elemento como primero

        System.out.println("\n el nuevo arreglo es: ");
        for (int i=0; i<10; i++){
            System.out.println(i + "Numero: " + arreglo[i]);
        }
    }
}
class ArrayProb10{

    /**
     * Crear un programa que lea por teclado una tabla de 10 num
     * y desplace N posiciones en el arreglo (N by user)*
     */
    public static void ex10(){
        Scanner entrada= new Scanner(System.in);
        int arreglo[]= new int [10];
        int p, d=0;

        for(int i=0; i<10; i++){
            System.out.print("Ingrese un número");
            arreglo[i]=entrada.nextInt();
        }
        System.out.print("Digite el número de posiciones: ");
        p=entrada.nextInt();

        for(int x=1; x<=p; x++){
            d=arreglo[9];
            for(int i=8; i>=0; i--){
                arreglo[i+1]=arreglo[i];
            }
            arreglo[0]=d;
        }
        for(int z:arreglo){
            System.out.print(z);
        }
    }
}
class ArrayProb11{
    public static void ex11(){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero,sitio_num=0,j=0;
        System.out.println("Llenar el arreglo");
        do{
            //read
            for(int i=0; i<5; i++){
                System.out.print((i+1) + ". digite un numero");
                arreglo[i] = entrada.nextInt();
            }
            //comprobar si el arreglo esta ordenado en orden creciente
            for(int i =0; i<4;i++){
                if(arreglo[i] < arreglo[i+1]){//creciente: 1-2-3
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]){//decreciente: 3-2-1
                    creciente = false;
                    break;
                }
            }
            if(creciente == false){
                System.out.println("\n el arreglo no esta ordenado en forma creciente, vuela a digitar");
            }
        }while (creciente == false);

        System.out.println("\n digite un elemento a insertar ");
        numero = entrada.nextInt();

        //indica que posicion va el numero
        while (arreglo[j]<numero && j<5){
            sitio_num++;
            j++;
        }
        //trasladamos una posicion en el arreglo a los elementos que van detras de numero
        for(int i=4; i>=sitio_num; i--){
            arreglo[i+1] = arreglo[i];
        }
        //insertamos el numero que el usuario puso
        arreglo[sitio_num] = numero;
        System.out.println("\n el arreglo queda");
        for(int i=0; i<6; i++){
            System.out.println(arreglo[i] + "-");
        }
    }
}
class ArrayProb12{
    /**
     * Read by keyboard a table of 10 numerical elements and position between 0 and 9
     * delete the element in the postion given without leave holes* *
     */
    public static void ex12(){
        Scanner entrada = new Scanner(System.in);

        int[] tabla = new int[10];
        int posicion;

        //Ingresar los números por medio de la consola.
        System.out.println("INGRESE NÚMEROS DE LA TABLA");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " +i+ ": ");
            tabla[i] = entrada.nextInt();
        }

        //Solicitar una posición y comprobar que está entre 0-9.
        do {
            System.out.print("\nDigite una posición entre 0-9: ");
            posicion = entrada.nextInt();
        } while (posicion < 0 || posicion > 10);

        //Colocar cero la posición que se digito.
        tabla[posicion] = 0;

        //Recorrer todos los números de la tabla para no dejar huecos.
        for (int i = posicion; i < 9; i++) {
            tabla[i] = tabla[i+1];
        }

        //Poner en cero la último posición.
        tabla[9] = 0;

        System.out.println("\nNUEVA TABLA");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " +i+ ": " +tabla[i]);
        }
    }
}

class ArrayProb13{
    /**
     * Ejercicio 13: Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera,
     * y a continuación los elementos impares.*
     */
    public static void ex13(){
        Scanner scanner = new Scanner(System.in);
        int arreglo[] = new int[10];
        int conteo_pares = 0, conteo_impares=0;

        System.out.println("llenar el arreglo");
        for (int i=0; i<10 ; i++){
            System.out.println((i+1) + "  digite un numero  ");
            arreglo[i]= scanner.nextInt();

            if(arreglo[i] % 2==0){
                conteo_pares++;
            }
            else { //si es impar el conteo de impares aumenta
                conteo_impares++;
            }
        }

        //crear los arreglos
        int par[] = new int[conteo_pares]; //cremos el arreglo para pares
        int impar[] = new int[conteo_impares]; //cremos el arreglo para impares

        conteo_pares=0;
        conteo_impares=0;
        //almacenamos los numeros pares en su arreglo y los impares tambien
        for (int i=0; i<10; i++){
            if(arreglo[i] % 2 == 0){
                par[conteo_pares] = arreglo[i];
                conteo_pares++;
            }else{
                impar[conteo_impares] = arreglo[i];
                conteo_impares++;
            }
        }
        System.out.println("\n arreglo pares: ");
        for(int i=0; i<conteo_pares; i++){
            System.out.println(par[i]);
        }
        System.out.println("\n arreglo impares: ");
        for(int i=0; i<conteo_impares; i++){
            System.out.println(impar[i]);
        }
        System.out.println("\n arreglo total: ");
        for(int i=0; i<arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
}

public class ArreglosDemo {

    public static void main(String[] args) {
        //ArrayInitial1.arrayEx1();
        //ArregloInputOutput.arrEx2();
        //ArrayForEach.arrExer3();
        //ArraysProb1.Ex1();
        //ArraysProb3.ex3();
        //ArrayProb3b.ex3b();
        //ArrayProb7.ex7();
        //ArrayProb8.ex8();
        //ArrayProb11.ex11();
        //ArrayProb12.ex12();
        ArrayProb13.ex13();
}}

