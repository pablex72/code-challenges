import java.util.Scanner;

public class ErrorsTypes {

    public static void main(String[] args) {
        errorDivisionPorCeroTry();
    }

    public static void errorDivisionPorCeroTry() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        try {
            int resultado = numeroA / numeroB;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("¡No se puede dividir por cero!");
        }
    }
}


