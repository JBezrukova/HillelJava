package OOP.patterns.factory.factories;

import OOP.patterns.factory.pizzas.ingredients.cheese.Cheese;
import OOP.patterns.factory.pizzas.ingredients.cheese.Mozarella;
import OOP.patterns.factory.pizzas.ingredients.cheese.Parmejano;
import OOP.patterns.factory.pizzas.ingredients.dough.Dough;
import OOP.patterns.factory.pizzas.ingredients.dough.Thick;
import OOP.patterns.factory.pizzas.ingredients.dough.Thin;
import OOP.patterns.factory.pizzas.ingredients.proteins.Meat;
import OOP.patterns.factory.pizzas.ingredients.proteins.Proteins;

/**
 * Created by Юля on 30.05.2016.
 */
public class CHPizzaComponentsFactory implements PizzaComponentsFactory {
    @Override
    public Cheese createCheese() {
        return new Parmejano();
    }

    @Override
    public Dough createDough() {
        return new Thick();
    }

    @Override
    public Proteins createProteins() {
        return new Meat();
    }
}
