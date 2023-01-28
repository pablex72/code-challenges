//Modificadores de acceso
package paquete1;

public class Clase1 {
    int atributo1;
    private int edad;
    private String nombre;

    //establecemos la edad
    public void SetEdad(int edad){
        this.edad = edad;
    }
    //metodo getter mostramos la edad
    public int GetEdad(){
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
