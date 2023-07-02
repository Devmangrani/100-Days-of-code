class Rectangle{
    private double lenght;
    private double breadth;
    public Rectangle(){
      lenght = 1;
      breadth = 1;
    }
    public Rectangle( double l, double b){
      lenght =l;
      breadth = b;
    }
    public Rectangle(double s){
      lenght=breadth=s;
    }
}
class Subject{
  private String subID;
  private String name;
  private int maxMarks;
  private int marksObtain;

  public String getSubID(){
      return subID;
  }
  public String getName(){
      return name;
  }
  public int getMaxMarks(){
      return maxMarks;
  }
  public int getmarksObtain(){
      return marksObtain;
  }
  public int setMaxMarks(int m){
      return maxMarks = m;
  }
  public int setMarksObtain(int mo){
      return marksObtain = mo;
  }
  //constructor
  public Subject(String subID, String name, int maxMarks){
      this.subID = subID;
      this.name = name;
      this.maxMarks = maxMarks;
  }
  public String toSting(){
      return "\nSubject ID:"+subID+"\nName : "+name+"\nMarks Obtained : "+ marksObtain;
  }
}

public class Day66 {
  public static void main(String[] args) {
     // Rectangle r = new Rectangle(5,10);
    //  System.out.println(r.Rectangle(5));
    Subject subs[]=new Subject[3];
    subs[0]=new Subject("s101","DS",100);
    subs[0]=new Subject("s102","Algorithm",100);
    subs[0]=new Subject("s103","OS",100);
    for(Subject s:subs)
    System.out.println(s);
  }
}
