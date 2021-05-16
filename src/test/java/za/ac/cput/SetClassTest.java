/**
 * ADP Assignment 2
 * @author 214234169
 */

package za.ac.cput;

import org.junit.jupiter.api.Test;
import java.util.*;

class SetClassTest {

    @Test
    void add() {

        HashSet car = new HashSet();

        car.add("Toyota");
        car.add("Nissan");
        car.add("BMW");

        System.out.println("Added Elements " + car);

    }

    @Test
    void remove() {
        Set<String> car = new HashSet();

        car.add("Toyota");
        car.add("Nissan");
        car.add("BMW");

        System.out.println("Set " + car);

        boolean removedElement;

        if (car.remove("Nissan")) {
            removedElement = true;
        } else removedElement = false;

        System.out.println("Is element removed: " + removedElement);
    }

    @Test
    void find() {

        Set<String> car = new HashSet();

        car.add("Toyota");
        car.add("Nissan");
        car.add("BMW");

        Iterator<String> iterate = car.iterator();
        System.out.println("Elements found using Iterator: " + "\n");

        while (iterate.hasNext()){
            System.out.println(iterate.next());
            System.out.println("");
        }
    }
}