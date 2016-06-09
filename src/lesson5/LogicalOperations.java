package lesson5;

/**
 * Created by Þëÿ on 23.02.2016.
 */
public class LogicalOperations {
    public static void main(String[] args) {
        System.out.println(a()||b());
        // if the first parameter is true || will not call the second one
    }
    public static boolean a(){
        System.out.println("MEthod a is called: ");
        return true;
    }
    public static boolean b(){
        System.out.println("Method b is called: ");
        return true;
    }
}
