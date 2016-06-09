package lesson4;

/**
 * Created by Þëÿ on 19.02.2016.
 */
public class ArrayInputFromConsole {
    public static void main(String[] args) {
        int[] array = Utils.getArrayFromConsole();

        Utils.prinArray(array);
        System.out.println("\n");
        System.out.println("Sum of elements: "+findTheSumOfAllElementsOfArray(array));

    }
    private static int findTheSumOfAllElementsOfArray(int[] array){
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum+=array[i];

        }
        return sum;
    }
}
