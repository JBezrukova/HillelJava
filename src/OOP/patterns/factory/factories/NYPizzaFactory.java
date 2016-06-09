package OOP.patterns.factory.factories;

import OOP.patterns.factory.PizzaStore;
import OOP.patterns.factory.pizzas.ChicagoMeetPizza;
import OOP.patterns.factory.pizzas.NewYorkCheesePizza;
import OOP.patterns.factory.pizzas.NewYorkMeatPizza;
import OOP.patterns.factory.pizzas.Pizza;
import OOP.patterns.factory.pizzas.ingredients.cheese.Parmejano;
import OOP.patterns.factory.pizzas.ingredients.dough.Thin;
import OOP.patterns.factory.pizzas.ingredients.proteins.Seafood;
import enums.PizzaType;

/**
 * Created by Юля on 30.05.2016.
 */
public class NYPizzaFactory implements PizzaFactory {

    PizzaComponentsFactory pizzaComponentsFactory;

    public NYPizzaFactory(PizzaComponentsFactory pizzaComponentsFactory) {
        this.pizzaComponentsFactory = pizzaComponentsFactory;
    }

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case CHEESE:
                pizza = new NewYorkCheesePizza(pizzaComponentsFactory);
                return pizza;
            case MEAT:
                pizza = new NewYorkMeatPizza(pizzaComponentsFactory);
                return pizza;
            default:
                throw new RuntimeException("Wrong type: " + type + ", expected: 'Cheese' or 'Meat'");
        }
    }
}
