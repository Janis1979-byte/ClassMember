package MD5;

import java.util.Random;
import java.util.Scanner;

public class MajasDarbs5_2 {
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("ievadīt 2D masīva 1.dimensijas izmēru rindu skaitu");
        int masivsD1 = scan.nextInt();
        while (masivsD1 < 5 || masivsD1 > 15) {
            System.out.printf("Ievaditais cipars %d netarodas robezas[5, 15], ievadiet velreiz: ", masivsD1);
            masivsD1 = scan.nextInt();
        }
        System.out.printf("Ievaditais cipars [%d]: \n", masivsD1);
        scan.close();
        int m = rnd.nextInt(11) + 4;
        int[][] masivs = new int[masivsD1][m];
        for (int i = 0; i < masivs.length; i++) {
            for (int j = 0; j < masivs[i].length; j++) {
                masivs[i][j] = rnd.nextInt(900) + 100;
            }
        }
        for (int[] row : masivs) {
            for (int colon : row) {
                System.out.printf("%5d", colon);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < masivs.length; i++) {
            for (int j = 0; j < masivs[i].length ; j++) {
                for (int k = j + 1; k < masivs[i].length; k++) {
                    if (masivs[i][j] < masivs[i][k]) {
                        int temp = masivs[i][j];
                        masivs[i][j] = masivs[i][k];
                        masivs[i][k] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < masivs.length; i++) {
            int[] temp = masivs[0];
            masivs[0] = masivs[masivs.length-1];
            masivs[masivs.length-1]  = temp;

            }
        for (int[] row : masivs) {
            for (int clon : row) {
                System.out.printf("%5d", clon);
            }
            System.out.println();
        }
    }
}