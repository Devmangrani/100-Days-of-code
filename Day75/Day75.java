//package 100 Days of code.Day65;
//Singleton Class -> Which can create just a single object, more than one objects of a class are not allowed
class CoffeMachine{
    private float coffeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    static public CoffeMachine my = null;
    private CoffeMachine(){//Constructor
        coffeQty = 1;
        milkQty = 1;
        waterQty= 1;
        sugarQty = 1;
    }
    public void fillwater(float qty) {
        waterQty = qty;
    }
    public void fillsugar(float qty) {
        sugarQty = qty;
    }
    
    public float getCoffe() {
        return 0.15f;
    }
    static CoffeMachine getInstance(){
        if (my == null) 
           my = new CoffeMachine();
            return my;
        
    }
}

public class Day75 {
    public static void main(String[] args) {
        CoffeMachine m1 = CoffeMachine.getInstance();
        CoffeMachine m2 = CoffeMachine.getInstance();
        CoffeMachine m3 = CoffeMachine.getInstance();
        System.out.println(m1 + " " + m2 + " " + m3);
        if (m1==m2 && m1==m3) {
            System.out.println("same");
        }
    }
}
