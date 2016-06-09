package collections;

import java.util.Comparator;


/**
 * Created by Þëÿ on 18.03.2016.
 */
public class BirthComparator implements Comparator {

    private Comparator comparator;

    public BirthComparator(Comparator comparator){
        this.comparator = comparator;
    }
    @Override
    public int compare(Object o1, Object o2) {
        return comparator.compare(o1,o2)*(-1);
    }
}
