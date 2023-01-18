import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to create a new array list, add
// some elements (string) and print out the collection.
public class JavaCollectionArrayListW3SourceDemo {

    public static void main(String[] args) {

        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("red");
        list_Strings.add("blue");
        System.out.println(list_Strings);

        for ( String color : list_Strings ) {
            System.out.println(color);
        }
        list_Strings.add(0,"orange");
        System.out.println(list_Strings);
        //Retrieve the first and third element
        String element = list_Strings.get(0);
        System.out.println("Firt Element: " + element);
        //update an element
        list_Strings.set(2, "yellow");
        System.out.println(list_Strings);
        //remove the third element from the list
        list_Strings.remove(2);
        System.out.println(list_Strings);
        //search an element
        if(list_Strings.contains("red")){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
        //sort an ArrayList
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("before sort: " + list_Strings);
        Collections.sort(list_Strings);
        System.out.println("after sort: " + list_Strings);
    }
}
