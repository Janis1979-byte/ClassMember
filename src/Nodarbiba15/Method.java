package Nodarbiba15;

import java.util.ArrayList;
import java.util.List;

public class Method {


    public static  int divide(int a, int b){
      try{
          return  a/b;
      } catch(ArithmeticException ex) {

      }
        return 0;
    }
public static String getText(int number){
    if(number >0){
        return"Text1";
    } else if(number == 0) {
        return "Text2";
    }
    return "Text 3";
}
    public static double someNummber(double x, double y){
        return Math.pow(x, y);
    }
    public static void multilay(int x, int y) {
        System.out.println(x*y);
    }

    public static void sayHello() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        System.out.println(Math.pow(2, 3));
        multilay(4, 5);
        multilay(3, 5);

        List<Integer> mylist = new ArrayList<>();
mylist.add(1);


        System.out.println(getText(1));
        System.out.println(getText(-2));
        System.out.println(getText(0));
        System.out.println(divide(4, 2));
    }
}
