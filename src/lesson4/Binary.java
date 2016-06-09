package lesson4;

/**
 * Created by Þëÿ on 19.02.2016.
 */
public class Binary {
    public static void main(String[] args) {
        int[] binary={1,0,0,0,1,0};
        int result=0;
        for (int i=0;i<binary.length;i++){
             result = result + (int) Math.pow(2,binary.length-1-i)*binary[i];
        }
        System.out.println(result);
    }
}
