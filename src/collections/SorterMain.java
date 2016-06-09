package collections;
import OOP.Cat;
import OOP.Sorter;

import java.util.Arrays;

/**
 * Created by Þëÿ on 18.03.2016.
 */
public class SorterMain {

    public static void main(String[] args) {
        Sorter sorter =new Sorter();
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Murzik", "grey",2014);
        cats[1]=new Cat("Tima","white",2010);
        cats[2] = new Cat("Fil","black",2012);

        System.out.println("CatComparator: ");
        sorter.sort(cats, new CatComparator());
        print(cats);
        System.out.println("BirthComparator: ");
        sorter.sort(cats, new BirthComparator(new CatComparator()));
        print(cats);
    }

    private static void print(Cat[] cats) {
        for (int i=0; i<cats.length;i++){
            System.out.println(cats[i].toString());
        }
    }
}
