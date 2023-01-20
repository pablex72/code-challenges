import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Programa para invertir in situ una lista en Java
class Main
{
    public static void main(String[] args)
    {
        List<String> colors = new ArrayList<>(Arrays.asList("RED", "BLUE", "BLACK"));

        colors.add("PINK");
        colors.add("PURPLE");
        colors.add("SILVER");

        System.out.println("before reverse: " + colors);
        colors.remove(colors.size()-1);

        System.out.println("before reverse: " + colors);
        colors.remove(colors.size()-1);

        System.out.println("before reverse: " + colors);

        for (int i = 0, j = colors.size() - 1; i < j; i++) {
            //adding to the head and remove the end as a fixed point
            colors.add(i, colors.remove(j));
            System.out.println("i i i: " + i);
        }
        System.out.println("after reverse: " + colors);
    }
}