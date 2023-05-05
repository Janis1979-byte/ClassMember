package Nodarbiba19.Clases;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog rex = new Dog("Geerman shepar", "black", "jack");
        System.out.println(animal1.getName());
        animal1.setName("krasa");
        animal1.saySomthing();
        System.out.println(animal1.getName());
        rex.saySomthing();


    }
}
