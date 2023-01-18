// Java program for reversing an arraylist
import java.io.*;
import java.util.*;
class RevArrayList {

    // Takes an arraylist as a parameter and returns
    // a reversed arraylist
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
    {
        // Arraylist for storing reversed elements
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {

            // Append the elements in reverse order
            revArrayList.add(alist.get(i));
        }

        // Return the reversed arraylist
        return revArrayList;
    }

    // Iterate through all the elements and print
    public void printElements(ArrayList<Integer> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }
}

public class ReverseArrayElementsHR {
    public static void main(String[] args)
    {
        RevArrayList obj = new RevArrayList();

        // Declaring arraylist without any initial size
        ArrayList<Integer> arrayli = new ArrayList<Integer>();

        // Appending elements at the end of the list
        arrayli.add(1);
        arrayli.add(2);
        arrayli.add(3);
        arrayli.add(4);

        System.out.print("Elements before reversing:");
        obj.printElements(arrayli);

        arrayli = obj.reverseArrayList(arrayli);
        System.out.print("\nElements after reversing:");
        obj.printElements(arrayli);
    }
}
