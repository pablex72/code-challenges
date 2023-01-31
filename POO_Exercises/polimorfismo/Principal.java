package POO_Exercises.polimorfismo;

public class Principal {
    public static void main(String[] args) {
        Vehiculo vehiculos[] = new Vehiculo[4];

        vehiculos[0] = new Vehiculo("qwe", "ferrari", "asd");
        vehiculos[1] = new VehiculoTurismo("qwe", "ferrari", "asd",56);
        vehiculos[2] = new VehiculoDeportivo("qwe", "ferrari", "asd",2);
        vehiculos[3] = new VehiculoFurgoneta("qwe", "ferrari", "asd",200);

        for ( Vehiculo vehics : vehiculos)
              {
                  System.out.println(vehics.mostrarDatos());
                  System.out.println("");
        }
    }
}
