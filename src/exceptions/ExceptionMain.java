package exceptions;

import java.util.Random;

/**
 * Created by Юля on 08.04.2016.
 */
public class ExceptionMain {

    public static void main(String[] args) {

        try {
            dangerStaff();
        } catch (MyOwnOutOfIndexException | ArithmeticException e) {
            System.out.println(e);
        } catch (RuntimeException e){
            System.out.println(e);
        }
    }

    public static void dangerStaff() {
        if (new Random().nextDouble() > 0.5) {
            doWorkWithLists();
        } else {
            doDivide(1, 0);
        }
    }

    private static void doWorkWithLists() {
        throw new MyOwnOutOfIndexException("brg");
    }

    private static void arithmeticExceptionUncheckedExample() {
        divide(7, 8);
        divide(4, 2);

        try {
            divide(1, 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("in finally block");
        }

        operation(6, 3, "+");
    }

    private static void checkedExample() throws InterruptedException {
        try {
            Thread.sleep(1333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(1234);
    }

    private static void divide(int a, int b) {
        doDivide(a, b);
    }

    private static void doDivide(int e, int b) {
        System.out.println(e / b);
    }

    private static void operation(int a, int b, String operation) {
        switch (operation) {
            case "/":
                doDivide(a, b);
                break;
            case "+":
                System.out.println(a + b);
                break;
        }
    }
}
