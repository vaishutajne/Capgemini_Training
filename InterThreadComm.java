class Book{
    String title;
    boolean isDone;
    Book(String tiltle){
        this.title=tiltle;
    }
    public String title(){
        return title;
    }
    public boolean isdone(){
        return isDone;
    }
    public void setTiltle(String title){
        this.title = title;
    }
    public void setDone(boolean isDone){
        this.isDone = isDone;
    }
}
class Writer implements Runnable{
    Book myBook;
    Writer(Book b){
        this.myBook=b;
    }
    @Override
    public void run(){
        synchronized(myBook){
            System.out.println("Author is writing the Book"+myBook.title());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            myBook.setDone(true);
            System.out.println("Book is Completed");
            System.out.println("Calling All Reader");
            myBook.notifyAll();
        }
    }
}
class Reader implements Runnable{
    Book myBook;
    Reader(Book b){
        this.myBook=b;
    }
    @Override
    
        public void run(){
        synchronized(myBook){
        synchronized(myBook){
            System.out.println(Thread.currentThread().getName()+" is waiting for a book");
            try{
                myBook.wait();
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName()+" is completed reading");
           
        }
    }
}
    }

public class InterThreadComm {
    public static void main(String[] args) {
        Book myBook = new Book("Java Programming");
        Reader r1 = new Reader(myBook);
        Reader r2 = new Reader(myBook);
        Thread t1 = new Thread(r1,"jiya");
        Thread t2 = new Thread(r2,"rita");
        t1.start();
        t2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        Writer bWriter = new Writer(myBook);
        Thread wThread = new Thread(bWriter);
        wThread.start();
    }
}
