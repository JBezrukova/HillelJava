package OOP.patterns.factory.pizzas;

import OOP.patterns.factory.pizzas.ingredients.cheese.Cheese;
import OOP.patterns.factory.pizzas.ingredients.dough.Dough;
import OOP.patterns.factory.pizzas.ingredients.proteins.Proteins;

/**
 * Created by Юля on 30.05.2016.
 */
public class Pizza {

    private Cheese cheese;
    private Dough dough;
    private Proteins proteins;


    public void bake(){
        System.out.println("Pizza is baking...");
    }

    public void cut(){
        System.out.println("Pizza is cutting...");
    }

    public void box(){
        System.out.println("Pizza is in box.");
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Proteins getProteins() {
        return proteins;
    }

    public void setProteins(Proteins proteins) {
        this.proteins = proteins;
    }
}
