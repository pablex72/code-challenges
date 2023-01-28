package ClasesYObjetos;

public class Persona {

    //Atributos
    String nombre;
    int edad;
    String dni;

    //metodos

    //metodo constructor
    //ayuda a inicializar atributos


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }

    public void correr(){
        System.out.println("soy " + nombre + "tengo " + edad + "y estoy corriendo");
    }

    public void correr(int km){
        System.out.println("he corriedo " + km + " kilometro");
    }

    public void mostrarDatos(){
        System.out.println("el nombre es " + nombre);
        System.out.println("la edad es " + edad);
    }
}
