package OOPExamples;

public class Parent {
    private int id;
    public String attribute1;
    protected double attribute2;
    String name;

    public Parent() {}

    public Parent(int id, String attr1, double attr2, String name) {
this.id = id;
this.attribute1 = attr1;
this.attribute2 = attr2;
this.name =name;
    }

    public int getId(){
return this.id;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

}
