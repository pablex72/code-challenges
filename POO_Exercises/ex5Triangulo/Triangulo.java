package POO_Exercises.ex5Triangulo;

/**
 * Ejercicio 4: Construir un programa para una competencia de atletismo, el programa debe gestionar una
 * * serie de atletas caracterizados por su número de atleta,
 * * nombre y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganador de la carrera.
 */
public class Triangulo {

    //atributos
    private double base;
    private double lado;

    public Triangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double obtenerPerimetro(){
        double perimetro = 2 * lado + base;
        return perimetro;
    }

    public double obtenerArea(){
        double area = (base*Math.sqrt((lado*lado) - ((base*base)/4)))/2;
        return area;
    }
}
