import javax.swing.*;
import java.util.Scanner;

public class Insercion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[], nElementos,pos,aux;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("intro"));

        arreglo = new int[nElementos];
        System.out.println("digite el arreglo");
        for (int i=0; i<nElementos; i++){
            System.out.println("digite un numeor de arreglo - " + (i+1));
            arreglo[i] = scanner.nextInt();
        }
        //ordenamiento por insercion
        for(int i = 0; i<nElementos; i++){
            pos = i;
            aux = arreglo[i];
            while((pos>0) && (arreglo[pos-1]>aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            };
        }
        System.out.println("orden ascedente");
        for(int i =0 ; i<nElementos; i++){
            System.out.println(arreglo[i] + " - ");
        }
        System.out.println("");


        System.out.println("orden desenndente");
        for(int i=(nElementos-1); i>=0; i--){
            System.out.println(arreglo[i]);
        }
    }
}
