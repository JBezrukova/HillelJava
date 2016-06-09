package OOP.patterns.decorator;

/**
 * Created by Юля on 12.04.2016.
 */
public class HouseBlend implements Beverage {
    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String description() {
        return "House Blend coffee";
    }
}
