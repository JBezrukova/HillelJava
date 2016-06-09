package OOP.patterns.factory.factories;

import OOP.patterns.factory.pizzas.ingredients.cheese.Cheese;
import OOP.patterns.factory.pizzas.ingredients.cheese.Mozarella;
import OOP.patterns.factory.pizzas.ingredients.cheese.Parmejano;
import OOP.patterns.factory.pizzas.ingredients.dough.Dough;
import OOP.patterns.factory.pizzas.ingredients.dough.Thick;
import OOP.patterns.factory.pizzas.ingredients.dough.Thin;
import OOP.patterns.factory.pizzas.ingredients.proteins.Proteins;
import OOP.patterns.factory.pizzas.ingredients.proteins.Seafood;

/**
 * Created by Юля on 30.05.2016.
 */
public class NYPizzaComponentsFactory implements PizzaComponentsFactory {
    @Override
    public Cheese createCheese() {
        return new Mozarella();
    }

    @Override
    public Dough createDough() {
        return new Thin();
    }

    @Override
    public Proteins createProteins() {
        return new Seafood();
    }
}
