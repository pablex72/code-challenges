package POO_Exercises.Herencia;

public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;

    //constructor
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos(){
        System.out.println("nombre " + getNombre() + "\napellido: " + getApellido() + "\nedad " + getEdad()+ "\ncodigo estuiante "  + codigoEstudiante + "\nnota final " + notaFinal);
    }
}
