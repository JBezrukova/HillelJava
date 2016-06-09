package java8Features;

import OOP.patterns.singletone.God;
import OOP.patterns.singletone.TheGod;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by JuliaBezrukova on 06.06.2016.
 */
public class Java8Example {

    public static void main(String[] args) {

        God god = TheGod.getInstance();
        god.resurect();

        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(200, "Red", 15));
        appleList.add(new Apple(250, "Green", 16));
        appleList.add(new Apple(100, "Green", 11));
        appleList.add(new Apple(250, "Yellow", 15));

        Function<Apple, String> colorFunction = apple -> apple.getColor();
        print(appleList, colorFunction);

        Function<Apple, String> priceFunction = apple -> String.valueOf(apple.getPrice());
    }

    private static void print(List<Apple> appleList, Function<Apple, String> function) {
        for (Apple apple : appleList) {
            System.out.println(function.apply(apple));
        }
    }

    private static void methodReferenceExample(List<Apple> appleList) {
        //method link
        Consumer<Apple> applePrinter = System.out::println;
        appleList.forEach(applePrinter);
    }

    private static void predicates(List<Apple> appleList) {
    /*
            AppleTester greenTester = apple -> apple.getColor().equals("Green");
            AppleTester heavyTester = apple -> apple.getWeight() > 200;
      */
        Predicate<Apple> isGreen = apple -> apple.getColor().equals("Green");
        List<Apple> greenApples = select(appleList, isGreen);

        Predicate<Apple> isHeavy = apple -> apple.getWeight() > 200;
        System.out.println(greenApples);

        List<Apple> heavyApples = select(appleList, isHeavy);
        System.out.println(heavyApples);

        Predicate<Apple> greeanAndHeavy = isGreen.and(isGreen);
    }

    private static List<Apple> select(List<Apple> appleList, Predicate tester) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (tester.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    /*
        private static List<Apple> selectGreen(List<Apple> appleList) {
            List<Apple> green = new ArrayList<>();
            for (Apple apple : appleList) {
                if (apple.getColor().equals("Green")) {
                    green.add(apple);
                }
            }
            return green;
        }
    */
    private static void appleComparator(List<Apple> appleList) {
        Comparator<Apple> byColor = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        };

        Collections.sort(appleList, byColor);
        System.out.println(appleList);
        appleList.sort(byColor);
    }
}
