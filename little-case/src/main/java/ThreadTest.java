import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
        Thread t1, t2;
        t1 = new Thread(new Runnable() {
            public void run() {
                synchronized (atomicInteger) {
                    while (atomicInteger.getAndIncrement() < 100) {
                        atomicInteger.notifyAll();
                        System.out.println("t1  " + atomicInteger.intValue());
                        try {
                            atomicInteger.wait();
                        } catch (InterruptedException e) {

                        }
                    }
                }
            }
        });
        t2 = new Thread(new Runnable() {
            public void run() {
                synchronized (atomicInteger) {
                    while (atomicInteger.getAndIncrement() < 100) {
                        atomicInteger.notifyAll();
                        System.out.println("t2  " + atomicInteger.intValue());
                        try {
                            atomicInteger.wait();
                        } catch (InterruptedException e) {

                        }
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}