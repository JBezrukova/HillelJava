package OOP.abstraction;

/**
 * Created by Þëÿ on 11.03.2016.
 */
public class AbstractionMain {
    public static void main(String[] args) {
        Auto auto = new Lada(1995);
        System.out.println(auto);

        Lada lada = new Lada(1999);
        Repairable repairable = new Lada(1987);

        repair(lada);
        repair(repairable);
    }

    public static void repair(Repairable repairable){
        repairable.repair();
    }
}

