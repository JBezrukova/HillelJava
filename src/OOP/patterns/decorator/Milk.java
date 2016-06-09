package OOP.patterns.decorator;

/**
 * Created by Юля on 12.04.2016.
 */
public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 5 + super.cost();
    }

    @Override
    public String description() {
        return super.description() + ", +milk";
    }
}
