package Nodarbiba15;

import java.util.Arrays;
import java.util.Random;

public class ArrayAverage {
    /**
     * Get average number
     * @param number
     * @return
     */
    public static float getAverage(int[] number) {
     int[] x = number;
     int z = x.length;
     int sum = 0;
     for(int i =0; i<z; i++){
       sum += number[i];
     }
     return (float)sum/z;
     }
/*public static int secondSymbol(String str, char c) {

    int count = 0;
    for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == c){
            if(count == 0){
                count++;
            } else if (count == 1){
                return i;
            }
        }
    }
    return -1;
}*/

    public static void main(String[] args) {
       // System.out.println(secondSymbol("Hello world!!!", 'o'));
   Random rnd = new Random();

    int[] array = {rnd.nextInt(10),rnd.nextInt(10), rnd.nextInt(10), rnd.nextInt(12) };
        System.out.println(Arrays.toString(array));
        System.out.printf("Videja veriba %.2f", getAverage(array));



    }

    }
