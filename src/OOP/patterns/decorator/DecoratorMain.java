package OOP.patterns.decorator;

import java.util.Collection;
import java.util.List;

/**
 * Created by Юля on 12.04.2016.
 */
public class DecoratorMain {

    public static void main(String[] args) {
        Beverage robusta = new Robusta();
        robusta = new Milk(robusta);
        robusta = new Milk(robusta);
        print(robusta);

        Beverage arabica = new Arabica();
        arabica = new Cream(arabica);
        print(arabica);

    }

    public static void print(Beverage beverage) {
        System.out.println("Cost: " + beverage.cost() + ", " + beverage.description());
    }
}
