package Oops;

abstract class Computer {
    abstract void turnOff();
    void turnOn(){
        System.out.println("Turning ON");
    }
}

class HP extends Computer{
    @Override
    void turnOn() {
        System.out.println("Turning ON-1");
    }

    @Override
    void turnOff() {
        System.out.println("Turning OFF");
    }
}

class DELL extends Computer{
    void turnOff() {
        System.out.println("Turning OFF");
    }
}
class Abstract{
    public static void main(String[] args) {
        HP ob = new HP();
        ob.turnOn();
        ob.turnOff();

        DELL ob1 = new DELL();
        ob1.turnOn();
        ob1.turnOff();
    }
}