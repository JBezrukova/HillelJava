package OOP;

import collections.BirthComparator;
import collections.CatComparator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Þëÿ on 18.03.2016.
 */
public class SorterTest {
    @Test
    public void birthYearsMustBeInIncreaseOrder() {
        Sorter sorter = new Sorter();

        Cat murzik = new Cat("Murzik", "grey", 2014);
        Cat tima = new Cat("Tima", "white", 2010);
        Cat fil = new Cat("Fil", "black", 2012);

        Cat[] cats = {murzik, tima, fil};
        sorter.sort(cats, new CatComparator());
        Cat[] expected = {tima, fil, murzik};
        assertArrayEquals("Wrong order", expected, cats);

    }

    @Test
    public void yearShouldBeInDescendingOrder() {
        Sorter sorter = new Sorter();

        Cat murzik = new Cat("Murzik", "grey", 2014);
        Cat tima = new Cat("Tima", "white", 2010);
        Cat fil = new Cat("Fil", "black", 2012);

        Cat[] cats = {murzik, tima, fil};
        sorter.sort(cats, new BirthComparator(new CatComparator()));
        Cat[] expected = {murzik, fil, tima};
        assertArrayEquals("Wrong order", expected, cats);
    }
}
