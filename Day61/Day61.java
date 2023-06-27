//import Outer.Inner;
abstract class My{
    abstract public void show();
}
class Outer{
     public  void display(){
        My m = new My(){
            public void Show(){
                System.out.println("HEy");
            }
        };
        m.show();
        class Inner{
            public void Show(){
                System.out.println("Show");
            }
        }
        Inner i = new Inner();   //new Inner().show();
        i.Show();
    }
}
public class Day61 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
        
    }
}
