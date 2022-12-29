import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class EntradaSalida {
    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("C:/Users/WINDOWS 10/Desktop/exChi");

            try {
                byte[] datos = fichero.readAllBytes();

                for (byte dato: datos) {
                    System.out.println((char) dato);
                }
            } catch (IOException e) {
                System.out.println("no puedo leer el fihero " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("the program gives an error" + e.getMessage());
        }
    }
}
