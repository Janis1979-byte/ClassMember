import java.util.Scanner;

public class MajasDarbs3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ludz ievadit vardu uzvardu :");
        String vardsUzvards = scanner.nextLine();
        scanner.close();
        String vards = vardsUzvards.substring(0, vardsUzvards.indexOf(" "));
        String uzvards = vardsUzvards.substring(vardsUzvards.lastIndexOf(" ") +1);
        System.out.printf("'%s'\n",  vards.substring(0,1).toUpperCase() + vards.substring(1).toLowerCase());
        System.out.printf("'%s'\n", uzvards.toUpperCase());

    }

}
