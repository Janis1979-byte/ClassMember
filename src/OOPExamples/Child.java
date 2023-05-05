package OOPExamples;

public class Child extends Parent {


    public Child(int id, String attr1, double attr2, String name) {
        super(id, attr1, attr2, name);
    }
    public String attribute3;
    public Child(int id, String attr1, double attr2, String name, String aattr3) {
        this(id, attr1, attr2, name);
        this.attribute3 = aattr3;
    }
}
