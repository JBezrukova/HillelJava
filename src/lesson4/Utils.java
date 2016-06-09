package lesson4;

import java.util.Scanner;

/**
 * Created by Þëÿ on 19.02.2016.
 */
public class Utils {
    public static int[] getArrayFromConsole(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();

        System.out.println("Enter elements: ");

        int[] array = new int[size];
        for (int i=0; i<size; i++ ){
            array[i]=scanner.nextInt();
        }
        return array;

    }

    public static void prinArray(int[] array){
        System.out.println("Array: ");
        for(int i=0;i<array.length;i++){
            if (i==array.length-1)
                System.out.print(array[i]);
            else
                System.out.print(array[i]+",");
        }
        System.out.println("\n");
    }
}
