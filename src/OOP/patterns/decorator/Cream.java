package OOP.patterns.decorator;

/**
 * Created by Юля on 12.04.2016.
 */
public class Cream extends BeverageDecorator {

    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 6 + super.cost();
    }

    @Override
    public String description() {
        return super.description() + ", +cream";
    }
}
