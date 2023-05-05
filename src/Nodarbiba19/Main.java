package Nodarbiba19;

import java.time.MonthDay;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     /*   System.out.print("Ievadi dienas kartas nummuru");
        int dayNr = scan.nextInt();*/

        System.out.println("Ievadi dienu (MONDAY-SUDAY): ");
        String dayValues = scan.nextLine();
scan.close();
/*Day[] dayArray = Day.values();
        Day diena = dayArray[dayNr-1];*/
      //  Day diena = Day.values()[dayNr-1]; tadu ari var rakstit ieprieksejas rinda vietaa


      //  System.out.println(diena);
Day diena = Day.getDayLv(dayValues);
        switch(diena) {
            case MONDAY:

                System.out.println("Ir pirmdiena");
              break;
            case TUESDAY:
                System.out.println("Ir Otrdiena");
                break;
            case WEDNESDAY:
                System.out.println("Ir tresdiena");
                break;
            case THURSDAY:
                System.out.println("Ir cetrudiena");
                break;
            case FRIDAY:
                System.out.println("Irpiektdiena");
                break;
            case SATURDAY:
                System.out.println("Irsestdiena");
                break;
            case SUNDAY:
                System.out.println("Ir svetdiena");
                System.out.println("ir nedelas nogale");
                break;


        }


    }
}
