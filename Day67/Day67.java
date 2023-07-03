//package 100 Days of code.Day67;


class Parent{
    Parent(){
        System.out.println("Non-Param of Parents");
    }
    Parent(int x){
        System.out.println("Param of parents "+x);
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Non-param of Child");
    }
    Child(int y){
        System.out.println("Param of Child");
    }
    Child(int y,int x){
        super(x);
        System.out.println("2 Param of Child");
    }
}

public class Day67 {
    public static void main(String[] args) {
        //Parent p = new Parent();
        Child c = new Child(5,6);
    }
}
