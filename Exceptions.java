import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {
        try {
            divide(4,0);
        } catch (Exception e) {
            System.out.println("I am in catch main");
        }
    }

    public static int divide(int A, int B) throws ArithmeticException, IOException{
        int resultado = 0;
        try {
            resultado = A / B;
        }   catch (ArithmeticException e){
            throw new IOException();
        }
        return resultado;
    }
}
