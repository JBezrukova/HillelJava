package lesson4;

/**
 * Created by Юля on 19.02.2016.
 */
public class StringClass {
    public static void main(String[] args) {
        //create String
        String str= "some string";
        String str1 = new String("some string");

        char symbol = str.charAt(3);//возвращает конкретный символ
        //create String "blue". var + enter

        int sum = getNumberOfSymbols(symbol, str);
        System.out.println("number of "+symbol+" in str= "+sum);
        String str2 = str.concat(" cat");
        System.out.println("concat string: "+str2);
        String str4= "\"Amimal\"";
        System.out.println(str4);
        String str5 = " Word with spaces ";
        System.out.println(str5.trim());//delete left and right " "
        String str6 = str5.replace("with", "something");
        System.out.println("Replace example: "+str6);
        String str7 = str5.substring(5,10);//inclusive 5 exclusive 10;
        System.out.println("SubString example: " + str7);
       String[] str8 =  str6.split(" ");//split all symbols before and after " "
        System.out.println(str8);
    }
    private static int getNumberOfSymbols(char symbol, String str){
        int sum=0;
        for(int i=0; i<str.length();i++){
            if (str.charAt(i) == symbol){
                sum++;
            }

        }
        return sum;
    }
}
