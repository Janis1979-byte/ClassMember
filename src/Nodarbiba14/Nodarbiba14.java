package Nodarbiba14;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nodarbiba14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ievadit daramo lietu nosaukumus, kurus jaievada sarakstā: ");
        System.out.println("Darmo lietu saraksts tiks papildinats lidz bridim kamer nebus ierakstijis exit");
        List<String> toDoItems = new ArrayList<>();
 String nosaukumi = scan.nextLine();
        while (!(nosaukumi.equalsIgnoreCase("exit"))) {
            toDoItems.add(nosaukumi);
            System.out.printf("Daramo saraksts papildinats ar %s\n", nosaukumi);
            System.out.println("Ievadiet nakamo daramo lietu sarakstu, ja nevelies raksti exit: ");
            nosaukumi = scan.nextLine();

        }
        scan.close();
        if (toDoItems.size()  == 0) {
            System.out.printf("Sarkasts nav papildinats, daramo lietu saraksts %d", toDoItems.size());
        } else {
            System.out.printf("Lietu saraksts papildinats ar %d lietām  \n", toDoItems.size());
        }
        for (String row : toDoItems) {
            System.out.printf("%4s \n", row);
/*do{
    nosaukumi = scan.nextLine();
    if(!nosaukumi.equalsIgnoreCase("exit")) {
        toDoItems.add(nosaukumi);

    }
        } while (!nosaukumi.equalsIgnoreCase("exit"));
scan.close();
        System.out.printf("Lietu saraksts papildinats ar %d lietām  \n", toDoItems.size());
for(int i=0; i< toDoItems.size(); i++) {
    System.out.printf("To-Do Item %d: %s \n", i+1, toDoItems.get(i));
}*/
 /*   while(true) {
        String nosaukumi = scan.nextLine();
        if(nosaukumi.equalsIgnoreCase("exit")){
            break;
        }
        toDoItems.add(nosaukumi);
    }*/

    }}}