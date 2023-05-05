package Nodarbiba20;



public class abstractionExample implements IShape {
    private double length, width;

    public abstractionExample(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length*width;

    }

    public double permeter() {

        return 2*(length+width);
    }

    public double getLength() {

        return this.length ;
    }
}


