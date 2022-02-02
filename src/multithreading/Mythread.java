package multithreading;

// Create two threads, one thread to display all even numbers between 1 and
//        20, another to display odd numbers between 1 and 20. Note: Display all even numbers followed by odd numbers.


public class Mythread {
    public static void main(String[] args) throws InterruptedException {
        Runnable1 r1 = new Runnable1();
        Thread t1 = new Thread(r1);
        t1.start();

        Runnable2 r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();
        t2.join();//used for first complete runnable1 then run runnable2
    }
}

class Runnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            if((i & 1)!= 1)
                System.out.println(i);
        }
    }
}

class Runnable2 implements Runnable{
    public void run(){
        for (int i = 0; i <=10 ; i++) {
            if((i&1)==1)
                System.out.println(i);
        }
    }
}