package Nodarbiba20;

public class Triangle implements IShape {
    private double a, b, c;
public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c =c;
}
    public double permeter() {
        return a+b+b+c;
    }

    public double area() {
        double s = permeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }



}
