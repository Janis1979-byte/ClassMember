package Nodarbiba13;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class nodarbiba13 {
    public static void main(String[] args) {
  /*      Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>= -32768 && x<=32767)System.out.println("* short");
                if(x>= Math.pow(-2, 31) && x<=Math.pow(2, 31)-1)System.out.println("* int");
                if(x>= Math.pow(-2, 63) && x<=Math.pow(2, 63)-1)System.out.println("* long");
                if(x>=-128 && x<=127)System.out.println("* byte");




                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");*/
        /*Scanner scan = new Scanner(System.in);
        String rinda = scan.nextLine();
        scan.close();
        String a = "123,5";
//int num = Integer.parseInt(a);
        //System.out.println(num+Integer.parseInt("1"));
//rinda =rinda.replace(',','.');

        try {

            float number = Float.parseFloat(rinda);
            System.out.println(number);
      int x =0;
           int y =1/x;
        } catch (NumberFormatException exception) {
            System.out.println("nepareizs skaitla formats");
        } catch (ArithmeticException exception) {
            System.out.println("dalijums ar nulli!");
        }
        System.out.println("Programmas  beigas");*/
/*try{
    String[][] aray = {
            {"a", "b"},
            {"c"}
    };
    System.out.println(aray[0][0]);
    System.out.println(aray[0][1]);
    System.out.println(aray[1][0]);
    System.out.println(aray[1][1]);
} catch (ArrayIndexOutOfBoundsException ex) {
    System.out.println("Megini pieklut elementam kas neeksiste");*/


/*int[] array = {1,2,3,4};
///List<Integer> list = A
List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4));
List<Integer> List2 = new ArrayList<>(Arrays.asList(5,6));
numberList.addAll(3, List2);
numberList.remove(new Integer(3));
 *//*   numberList.add(1);
      numberList.add(2);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(2, 3);*//*
        System.out.println(numberList);*/

   /*     List<String> soma = new ArrayList<>();
        soma.add("Klade");
        soma.add("mape");
        soma.add("zimulis");
        System.out.println(soma);
        // soma.remove("klade");
        for (int i = 0; i < soma.size(); i++) {
            if (soma.get(i).equalsIgnoreCase("Mape")) {
                soma.remove(i);
            }

        }
        soma.set(0, "nauda");
        soma.add(0,"soma");
      //  System.out.println(soma);
        for(String elemnt: soma){
            System.out.println(elemnt);*/
        List<List<Integer>> mylist = new ArrayList<>();
        //List<Integer> tempList = new ArrayList<>(Arrays.asList(1,2,3));
       // mylist.add(tempList);
        mylist.add(new ArrayList<>(Arrays.asList(1,2,3)));
       // List<Integer> tempList2 = new ArrayList<>(Arrays.asList(5,4,6));
      //  mylist.add(tempList2);
        mylist.add(new ArrayList<>(Arrays.asList(5,4,6)));
        for(List<Integer> row:mylist) {
            for(Integer item: row)
            System.out.printf("%4d", item);       }

        }

    }

