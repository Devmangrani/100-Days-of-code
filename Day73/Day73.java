
import java.nio.channels.Channel;

class Super {
    public void display() {
        System.out.println("Display Super Class");
    }
}

class sub extends Super {

    public void display() {
        System.out.println("Display Sub Class");
    }
}

// Example
class TV {
    public void Switch() {
        System.out.println("TV is Switched ON");

    }

    public void Change() {
        System.out.println("TV Channel Changed");
    }
}

class SmartTV extends TV {
    public void Switch() {
        System.out.println("Smart TV Switch ON");
    }

    public void Change() {
        System.out.println("Smart TV channel Changed");
    }

    public void browse() {
        System.out.println("Smart TV is Browsing Channel");
    }
}

public class Day73 {
    public static void main(String[] args) {
         Super su = new sub();
         su.display();
        
          //Super su = new Super();
          su.display();
          sub sb = new sub();
          sb.display();
         
  
        
    }

}
