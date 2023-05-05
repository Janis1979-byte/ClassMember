package Nodarbiba17praktika;


import Nodarbiba17.Person;

public class Main {
    public static void main(String[] args) {
Circle aplis1 = new Circle(10.0, "dzeltens");

Circle aplis2 = new Circle(13.0);

aplis1.circleInfo();
aplis2.circleInfo();

             Person  jais = new Person("kristine","aple");


        System.out.printf("Apla radis1 %.2f \n", aplis1.getArea());
        System.out.printf("Apla radis2 %.2f \n", aplis2.getArea());
        System.out.printf("Rinka linijas1 garums %.2f \n", aplis1.getCircleLength());
        System.out.printf("Rinka linijas2 garums %.2f \n", aplis2.getCircleLength());
        System.out.printf("caolor = %s,  area =%.2f, circle length = %.2f \n", aplis1.color, aplis1.getArea(), aplis1.getCircleLength());
        System.out.printf("caolor = %s,  area =%.2f, circle length = %.2f\n", aplis2.color, aplis2.getArea(), aplis2.getCircleLength());

        System.out.print(aplis1.toString()); // nevajag println jo printf jau ir \n new line, pietiek ar print
        System.out.print(aplis2.toString());
        System.out.print(aplis1);
        System.out.print(aplis2);

            jais.sayHello();



    }
}
