class Phone{
    void call(){
        System.out.println("Phone Call");
    }
    void sms(){
        System.out.println("Phone Sending SMS");
    }
}
interface Camera{
    void click();
    void record();
}
interface MusicPlayer{
    void play();
    void stop();
}
 class SmartPhone extends Phone implements Camera, MusicPlayer{
   public void VideoCall(){
    System.out.println("Smart Phone video calling");
   } 
   public void click(){
    System.out.println("Smart Phone clicking Photo");
   } 
   public void record(){
    System.out.println("Smart Phone recording video");
   } 
   public void play(){
    System.out.println("Smart Phone playing music");
   } 
   public void Pause(){
    System.out.println("Smart Phone Pausing music");
   } 
   public void stop(){
    System.out.println("Smart Phone stoping music");
   } 
}
public class Day58 {
    public static void main(String[] args) {
         SmartPhone sp = new SmartPhone(); 
            sp.call();
            sp.sms();
            sp.Pause();
            sp.click();
            sp.play();
            sp.VideoCall();
            sp.stop();
            sp.record();
           
    
}}
