package UnitFour;

class ThreadRunnable implements Runnable {

    private  int num;

    ThreadRunnable(int num){
    this.num = num;
}
    @Override
    public void run() {
        System.out.println("This Thread Number " + num+" is by Runnable interface  ");
    }
}

public class   MyThreadByRunnable {
    public static void main(String[] args) {
        ThreadRunnable th1 = new ThreadRunnable(1);
        ThreadRunnable th2 = new ThreadRunnable(2);
        Thread thread = new Thread(th1);
        Thread thread2 = new Thread(th2);
        thread.start();
        thread2.start();
        th1.run();
    }
}