package Day03.ex01;

public class Consumer extends Thread{

    private String message;
    private Integer count;
    private final Type type;
    private final static OneThread thread = new OneThread();

    Consumer(String message, Integer count, Type type) {
        this.message = message;
        this.count = count;
        this.type = type;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            try {
                thread.print(message, this.type);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}