package OOP.patterns.factory.pizzas;

import OOP.patterns.factory.factories.PizzaComponentsFactory;

/**
 * Created by Юля on 30.05.2016.
 */
public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza(PizzaComponentsFactory pizzaComponentsFactory) {
        setCheese(pizzaComponentsFactory.createCheese());
        setDough(pizzaComponentsFactory.createDough());
    }

    @Override
    public void box() {
        System.out.println("Boxing in Chicago box");
    }
}
