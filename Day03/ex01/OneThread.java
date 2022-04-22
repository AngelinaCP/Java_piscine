package Day03.ex01;

public class OneThread {

    private Integer lock = 1;

    public synchronized void print (String message, Type type) throws InterruptedException {
        if (type == Type.CONSUMER) {
            while (lock == 0) {
                wait();
            }
            lock = 0;
        }
        else {
            while (lock == 1) {
                wait();
            }
            lock = 1;
        }
        System.out.println(message);
        notify();
    }
}