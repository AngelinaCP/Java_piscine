package Day03.ex00;

public class PrintThread extends Thread {

    private String message;
    private Integer count;
    PrintThread(String message, Integer count) {
        this.message = message;
        this.count = count;
    }

    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println(message);
        }
    }
}