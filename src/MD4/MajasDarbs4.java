package MD4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MajasDarbs4 {
    public static void main(String[] args) {
        System.out.println("Ludzu ievadit masiva izmeru no [20:40] robezas");
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int[] array;
        int garums = scanner.nextInt();
        while (garums < 20 || garums > 40) {
            System.out.println("Ludzu ievadiet pareizu masiva izmeru [20:40]");
            garums = scanner.nextInt();
        }
        scanner.close();
        array = new int[garums];
        System.out.printf("Masiva garums noradits: %d \n", garums);
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(90) + 10;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        for (int element : array) {
            System.out.printf(" %d", element );

        }
    }
}
