package POO_Exercises.sobreescritura;

public class Persona extends Animal{

    @Override
    public void comer() {
        System.out.println("estoy comiendo sentado y con cuebiertos ");
    }
}
