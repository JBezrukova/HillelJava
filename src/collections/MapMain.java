package collections;

import OOP.inheritance.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Юля on 29.03.2016.
 */
public class MapMain {

    public static void main(String[] args) {

        Map<Person, Integer> personToDiscount = new HashMap<>();

        personToDiscount.put(new Person("Vasya"), 8);
        personToDiscount.put(new Person("Petya"), 8);
        personToDiscount.put(new Person("Vova"), 20);

        doStuff(personToDiscount);

        for (Map.Entry<Person, Integer> personIntegerEntry : personToDiscount.entrySet()) {
            System.out.println(personIntegerEntry.getKey() + " ,my discount is " + personIntegerEntry.getValue());
        }

        for (Person person : personToDiscount.keySet()){
            System.out.println(personToDiscount.get(person));
        }
    }

    private static void doStuff(Map<Person, Integer> personToDiscount) {
        personToDiscount.put(new Person("Alex"), 95);
    }
}
