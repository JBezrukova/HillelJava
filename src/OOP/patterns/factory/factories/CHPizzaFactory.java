package OOP.patterns.factory.factories;

import OOP.patterns.factory.pizzas.ChicagoCheesePizza;
import OOP.patterns.factory.pizzas.ChicagoMeetPizza;
import OOP.patterns.factory.pizzas.Pizza;
import OOP.patterns.factory.pizzas.ingredients.cheese.Mozarella;
import OOP.patterns.factory.pizzas.ingredients.cheese.Parmejano;
import OOP.patterns.factory.pizzas.ingredients.dough.Thick;
import OOP.patterns.factory.pizzas.ingredients.dough.Thin;
import OOP.patterns.factory.pizzas.ingredients.proteins.Meat;
import enums.PizzaType;

/**
 * Created by Юля on 30.05.2016.
 */
public class CHPizzaFactory implements PizzaFactory {
    PizzaComponentsFactory pizzaComponentsFactory;

    public CHPizzaFactory(PizzaComponentsFactory pizzaComponentsFactory) {
        this.pizzaComponentsFactory = pizzaComponentsFactory;
    }

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case CHEESE:
                pizza = new ChicagoCheesePizza(pizzaComponentsFactory);
                return pizza;
            case MEAT:
                pizza = new ChicagoMeetPizza(pizzaComponentsFactory);
                return pizza;
            default:
                throw new RuntimeException("Wrong type:" + type + ", expected: 'Cheese' or 'Meat'");
        }
    }
}
