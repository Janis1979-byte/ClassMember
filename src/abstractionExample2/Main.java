package abstractionExample2;

import abstractionExample2.Circle;
import abstractionExample2.Triangle;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Triangle("trijsturis", 2.0, 3.0, 3.0));
        shapeList.add(new Circle("aplis", 2.0));
        shapeList.add(new Rectangle("Taisnsturis", 3.0, 4.0));

        for (Shape shape : shapeList) {
            if (shape instanceof Triangle) {
                System.out.println("Trainagle");
            } else if (shape instanceof Circle) {
                System.out.println("Circle");
            } else if (shape instanceof Rectangle) {
                System.out.println("Rectangle");
            }
            System.out.println(shape.getDescription());
        }


    }
}