package POO_Exercises.polimorfismo;

public class Vehiculo {

    protected String matricula;
    protected String marca;
    protected String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarDatos(){
        return "matricula " + matricula + "marca " + marca + "modelo" + modelo;
    }
}
