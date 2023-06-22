//package 100 Days of code.Day56;
/*Shape ->> properties/Methods ->>  Perimeter and Area but we can't define its formula but it apply for all shapes this is called abstract class which just have a method but nat a specific content to specify it
1. circle -->> extends of shape ->> radius(Property) or perimeter an area is Methods
1. Rectangle -->> extends of shape ->> lenght , breadth(property) or perimeter an area is Methods
*/
abstract class shape{
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends shape{
    double radius;
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends shape{
    double lenght;
    double breadth;
    public double perimeter(){
        return 2*(lenght+breadth);
    }
    public double area(){
        return lenght*breadth;
    }
}
public class Day56 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.lenght=10;
        r.breadth=20;
        System.out.println(r.area());
        System.out.println(r.perimeter());
         //shape s = r;
          //Polymorphism or Dynamic method dispatch
         Circle c = new Circle();
         c.radius=10;
         shape s = c;
         System.out.println(c.perimeter());
         System.out.println(s.area());

    }
}

