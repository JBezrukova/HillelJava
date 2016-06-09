package OOP;

/**
 * Created by Þëÿ on 23.02.2016.
 */
public class Human {
    static int handsAmount = 2; //we can write final -> handsAmount will be unchanged
    String name;

    public static String sayHello(){
        return "Hello from whole humanity!";
    }

    public String introduce(){
        return "My name is "+name;
    }

}
