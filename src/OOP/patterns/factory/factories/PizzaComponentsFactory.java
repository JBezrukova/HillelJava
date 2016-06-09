package OOP.patterns.factory.factories;

import OOP.patterns.factory.pizzas.ingredients.cheese.Cheese;
import OOP.patterns.factory.pizzas.ingredients.dough.Dough;
import OOP.patterns.factory.pizzas.ingredients.proteins.Proteins;

/**
 * Created by Юля on 30.05.2016.
 */
public interface PizzaComponentsFactory {

    Cheese createCheese();

    Dough createDough();

    Proteins createProteins();
}
