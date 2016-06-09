package First;

/**
 * Created by Юля on 09.02.2016.
 */
public class MyFirstClass {

    public static void main(String args[]) {
        String message ="Hello world!";
        int birthYear=1996;
        int age = 2016 - birthYear;
        message = "Hello. "+"world! I'm "+ age;//конкотенация
        System.out.println(message);
        //System.out.println(age);
        //case1
        long years = 2016L;
        long days = 365;
        long hours = 24;
        long seconds = 3600;
        long milli = 1000;


        //case2
        long millisecondsFromBC=2016L * 365L * 24L * 3600L *1000L;
        //case3
        int intYears = (int) years;
         millisecondsFromBC= (long) 2016 * 365 * 24 * 3600*1000;

        System.out.println(millisecondsFromBC);


    }
}
