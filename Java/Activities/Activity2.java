package activities;

import java.lang.reflect.Array;
import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        int[] Numarr = {10, 77, 10, 54, -33, 10};
        System.out.println("original Array = " + Arrays.toString(Numarr));

        int SearchNum = 10;
        int FixedSum = 30;
        System.out.println("Result:" + result (Numarr,SearchNum,FixedSum));
    }
    public static boolean result (int[] Numbers, int SearchNum, int FixedSum){
        int temp_sum = 0;
        for (int Number : Numbers){
            if (Number == SearchNum){
                temp_sum += SearchNum;
            }
            if (temp_sum > FixedSum){
                break;
            }

        }
return temp_sum == FixedSum;
    };

}
