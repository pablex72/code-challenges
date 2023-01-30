package POO_Exercises.ex4Atletismo;

/**
 * Ejercicio 4: Construir un programa para una competencia de atletismo, el programa debe gestionar una
 * * serie de atletas caracterizados por su número de atleta, nombre
 * * y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganador de la carrera.
 */
public class Atleta {

    //atributos
    int number;
    String name;
    float time;
    //metodo constructor

    public Atleta(int number, String name, float time) {
        this.number = number;
        this.name = name;
        this.time = time;
    }

    //metodos


    public float getTime() {
        return time;
    }

    public String mostrarDatos(){
        return "number: " + number + "\nName" + name + "\ntime:" + time + "\n";
    }

}
