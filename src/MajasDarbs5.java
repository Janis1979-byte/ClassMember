import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MajasDarbs5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int x = rnd.nextInt(4) + 3;
        int[][] masivs = new int[x][x];
        //System.out.println(Arrays.deepToString(masivs));
        System.out.println("A. Aizpildit masiva elementa vertibas manuali?");
        System.out.println("B. Aizpildit masiva elementa vertibas nejausi?");
        String izveleMat = scan.nextLine();
        while (!izveleMat.equalsIgnoreCase("A")) {
            System.out.println("Ludzu noradiet atbilstosu vertibu");
           izveleMat = scan.nextLine();
        }
            for (int i = 0; i < masivs.length; i++) {
                for (int j = 0; j < masivs[i].length; j++) {
                    masivs[i][j] = rnd.nextInt(101) + 1;
                    System.out.printf("%5d", masivs[i][j]);
                }
                System.out.println();
            }
         while (!izveleMat.equalsIgnoreCase("B")) {
        System.out.println("Ludzu noradiet atbilstosu vertibu");
        izveleMat = scan.nextLine();

        /*



        char a = 'A';
        char b = 'B';
        Character.toString(a);

        System.out.println(teksts1);
        System.out.println(teksts2);
        String izvele1 = scan.nextLine();
        if(izvele1 == a ) {
            for(int i =0; i< masivs.length; i++){
                for(int j =0; j<masivs[i].length; j++){
               masivs[i][j]= rnd.nextInt();
                }

            }
        }
        System.out.printf("%5d", masivs);*/

    } } }

