package OOP.patterns.factory.pizzas;

import OOP.patterns.factory.factories.PizzaComponentsFactory;

/**
 * Created by Юля on 30.05.2016.
 */
public class ChicagoMeetPizza extends Pizza {

    public ChicagoMeetPizza(PizzaComponentsFactory pizzaComponentsFactory) {
        setDough(pizzaComponentsFactory.createDough());
        setProteins(pizzaComponentsFactory.createProteins());
        setCheese(pizzaComponentsFactory.createCheese());
    }

    @Override
    public void box() {
        System.out.println("Boxing in Chicago box");
    }
}
