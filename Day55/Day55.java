//package 100 Days of code.Day55;
class Super{
    public void meth1(){
        System.out.println("Super method1");
    }
    public void meth2(){
        System.out.println("Super method2");
    }

}
class Sub extends Super{
    public void meth2(){
        System.out.println("Sub meth2");
    }
    public void meth3(){
        System.out.println("Sub meth3");
    }
}
public class Day55 {
    public static void main(String[] args) {
        Super sup = new Sub();
        sup.meth1();
        sup.meth2();
    }
}
