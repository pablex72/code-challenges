package paquete1;

public class Clase2 {
    public static void main(String[] args) {
        Clase1 obj1 = new Clase1();

        //obj1.edad = 1115;
        obj1.SetEdad(10);
        System.out.println("es" + obj1.GetEdad());

        obj1.setNombre("ale");
        System.out.println("obj1.getNombre()"+ obj1.getNombre());
    }
}
