package za.ac.cput;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class ListClassTest {

    //instantiate ArrayList
    ArrayList<String> employee = new ArrayList<>();

    //adds elements
    @Test
    void Add() {

            employee.add("emp1");
            employee.add("emp2");
            employee.add("emp3");

            System.out.println("ListClass:" + employee + "\n");
        }

    //removes element in ArrayList
    @Test
    void Remove() {
        employee.add("emp1");
        employee.add("emp2");
        employee.add("emp3");

        System.out.println("Employee ListClass:" + employee + "\n");

        String removedIndex = employee.remove(2);
        System.out.println("Removed Index: " + removedIndex + "\n");
    }

    //finds element in ArrayList
    @Test
    void Find() {
        employee.add("emp1");
        employee.add("emp2");
        employee.add("emp3");

        System.out.println("Employee ListClass: \n" + employee + "\n");

        String index = employee.get(1);
        System.out.println("Accessed Element: " + index + "\n");
    }

    @Test
    void contains() {
    }

    @Test
    void testAdd() {
    }

    @Test
    void testRemove() {
    }
}