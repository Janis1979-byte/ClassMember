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
        Scanner scan = new Scanner(System.in);
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
        System.out.println("Programmas  beigas");

    }}


