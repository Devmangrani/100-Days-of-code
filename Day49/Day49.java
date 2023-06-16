import java.util.Scanner;

//package 100 Days of code.Day49;
//package Abdul Bari;
class Circle{

    public double radius;  //Property
    public double area(){                   //Behavior
        return Math.PI * radius * radius;
    }  
    public double perimeter(){
        return 2*Math.PI * radius;
    }
    public double circumference(){
        return perimeter();
    }
}

public class Day49 {
    


    public static void main(String[] args) {
        Circle c1 = new Circle();
        
        c1.radius=7;
        System.out.println("Area : "+c1.area());
        System.out.println("Perimeter : "+c1.perimeter());
        System.out.println("Circumference : "+c1.circumference())
        
        }
}


