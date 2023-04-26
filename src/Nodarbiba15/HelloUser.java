package Nodarbiba15;

public class HelloUser {

    public static void sayHello(String a) {
        System.out.printf("Hello, %s ! \n", a);
    }
    public static void main(String[] args) {
        sayHello("Kristaps");
        sayHello("Janis");
    }
}
