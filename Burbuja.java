import javax.swing.*;
import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[], nElementos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos "));
        arreglo = new int[nElementos];

        for(int i=0; i<nElementos; i++){
            System.out.println((i+1) + " difite");
            arreglo[i] = scanner.nextInt();
        }
        //metodo burbuja
        for(int i=0; i<(nElementos-1); i++){
            for(int j=0; j<(nElementos-1); j++){
                if(arreglo[j] > arreglo[j+1]){//si numero actual > numero siguiente
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        System.out.println("ordenado forma creciente ");
        for (int i=0; i<nElementos; i++){
            System.out.println(arreglo[i] + "  - ");
        }
        System.out.println("ordenado en forma decreciente");
        for(int i=(nElementos-1); i>=0; i--){
            System.out.println(arreglo[i] + " - ");
        }
    }
}
