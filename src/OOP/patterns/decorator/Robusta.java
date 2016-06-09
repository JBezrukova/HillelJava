package OOP.patterns.decorator;

/**
 * Created by Юля on 12.04.2016.
 */
public class Robusta implements Beverage{
    @Override
    public int cost() {
        return 13;
    }

    @Override
    public String description() {
        return "Robusta coffee";
    }
}
