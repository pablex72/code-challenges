// Java program for reversing an arraylist
import java.io.*;
import java.util.*;
class Employee {
    int empID;
    String empName;
    String deptName;
    int years;

    // Constructor for initializing the class variables
    public Employee(int empID, String empName, String deptName, int years)
    {
        this.empID = empID;
        this.empName = empName;
        this.deptName = deptName;
        this.years = years;
    }
}

public class ReverseArrayObjectsDemo {
    public static void main(String[] args)
    {
        // Declaring arraylist without any initial size
        ArrayList<Employee> arrayli = new ArrayList<Employee>();

        // Creating user defined objects
        Employee emp1 = new Employee(123, "Rama", "Facilities",95);
        Employee emp2 = new Employee(124, "Lakshman", "Transport",25);
        Employee emp3 = new Employee(125, "Ravan", "Packing",21);
        Employee emp4 = new Employee(126, "Ravanii", "Back",27);
        Employee emp5 = new Employee(127, "jon", "Floor",58);


        // Appending all the objects for arraylist
        arrayli.add(emp1);
        arrayli.add(emp2);
        arrayli.add(emp3);
        arrayli.add(emp4);
        arrayli.add(emp5);

        System.out.print("Elements before reversing: ");
        printElements(arrayli);

        // Collections.reverse method takes a list as a
        // parameter and reverse the list
        Collections.reverse(arrayli);
        System.out.print("\nElements after reversing: ");
        printElements(arrayli);
    }

    // Iterate through all the elements and print
    public static void printElements(ArrayList<Employee> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print("\n EmpID:" + alist.get(i).empID +
                    ", EmpName:" + alist.get(i).empName + ", Department:" +
                    alist.get(i).deptName + ", Years: " + alist.get(i).years);
        }

    }
}