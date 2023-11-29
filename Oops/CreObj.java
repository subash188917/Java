package Oops;
class CreObj {
    String name;
    int rollno;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
    public void setValues(String str,int num){
        name = str;
        rollno=num;
    }
}
class Main{
    public static void main(String[] args) {
        CreObj clob = new CreObj();
        clob.setValues("Subash",71);
        clob.display();

        CreObj clobb = new CreObj();
        clobb.setValues("Pradhee",70);
        clobb.display();
    }
}
