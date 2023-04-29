package Nodarbiba17praktika;

public class Main {
    public static void main(String[] args) {
Circle aplis1 = new Circle(10.0, "dzeltens");

Circle aplis2 = new Circle(13.0);

aplis1.circleInfo();
aplis2.circleInfo();

        System.out.printf("Apla radis1 %.2f \n", aplis1.getArea());
        System.out.printf("Apla radis2 %.2f \n", aplis2.getArea());
        System.out.printf("Rinka linijas1 garums %.2f \n", aplis1.getCircleLength());
        System.out.printf("Rinka linijas2 garums %.2f \n", aplis2.getCircleLength());
        System.out.printf("caolor = %s,  area =%.2f, circle length = %.2f \n", aplis1.color, aplis1.getArea(), aplis1.getCircleLength());
        System.out.printf("caolor = %s,  area =%.2f, circle length = %.2f\n", aplis2.color, aplis2.getArea(), aplis2.getCircleLength());
    }
}
