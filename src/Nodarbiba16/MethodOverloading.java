package Nodarbiba16;

public class MethodOverloading {

    public static int sum(int x, int y){
       return x+y;

    }

    public static int sum(int x, int y, int z){
        return x+y+z;

    }

    public static float sum(float x, float y){
        return   x+y;

    }

    public static float sum(float x, float y, float z){
        return x+y+z;

    }
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(3f, 2.8f));
        System.out.println(sum(3f,5.23f, 1.5f));

    }
}
