package OOP.abstraction;

/**
 * Created by Þëÿ on 11.03.2016.
 */
public class Lada extends Auto implements Repairable {

    public Lada(int year) {
        super(year);
    }

    @Override
    public String getMark() {
        return "Lada";
    }

    @Override
    public void repair(){
        System.out.println("repaired");
    }
}
