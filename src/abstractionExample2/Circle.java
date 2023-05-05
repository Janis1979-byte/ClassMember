package abstractionExample2;

public class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }


    public double area() {
        return Math.PI * this.radius * this.radius;
    }


    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}