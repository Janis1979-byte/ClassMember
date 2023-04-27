package Nodarbiba16;

import java.util.Scanner;

public class Recursion {
    public static int factorial(int n) {

        if (n > 1) {

            return factorial(n - 1) * n;

        } else {
            return n;
        }
    }

    public static int fibonacci(int n) {

        if (n > 1) {

            return fibonacci(n-1)+fibonacci(n-2);
        }
            return n;
        }





    /*int result =1;
    for( int i = n; i>0; i--){
       result *=i;
    }
    return result;
}*/
        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            int x;
            do {
                System.out.println("Ievadi pozitivus kaitli:");
                x = scan.nextInt();
            } while (x < 0);
            System.out.println(factorial(x));
            System.out.println(fibonacci(x));

        }
    }



