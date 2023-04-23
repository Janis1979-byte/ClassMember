package MD2;

import java.util.Scanner;

public class MajasDarbs2 {
    public static void main(String[] args) {
        System.out.print("Ludzu ievadit koridnatu x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("Ludzu ievadit koridnatu y: ");
        int y = scanner.nextInt();
        scanner.close();
        if (x < 3 && x > -2 && y < 1 & y > -4) {
            System.out.println(String.format("Koordinātas (%d;%d) atrodas figūras iekšienē!", x, y));
        } else if (x <= 3 && x >= -2 && y >= -4 && y <=1) {
                System.out.println(String.format("Koordinātas (%d;%d) atrodas uz figūras līnijas!", x, y));
            } else{
                System.out.println(String.format("Koordinātas (%d;%d) atrodas figūras ārpusē!", x, y));
            }
        }
    }





