package OOP.patterns.factory.pizzas;

import OOP.patterns.factory.factories.PizzaComponentsFactory;

/**
 * Created by Юля on 30.05.2016.
 */
public class NewYorkCheesePizza extends Pizza {

    public NewYorkCheesePizza(PizzaComponentsFactory pizzaComponentsFactory) {
        setDough(pizzaComponentsFactory.createDough());
        setCheese(pizzaComponentsFactory.createCheese());
    }

    @Override
    public void box() {
        System.out.println("Boxing in New York box");
    }
}
