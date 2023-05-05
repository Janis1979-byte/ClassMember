package Nodarbiba20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IShape> shapeList = new ArrayList<>();
        shapeList.add(new abstractionExample(2.0, 3.0));
        shapeList.add(new Circle(2.0));
        shapeList.add(new Triangle(2.2, 2.3, 2.4));

        for (IShape shape : shapeList) {
            if (shape instanceof abstractionExample) {
                System.out.println("abstractionExample");
            } else if (shape instanceof Circle) {
                System.out.println("Circle");
            } else if (shape instanceof Triangle) {
                ;
                System.out.println("Triangle");
            }
        }
        //System.out.println(((abstractionExample)shape).getLength());
        /*  System.out.println(shape.area());
        System.out.println(shape.permeter());*/
    }

}


