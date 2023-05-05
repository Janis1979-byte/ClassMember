package Nodarbiba17praktika;

public class Circle {
    double radius;      //Lauki/fields

    String color;

    static final String defaultValue = "Black";
static final double defaultRadisu = 3.14;
    private Circle() {                         //konstruktori
        this.radius = 12;
        this.color = defaultValue;
    }

    /**
     * Konstruktors ar 1 parametru
     * Krasa default krasa Black
     * @param radius Circle radius
     */
    public Circle(double radius) {
        this.radius = radius;
        this.color = defaultValue;
    }

    /**
     * Konstruktors ar diviem parametriem
     * @param radius Radius
     * @param color Krasa
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;

    }

    public void circleInfo() {
        System.out.printf("Radius : %.2f, krasa: %s \n", radius, color);
    }

    /**
     * Aprekina apla laukumu
     * @return
     */
    public  double getArea() {                         //Method
        //return Math.pow(this.radius, 2.0)*defaultRadisu;
        return this.radius * this.radius * defaultRadisu * 2;
    }
        /**
         * Atgriez rinka linijas garumu
         */
        public double getCircleLength(){
    return 2 * defaultRadisu*this.radius;

        }

        @Override
        public String toString() {
            return String.format("caolor = %s,  area =%.2f, circle length = %.2f \n", this.color, this.getArea(), this.getCircleLength());
        }



}