package collections;

import OOP.Cat;

import java.util.*;

/**
 * Created by ��� on 18.03.2016.
 */
public class CollectionsMain {
    public static void main(String[] args) {


        Cat cat1 = new Cat("tom", "grey", 2015);
        Cat cat2 = new Cat("tom", "grey", 2015);
        HashSet<Cat> hashSet = new HashSet<>();
        hashSet.add(cat1);

        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(hashSet.contains(cat2));
        cat1.setName("Barsik");
        System.out.println(hashSet.contains(cat1));

        hashSet.remove(cat1);
        cat1.setName("Murzik");
       //hashSet.add(cat1);
        System.out.println(hashSet.contains(cat1));
        hashSet.add(new Cat("kat", "white",2016));

        for (Cat cat : hashSet){
            System.out.println(cat);
        }

    }

    private static void lists() {
        ArrayList<Cat> arrayList = new ArrayList<>();

        arrayList.add(new Cat("murzik", "grey", 2015));
        arrayList.add(new Cat("sam", "grey", 2010));
        arrayList.add(new Cat("kitty", "grey", 2016));

        System.out.println(arrayList);
        Cat tom = arrayList.get(1);

        System.out.println(tom);
        LinkedList<Cat> list = new LinkedList<>();
        list.add(new Cat("murzik", "grey", 2015));
        list.add(new Cat("sam", "grey", 2010));
        list.add(new Cat("kitty", "grey", 2016));

        System.out.println(list.get(1));

        printList(arrayList);
        printList(list);

        Collection<Cat> cats = list;
        cats.add(new Cat("vasia", "black", 2009));

        System.out.println("LinkedList: ");
        printForEach(cats);

        TreeSet<Cat> sortedCats = new TreeSet<>(new CatComparator());
        sortedCats.add(new Cat("murzik", "grey", 2015));
        sortedCats.add(new Cat("sam", "grey", 2010));
        sortedCats.add(new Cat("kitty", "grey", 2016));
        sortedCats.add(new Cat("motya", "grey", 2016));


        System.out.println("TreeSet: ");
        printForEach(sortedCats);
    }

    public static void printForEach(Collection<Cat> collection) {
        for (Cat cat : collection) {
            System.out.println(cat);
        }
    }

    public static void printList(List<Cat> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
