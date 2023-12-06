package Oops;

interface Father {
    abstract void call();
    abstract void talk();
}
interface Mothr {
    abstract void call();
    abstract void talk();
}
class Son implements Father,Mothr{
    @Override
    public void call() {
        System.out.println("Calling");
    }

    @Override
    public void talk() {
        System.out.println("Talking");
    }

    public static void main(String[] args) {
        Son ob = new Son()
                ;
        ob.call();
        ob.talk();
    }
}

