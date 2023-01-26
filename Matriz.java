import javax.swing.*;
import java.util.Scanner;

/**
 * * DEFINIR MATRIZ propia
 */
class Matriz1{
    public static void ma1(){
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

    }
}

/**
 * * introduccion por teclado
 */
class Matriz2{
    public static void ma2(){
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nCol;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de cols: "));

        matriz = new int[nFilas][nCol];
        System.out.println("digite la matriz");
        for (int i=0; i<nFilas ; i++){
            for (int j=0; j<nCol ; j++){
                System.out.println("introduce matriz" + i + j);
                matriz[i][j] = entrada.nextInt();
            }
        }

        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }

}
class MatrizProb1{
    /**
     * Ejercicio 1: Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no.*
     */
    public static void ex1(){
        Scanner scanner = new Scanner(System.in);
        int matriz[][], nFilas, nCol;
        boolean simetrica = true;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("intro FIlas"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("intro Columnas"));

        matriz = new int[nFilas][nCol];

        //read
        System.out.println("digite matriz");
        for (int i=0; i<nFilas; i++){
            for(int j=0 ; j< nCol; j++){
                System.out.println("f " + i + j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        if(nFilas == nCol){ //-> matriz cuadrada
            int i,j;
            i=0;
            while(i<nFilas && simetrica == true){
                j=0;
                while(j<i && simetrica==true){
                    if(matriz [i][j]!=matriz[j][i]){
                        simetrica =false;
                    }
                j++;
                }
            i++;
            }
            if(simetrica==true){
                System.out.println("matriz simetrica");
            }else {
                System.out.println("matriz no SIMETRICA");
            }
        }else{
            System.out.println("matriz  no simetrica");
        }
    }
}
class MatrizProb2{
    public static void ex2(){
        Scanner scanner = new Scanner(System.in);
        int matriz[][], nFilas, nCol, sumaFilas, sumaCol;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("fil"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("col"));

        matriz = new int[nFilas][nCol];

        System.out.println("digite la matriz");

        for (int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.println("in" + i + j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        //display
        for (int i =0; i< nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.println(matriz[i][j] + "");
            }
        }

        //sumar filas y comul
        for (int i=0; i<nFilas; i++){
            sumaFilas = 0;
            for (int j=0; j<nCol; j++){
                sumaFilas += matriz[i][j];
            }
            System.out.println("suma filas" + sumaFilas);
        }

        for (int j=0; j<nCol; j++){
            sumaCol = 0;
            for (int i =0; i<nFilas; i++){
                sumaCol += matriz[i][j];
            }
            System.out.println("suma cols" + sumaCol);
        }




    }

}

public class Matriz {
    public static void main(String[] args) {
        //Matriz2.ma2();
        MatrizProb1.ex1();
    }
}
