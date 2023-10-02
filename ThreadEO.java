class CheckEvenOdd{
    public static void checkEven(){
        for(int i=0;i<=10;i+=2){
           System.out.println("Even : "+i);
        }
    }
    public static void checkOdd(){
        for(int i=1;i<10;i+=2){
            System.out.println("Odd : "+i);
        }
    }
}

 class Thread1 extends Thread{
    public void  run(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CheckEvenOdd.checkEven();
    }
}
 class Thread2 extends Thread{
    public void  run(){
          try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CheckEvenOdd.checkOdd();
    }
}

public class ThreadEO{

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}

