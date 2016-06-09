package exceptions;

import First.MyFirstClass;

import java.io.UncheckedIOException;

/**
 * Created by Юля on 08.04.2016.
 */
public class MyOwnOutOfIndexException extends RuntimeException{
    public MyOwnOutOfIndexException() {
    }

    public MyOwnOutOfIndexException(String message){
        super(message);
    }


}
