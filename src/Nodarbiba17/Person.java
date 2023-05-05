package Nodarbiba17;

public class Person {
    String name;
    String surName;
    int age;
    String idNumber;

    static final String defaultValue = "Example";
   private Person(){
        this.name = Person.defaultValue;
        this.surName = Person.defaultValue;
        this.idNumber = Person.defaultValue;
        this.age = 0;
    }

    Person(String name, String surName, int age, String id) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.idNumber = id;
    }
 public Person(String name, String surName){
    this();
    this.name = name;
    this.surName = surName;

        }


    public void sayHello() {
        System.out.printf("%s  : Hello \n"  , this.name + " "+ this.surName);
    }


}
