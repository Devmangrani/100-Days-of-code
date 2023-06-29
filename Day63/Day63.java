class Rectangle{
    private double lenght;
    private double breadth;

    public double getlenght(){
        return lenght;

    }
    public double getbreadth(){
        return breadth;
    }
    public double setlenght(double l){
        return lenght = l;
    }
    public double setbreadth(double b){
        return breadth = b;
    }

    public double area(){
        return lenght*breadth;
    }
    public double perimeter(){
        return 2*(lenght*breadth);
    }
    public boolean isSquare(){
        if(lenght==breadth)
        return true;
        else
        return false;
    }
}
public class Day63 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setlenght(10);
        r.setbreadth(10);
        System.out.println("Area : "+r.area());
        System.out.println("Perimeter : "+r.perimeter());
        System.out.println("is it a Square : "+r.isSquare());
        System.out.println("lenght : " + r.getlenght());
        System.out.println("breadth : " + r.getbreadth());

    }
}
