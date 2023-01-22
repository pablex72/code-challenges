import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStream {

    public static void main(String[] args) {
//1.
        Stream<String> streamDeStrings = Stream.of("Antonio", "Maria", "Juan", "Pedro")
                .filter(c -> c.contains("a"));
                //.filter(c.getName() == "Java");
                //.map(s -> s.toUpperCase());

        //collect method, transform from stream to a collection
        List<String> lista = streamDeStrings.collect(Collectors.toList());
        System.out.println(lista);
//2.
        Long sizeStream = Stream.of("Antonio", "Maria", "Juan", "Pedro")
                .count();
        System.out.println(sizeStream);
//3.
        boolean coincidence = Stream.of("Antonio", "Maria", "Juan", "Pedro")
                .filter(c -> c.contains("a"))
                .filter(c -> c.contains("M"))
                .anyMatch(s -> s.contains("z"));
        System.out.println(coincidence);

    }
}
