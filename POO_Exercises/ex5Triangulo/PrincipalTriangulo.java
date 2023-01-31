package POO_Exercises.ex5Triangulo;

import javax.swing.plaf.basic.BasicTreeUI;
import java.util.Scanner;

public class PrincipalTriangulo {

    public static double areaGrande(Triangulo[] triangulos){
        double area;

        area = triangulos[0].obtenerArea();
        for (int i=1; i< triangulos.length; i++){
            if(triangulos[i].obtenerArea() > area ){
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, lado;
        int nTriangulos;

        System.out.println("digite el numero de triangulos a ingresar ");
        nTriangulos = scanner.nextInt();

        Triangulo triangulos[] = new Triangulo[nTriangulos];

        for(int i=0; i<triangulos.length; i++){
            System.out.println("\n digite los valores para el triangulo " +(i+1) + "  ");
            System.out.println("intro la base");
            base = scanner.nextDouble();
            System.out.println("intro el lado");
            lado = scanner.nextDouble();

            triangulos[i] = new Triangulo(base, lado);

            System.out.println("\nel perimetro del triangulo es " + triangulos[i].obtenerPerimetro());
            System.out.println("\nel area del triangulo es " + triangulos[i].obtenerArea());
        }
        System.out.println(" el mayor area" + areaGrande(triangulos));
    }
}
