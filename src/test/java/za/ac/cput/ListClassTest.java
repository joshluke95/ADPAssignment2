package za.ac.cput;

import org.junit.jupiter.api.Test;
import java.util.*;

class ListClassTest {

    @Test
    void add() {

        List<String> car = new ArrayList<>();

        car.add("Toyota");
        car.add("Nissan");
        car.add("BMW");

        System.out.println("Elements Added: " + car);

    }

    @Test
    void remove() {
        List<String> car = new ArrayList<>();

        car.add("Toyota");
        car.add("Nissan");
        car.add("BMW");

        System.out.println("List: " + car);

        String removedElement = car.remove(2);
        System.out.println("Removed Element: " + removedElement);

    }

    @Test
    void find() {
        List<String> car = new ArrayList<>();

        car.add("Toyota");
        car.add("Nissan");
        car.add("BMW");

        System.out.println("List: " + car);

        String find = car.get(1);
        System.out.println("Element Found: " + find);
    }

}