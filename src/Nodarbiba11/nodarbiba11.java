import java.lang.reflect.Array;
import java.util.Arrays;

public class nodarbiba11 {
    public static void main(String[] args) {
/*int[] a={1,3,3,4};
int[] b = Arrays.copyOfRange(a, 1, 3);*/
//a = Arrays.copyOf(a, a.length+1);
//a[3]=7;*/
/*for(int i =2; i <=7; i++) {
    a=Arrays.copyOf(a, a.length+1);
    a[i-1] = i;*/

   /* for(int i =1; i <7; i++) {
        a=Arrays.copyOf(a, a.length+1);
        a[i] = i+1;*/
        // System.out.println(Arrays.toString(b));
        //  }

//}
        //  int[] b = a;

        /// int[]c = new int[4];
        //System.arraycopy(a, 0, c, 1, 3);
        // b[0] =4;

        // System.out.println(Arrays.toString(b));
        // System.out.println(Arrays.toString(c));

        int[][] a = new int[3][4];
        a[1][2] =130;
        a[0][1] =500;
        a[2][2] =689;
        //System.out.println(Arrays.deepToString(a)); // nav labs piemers
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%5d", a[i][j]);
            }
            System.out.println();
        }
    }}