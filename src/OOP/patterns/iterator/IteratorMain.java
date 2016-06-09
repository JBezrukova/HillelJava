package OOP.patterns.iterator;

import OOP.Cat;
import collections.CustomLinkedList;
import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Юля on 25.03.2016.
 */
public class IteratorMain {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        ArrayList<Integer> arrayList = new ArrayList<>();

        Iterator iterator = new ArrayIterator(array);

        iterate(iterator);

        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.add(new Cat("tom", "grey", 2012));
        linkedList.add(new Cat("tom", "grey", 2012));
        linkedList.add(new Cat("tom", "grey", 2012));
        Iterator iterator1 = linkedList.iterator();

        iterate(iterator1);

    }

    public static void iterate (Iterable iterable){
        Iterator iterator = iterable.iterator();
        iterate(iterator);
    }

    public static void iterate(Iterator iterator){
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }

}
