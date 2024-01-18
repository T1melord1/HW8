import java.util.Arrays;
import java.util.Scanner;

public class OOP {
    static int[] array = new int[5];
    public static void mass(){
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < array.length ; j++) {
                array[i]=j+i;
            }
        }
        array[3]=returnNum();
        System.out.println(Arrays.toString(array));
    }
    public static int returnNum() {
        System.out.println("Insert the number");
        return new Scanner(System.in).nextInt();

    }

}
