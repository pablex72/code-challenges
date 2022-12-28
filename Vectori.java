import java.util.Vector;
public class Vectori {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("datos del vector "   + vector);
        /*Vector<String> vector1 = new Vector();
        vector1.add("Hola");
*/
        vector.remove(2);
        System.out.println("datos del vector "   + vector);

        System.out.println("vector size " + vector.size() + " y capacidad " + vector.capacity());
    }
}
