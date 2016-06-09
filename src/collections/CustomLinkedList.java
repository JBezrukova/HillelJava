package collections;

import OOP.patterns.iterator.CustomLinkedListIterator;
import exceptions.MyOwnOutOfIndexException;

import java.util.Iterator;

/**
 * Created by ��� on 22.03.2016.
 */
public class CustomLinkedList implements Iterable {

    private ListElement next;

    public int size() {
        if (next == null) {
            return 0;
        } else {
            return next.size();
        }
    }

    public void add(Object value) {
        if (next == null) {
            next = new ListElement(value);
        } else {
            next.add(value);
        }
    }

    public Object get(int index) throws MyOwnOutOfIndexException{
        if (next == null) {
            throw new MyOwnOutOfIndexException("size = " + size() + " index = " + index);
        } else {
            try {
                return next.get(index);
            } catch (MyOwnOutOfIndexException e) {
                throw new MyOwnOutOfIndexException("size = " + size() + " index = " + index);
            }
        }
    }

    @Override
    public Iterator iterator() {
        return new CustomLinkedListIterator(next);
    }

}
