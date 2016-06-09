package OOP.patterns.singletone;

/**
 * Created by JuliaBezrukova on 03.06.2016.
 */
public class Believer {

    static God god;
    String name;

    @Override
    public String toString() {
        return "My name is " + name + ", I believe in " + god.getName();
    }
}
