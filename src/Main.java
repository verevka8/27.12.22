import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(-1);
        thread1.start();
        thread2.start();
        Thread.sleep(500);

    }
}

class MyThread extends Thread {
    Bank b = new Bank();
    private int sign;
    private int value;
    public boolean flag = true;
    MyThread(int sign) {
        this.sign = sign;
    }
    @Override
    public void run() {
        while (true) {
            value = ThreadLocalRandom.current().nextInt(0,2000+1);
            b.set_balance(sign * value);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


