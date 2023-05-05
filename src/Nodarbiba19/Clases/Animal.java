package Nodarbiba19.Clases;

public class Animal {
    public String color;

    public Animal() {
        this.color = "Unknow";
    }

    public Animal(String color) {
        this.color = color;

    }

    public String getName() {
        return this.color;
    }

    public void setName(String color) {
        this.color = color;
    }

    public void saySomthing() {
        System.out.println("bla bla");

    }
}