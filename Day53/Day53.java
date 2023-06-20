//package 100 Days of code.Day53;
class Rectangle{
    int lenght;
    int breadth;
    Rectangle(){//constructor
        lenght=breadth=1;
    }
    Rectangle(int l, int b){
        lenght =l;
        breadth = b;
    }
}
class cuboid extends Rectangle{
    int height;
    cuboid(){
        height=1;
    }
    cuboid(int h){
        height = h;
    
    }
    cuboid(int l ,int b, int h){
        super(l,b);
        height=h;
    }
    int volume(){
        return lenght*height*breadth;
    }
}
public class Day53 {
    public static void main(String[] args) {
        
        cuboid c = new cuboid(5,3,10-);
        System.out.println(c.volume());
    }
}
