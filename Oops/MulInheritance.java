package Oops;
class MulInheritance {
    public static void main(String[] args) {
        Daughter s = new Daughter() ;
        System.out.println(s.gender);
        s.print();

    }

}
class GrandFather{
    char gender ='M';
    void print(){
        System.out.println("Parent Class");
    }
}
class Mother extends GrandFather{
    char gender ='F';
}
class Daughter extends Mother{

}