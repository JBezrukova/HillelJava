package OOP.patterns.factory.factories;

import OOP.patterns.factory.pizzas.Pizza;
import enums.PizzaType;

/**
 * Created by Юля on 30.05.2016.
 */
public interface PizzaFactory {

    Pizza createPizza(PizzaType type);
}
