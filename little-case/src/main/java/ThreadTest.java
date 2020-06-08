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
    /**
     * t1  1
     * t2  2
     * t1  3
     * t2  4
     * t1  5
     * t2  6
     * t1  7
     * t2  8
     * t1  9
     * t2  10
     * t1  11
     * t2  12
     * t1  13
     * t2  14
     * t1  15
     * t2  16
     * t1  17
     * t2  18
     * t1  19
     * t2  20
     * t1  21
     * t2  22
     * t1  23
     * t2  24
     * t1  25
     * t2  26
     * t1  27
     * t2  28
     * t1  29
     * t2  30
     * t1  31
     * t2  32
     * t1  33
     * t2  34
     * t1  35
     * t2  36
     * t1  37
     * t2  38
     * t1  39
     * t2  40
     * t1  41
     * t2  42
     * t1  43
     * t2  44
     * t1  45
     * t2  46
     * t1  47
     * t2  48
     * t1  49
     * t2  50
     * t1  51
     * t2  52
     * t1  53
     * t2  54
     * t1  55
     * t2  56
     * t1  57
     * t2  58
     * t1  59
     * t2  60
     * t1  61
     * t2  62
     * t1  63
     * t2  64
     * t1  65
     * t2  66
     * t1  67
     * t2  68
     * t1  69
     * t2  70
     * t1  71
     * t2  72
     * t1  73
     * t2  74
     * t1  75
     * t2  76
     * t1  77
     * t2  78
     * t1  79
     * t2  80
     * t1  81
     * t2  82
     * t1  83
     * t2  84
     * t1  85
     * t2  86
     * t1  87
     * t2  88
     * t1  89
     * t2  90
     * t1  91
     * t2  92
     * t1  93
     * t2  94
     * t1  95
     * t2  96
     * t1  97
     * t2  98
     * t1  99
     * t2  100
     * */
}