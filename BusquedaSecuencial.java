import javax.swing.*;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean band = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("intro"));
        //buscar el numero - BUSQUEDA SECUENCIAL

        int i=0;
        while(i<5 && band==false){
            if(arreglo[i] == dato){
                band = true;
            }
            i++;
            }
        if(band==false){
            JOptionPane.showMessageDialog(null,"el numeor no esta");
        }else {
            JOptionPane.showMessageDialog(null,"el numeor SI ESTA EN " + (i-1));
        }
    }
}
