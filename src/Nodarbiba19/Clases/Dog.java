package Nodarbiba19.Clases;

public class Dog extends Animal{
    public String breed;
     public String name;
    public Dog(String breed) {
        super();
        this.breed = breed;
        this.name = "Unknow";

    }

    public Dog(String breed, String color, String name) {
        super();
        this.breed = breed;
        this.color = color;
        this.name = name;
    }
@Override
    public void saySomthing() {
        System.out.println("xa xa");
    }

}
