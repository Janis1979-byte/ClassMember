import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class nodarbiba10 {
    public static void main(String[] args) {

Random random = new Random();

        int[] names = new int[20];

       for(int i=0; i<names.length; i++) { //TODO: Nomainit uz Random (robežās no 20 lidz 50)
         names[i] = random.nextInt(31)+20;
       }
        System.out.println(Arrays.toString(names));
for(int i =0; i<names.length/2; i++){
        int temp = names[i];
        names[i] = names[names.length-i-1];
        names[names.length-i-1] = temp;


    }
        System.out.println(Arrays.toString(names));



      /* for(int i= 0; i< names.length; i++) {
           if(names[i].toLowerCase().startsWith(search.toLowerCase()))

           System.out.println(names[i]);*/
       }





/*String sampleName = "Kristaps";
String search = "kri";
        System.out.println(sampleName.toLowerCase().startsWith(search.toLowerCase()));*/


/*
int[] intArray = {3,1,5,4,2,8,5,6,7,2,5,6,4,9,10,52,38,64};
        System.out.println(Arrays.toString(intArray));

        for(int i =0; i <intArray.length; i++) {
            for(int j= 0; j <intArray.length; j++) {
                if(intArray[i] < intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(intArray));

//  for(int element: intArray) {
          //  System.out.println(element);
*/


           }
