package POO_Exercises.polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{

    private int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public String mostrarDatos(){
        return "matricula " + matricula + " marca " + marca + " modelo " + modelo + "carga " + carga;
    }
}
