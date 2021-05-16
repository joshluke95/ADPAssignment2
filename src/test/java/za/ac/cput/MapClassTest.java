/**
 * ADP Assignment 2
 * @author 214234169
 */

package za.ac.cput;

import org.junit.jupiter.api.Test;
import java.util.*;


class MapClassTest {

    @Test
    void put() {
        Map<Integer, String> car = new HashMap();
        car.put(1, "Toyota");
        car.put(2, "Nissan");
        car.put(3, "BMW");

        System.out.println("Elements Added: " + car);
    }

    @Test
    void find() {
        Map<Integer, String> car = new HashMap();
        car.put(1, "Toyota");
        car.put(2, "Nissan");
        car.put(3, "BMW");

        String value = car.get(1);

        System.out.println("Elements: " + car);
        System.out.println("Found Value: " + value);
    }

    @Test
    void remove() {
        Map<Integer, String> car = new HashMap();
        car.put(1, "Toyota");
        car.put(2, "Nissan");
        car.put(3, "BMW");

        System.out.println("Elements: " + car);

        String value = car.remove(3);
        System.out.println("Removed value: " + value);

        System.out.println("Updated Map: " + car);
    }

}
