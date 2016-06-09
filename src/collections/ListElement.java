package collections;

import OOP.patterns.iterator.CustomLinkedListIterator;
import exceptions.MyOwnOutOfIndexException;

import java.util.Iterator;

/**
 * Created by ��� on 22.03.2016.
 */
public class ListElement {
    private Object value;
    private ListElement next;

    public ListElement(Object value) {
        this.value = value;
    }

    public int size() {
        if (next == null) {
            return 1;
        } else {
            return next.size() + 1;
        }
    }

    public Object get(int index) throws MyOwnOutOfIndexException{
        if (index == 0) {
            return value;
        } else {
            if (next == null) {
                throw new MyOwnOutOfIndexException();
            }
            return next.get(index - 1);
        }
    }

    public void add(Object value) {
        if (next == null) {
            next = new ListElement(value);
        } else {
            next.add(value);
        }
    }

    public boolean contain(Object object){
        if (next == null){
            return false;
        }else {
            if (next.equals(object)){
                return true;
            }else {
               return next.contain(object);
            }

        }
    }

    public Object getValue() {
        return value;
    }

    public ListElement getNext() {
        return next;
    }

}

