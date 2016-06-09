package OOP.patterns.factory.pizzas;

import OOP.patterns.factory.factories.PizzaComponentsFactory;

/**
 * Created by Юля on 30.05.2016.
 */
public class NewYorkMeatPizza extends Pizza {

    public NewYorkMeatPizza(PizzaComponentsFactory pizzaComponentsFactory) {
        setCheese(pizzaComponentsFactory.createCheese());
        setDough(pizzaComponentsFactory.createDough());
        setProteins(pizzaComponentsFactory.createProteins());
    }

    @Override
    public void box() {
        System.out.println("Boxing in New York box");
    }
}
