package lesson4;

/**
 * Created by Þëÿ on 19.02.2016.
 */
public class ArraySort {
    //selection sort
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1, 8};
        for (int i = 0; i < array.length; i++) {
            int min=array[i];
            int position=i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min=array[j];
                    position=j;
                }
            }
            int box=array[i];
            array[i]=array[position];
            array[position]=box;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
