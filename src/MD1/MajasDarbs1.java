package MD1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MajasDarbs1 {
    public static void main(String[] args) {

      char degreeFarnheit = 8457;
      char degreecelsius = 8451;
       System.out.print("Ievadiet grādus farenheita" +  degreeFarnheit+ ": ");
        DecimalFormat f = new DecimalFormat("##.00");
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        scanner.close();
        float y = (5*(x-32))/9;
        System.out.println("Celsija gradi" + degreecelsius + ":"  + f.format(y));
    }
}