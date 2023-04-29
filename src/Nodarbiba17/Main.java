package Nodarbiba17;

public class Main {
    public static void main(String[] args) {
        Person kristaps = new Person("Kristaps", "Krumins", 12, "123");


        /*kristaps.name = "Kristaps";
        kristaps.surName = "krumins";
        kristaps.age = 24;
        kristaps.idNumber = "3333323";*/

        Person arturs = new Person("KArturs", "berzins", 25, "123");
     /*   arturs.name = "Arturs";
        arturs.surName = "kzale";
       arturs.age = 23;*/



        Person zane = new Person(Person.defaultValue, Person.defaultValue);


        //zane.surName = "Uzvards";

        kristaps.sayHello();
        arturs.sayHello();
        zane.sayHello();



        }

    }

