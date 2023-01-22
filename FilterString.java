// Java Program to Get a Stream Consisting ofElements
// of Stream that Matches Given predicate
// for Stream filter (Predicate predicate)

// Importing required classes
import java.util.stream.Stream;

// Class
class FilterString {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating a stream of strings
        Stream<String> stream = Stream.of(
                "Geeks", "foR", "GeEksQuiz", "GeeksforGeeks");

        // Getting a stream consisting of the
        // elements ending with 's'
        // using Stream filter(Predicate predicate)
        stream.filter(str -> str.endsWith("s"))
                .forEach(System.out::println);
    }
}

