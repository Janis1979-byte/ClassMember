package abstractionExample2;

public class Triangle extends  Shape{
    private double a, b, c;

    public Triangle(String name, double a, double b, double c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c =c;
    }
    public double perimeter() {
        return a+b+b+c;
    }

    public double area() {
        double s = perimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
