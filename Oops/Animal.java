package Oops;

public class Animal {
    int noLegs =4;
    public static void eat(){
        System.out.println("I am eating");
    }
    public static void walk(){
        System.out.println("I am walking");
    }
}

class Dog extends Animal {

    Boolean canBark = true;
    int noLegs =5;

    public static void eat(){
        System.out.println("Dog is eating");
    }

}
class Call{
    public static void main(String[] args) {
        Dog obj = new Dog();
        System.out.println(obj.noLegs);
        System.out.println(obj.canBark);
        obj.eat();
        obj.walk();
    }
}