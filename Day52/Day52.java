//package 100 Days of code.Day52;
//Inheritance
class Circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
class cylinder extends Circle{
    public double height;
    public double volume(){
        return area()*height;
    }
}
public class Day52 {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.height=7;
        c.radius=10;
        System.out.println("Volume"+c.volume());
        System.out.println("Area"+c.area());
    }
}

