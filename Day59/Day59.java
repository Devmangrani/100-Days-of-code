//package 100 Days of code.Day59;
interface Member{
    public void callback();
}
class Store{
    Member member[]=new Member[10];
    int count = 0;
    Store(){

    }
    void register(Member m){
        member[count++] = m;
    }
    void inviteSales(){
        for (int i = 0; i < count; i++) {
            member[i].callback();

        }
    }
}
class Customer implements Member{
    String name;
    Customer(String n){
        name = n;
    }
    public void callback(){
        System.out.println("Ok, I will Visit, " + name);
    }
}
public class Day59 {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c = new Customer("jhon");
        Customer c1 = new Customer("Smith");
        s.register(c);
        s.register(c1);
        s.inviteSales();
    }
}


