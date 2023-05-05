package Nodarbiba20;

public class Circle implements IShape {
     private double radius;


     public Circle(double radius){
         this.radius = radius;
     }


    public double area() {
        return Math.PI * this.radius* this.radius;
    }


    public double permeter() {
        return 2*Math.PI* this.radius;
    }
}
