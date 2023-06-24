//Interfarence
interface test{
    void meth1();
    void meth2();
}
class My implements test{
    public void meth1(){
        System.out.println("Meth1 of Class My");
    }
    public void meth2(){
        System.out.println("Meth2 of Class My");
    }
    public void meth3(){
        System.out.println("Meth3 of Class My");
    }
}
public class Day57 {
    /*public static void main(String[] args) {
        test t = new My();
        t.meth1();
        t.meth2();
        My m = new My();
        m.meth3();
    }*/
}
