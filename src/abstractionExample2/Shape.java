package abstractionExample2;

public abstract class Shape {

    public String name;
    public abstract double area();
    public  abstract  double perimeter();

    public String getDescription() {
        return String.format("Name %s, are %f, perimetr :%f",this.name, this.area(), this.perimeter());
    }

}
