package Oops;

public class Hierarchical {
    public static void main(String[] args) {
    Mothe M = new Mothe();
        System.out.println(M.gender);
        M.print();

        Uncle U = new Uncle();
        System.out.println(U.gender);
U.print();
    }

}
class GranFather{
    char gender = 'M';
    void print(){
        System.out.println("Parent class");
    }
}
class Mothe extends GranFather{
    char gender = 'F';
}
class Uncle extends GranFather{
    char gender = 'M';
}