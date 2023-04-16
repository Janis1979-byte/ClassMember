import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MajasDarbs5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int x = rnd.nextInt(3)+5 ;
        int[][] masivs = new int[x][x];
        //System.out.println(Arrays.deepToString(masivs));
        System.out.println("A. Aizpildit masiva elementa vertibas manuali?");
        System.out.println("B. Aizpildit masiva elementa vertibas nejausi?");
        String izveleMat = scan.nextLine();
        while(!(izveleMat.equalsIgnoreCase("A") || izveleMat.equalsIgnoreCase("B"))){
            System.out.printf("Ievaditais burts %s nav atbilstoss, ievadiet [A,B]: ", izveleMat );
            izveleMat = scan.nextLine();
        }
        if (izveleMat.equalsIgnoreCase("A")) {
            System.out.printf("Ievaditais burts %s atbisltos aizpildam automatiski [A] varinatu \n" , izveleMat);
            for (int i = 0; i < masivs.length; i++) {
                for (int j = 0; j < masivs[i].length; j++) {
                    masivs[i][j] = rnd.nextInt(101) + 1;
                    System.out.printf("%5d", masivs[i][j]);
                }
                System.out.println();
            }
        }
        if (izveleMat.equalsIgnoreCase("B")) {
            System.out.printf("Ievaditais burts %s atbisltos aizpildam [B] varinatu \n", izveleMat);
            for (int i = 0; i < masivs.length; i++) {
                for (int j = 0; j < masivs[i].length; j++) {
                    System.out.printf("array[%d][%d] =", i, j);
                    masivs[i][j] = scan.nextInt();
                }
            }
            scan.close();
            for (int[] row : masivs) {
                for (int column : row) {
                    System.out.printf("%5d", column);
                }
                System.out.println();

            }

        }
            ;
           /* for (int i = 0; i < masivs.length; i++) {
                for (int j = 0; j < masivs[i].length; j++) {
                    System.out.printf("%5d", masivs[i][j]);*/

        /*for(int i =0; i< masivs.length; i++) {
            for(in)*/

        }


        }
                //System.out.println();







