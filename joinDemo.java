class Mythread extends Thread{
  public static Thread obj;
  public void run()
  {
    try{
      obj.join();
    } catch(InterruptedException e){
      e.printStackTrace();
    }
    for(int i = 0; i<10 ; i++){
      System.out.println("in Mythred");
    }
  }
}
public class joinDemo{
  public static void main(String[] args){
    Mythread.obj = Thread.currentThread();
    Mythread t1 = new Mythread();
    t1.start();
    for(int i = 0; i<10 ; i++){
      System.out.println("in main thread");
    }
  }
}
