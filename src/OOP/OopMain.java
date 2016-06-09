package OOP;

import lesson4.Utils;

/**
 * Created by Þëÿ on 23.02.2016.
 */
public class OopMain {
    public static void main(String[] args) {
        passPrimrtive();
        passObjects();
        passImmutableObjects();
        equalsExample();

        Human i = new Human();
        System.out.println("Hands amount: "+Human.handsAmount);

        Human.handsAmount = 1;
        System.out.println("Hands amount: "+Human.handsAmount);
        i.handsAmount =2;
        System.out.println(Human.handsAmount);
        //i.hansAmount =2; == Human.handsAmount=2;
        i.name = "Jul";
        System.out.println("My name is "+i.name);
        Human you = new Human();
        you.name = "Max";
        System.out.println("Your name is "+you.name);
        System.out.println("we are == "+(i==you));
        System.out.println("we are equals "+(i.equals(you)));
        System.out.println("names are equals: "+(i.name.equals( you.name)));
        System.out.println("names are == "+(i.name == you.name));
        System.out.println(Human.sayHello());

        System.out.println( i.introduce());
        System.out.println(you.introduce());
    }

    private static void equalsExample() {
        Integer a = 333;
        Integer b=333;
        System.out.println("== "+(a==b));//the answer is false 'cause a and b is links(a and be must be >-127; && <128)
        System.out.println("Equals: " + (a.equals(b)));//equals does not compare links but estimates
    }

    private static void passImmutableObjects() {
        Integer i = new Integer(10);//is not able to be changed
        modifyInteger(i);
        System.out.println(i);
    }

    private static void modifyInteger(Integer i){
        i=12;
    }

    private static void passPrimrtive() {
        int a =10;
        print(a);
        System.out.println("After: " + a);
    }

    private static void passObjects() {
        int[] ints = new int[3];
        Utils.prinArray(ints);
        modifyArray(ints);
        Utils.prinArray(ints);
    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void modifyArray(int[] array) {
        array[0] = 10;
        array[1] = 20;
    }
}
