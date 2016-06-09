package OOP.patterns.factory;

import OOP.patterns.factory.factories.*;
import enums.PizzaType;

/**
 * Created by Юля on 30.05.2016.
 */
public class PizzaMain {

    public static void main(String[] args) {
        PizzaComponentsFactory nyPizzaComponentsFactory = new NYPizzaComponentsFactory();
        PizzaStore NYpizzaStore = new PizzaStore(new NYPizzaFactory(nyPizzaComponentsFactory));
        PizzaComponentsFactory chPizzaComponentsFactory = new CHPizzaComponentsFactory();
        PizzaStore CHpizzaStore = new PizzaStore(new CHPizzaFactory(chPizzaComponentsFactory));
        NYpizzaStore.order(PizzaType.CHEESE);
        CHpizzaStore.order(PizzaType.MEAT);
    }
}
