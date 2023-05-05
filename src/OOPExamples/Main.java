package OOPExamples;

public class Main {
    public static void main(String[] args) {
        Parent parentObject1 = new Parent(1, "values1", 2.0, "parent name");
        System.out.println(parentObject1.getId());

        Child childObject1 = new Child(2, "valuse", 4.0, "bvards", "value");
        System.out.println(childObject1.getId());
        System.out.println(childObject1.attribute3);

    }
}