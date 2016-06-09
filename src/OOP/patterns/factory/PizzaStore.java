package OOP.patterns.factory;

import OOP.patterns.factory.factories.PizzaFactory;
import OOP.patterns.factory.pizzas.*;
import enums.PizzaType;

/**
 * Created by Юля on 30.05.2016.
 */
public class PizzaStore {

    PizzaFactory pizzaCreator;

    public PizzaStore(PizzaFactory pizzaCreator){
        this.pizzaCreator = pizzaCreator;
    }

    public Pizza order(PizzaType type) {
        Pizza pizza = pizzaCreator.createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
/*
    private Pizza createPizza(String region, String type) {
        if (region.equals("CH")) {
            switch (type) {
                case "Cheese":
                    return new ChicagoCheesePizza();
                case "Meat":
                    return new ChicagoMeetPizza();
                default:
                    throw new RuntimeException("Wrong type:" + type + ", expected: 'Cheese' or 'Meat'");
            }
        } else {
            if (region.equals("NY")) {
                switch (type) {
                    case "Cheese":
                        return new NewYorkCheesePizza();
                    case "Meat":
                        return new NewYorkMeatPizza();
                    default:
                        throw new RuntimeException("Wrong type: " + type + ", expected: 'Cheese' or 'Meat'");
                }
            } else {
                throw new RuntimeException("Wrong region: " + region + ", expected: 'NY' or 'CH'");
            }
        }
    }

*/
}
