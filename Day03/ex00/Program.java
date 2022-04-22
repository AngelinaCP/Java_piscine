package Day03.ex00;

public class Program extends Thread {
    private String message;
    private static final String arg = "--count=";
    private static final String error = "Error: bad argument";
    private static int num = 0;

    public static void main(String[] args) {

        if (args.length != 1 || !args[0].startsWith(arg)) {
            System.err.println(error);
            System.exit(-1);
        }

        String str = args[0].replaceAll(arg, "");

        try {
            num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.err.println(error);
            System.exit(-1);
        }
        Program thread1 = new Program();
        Program thread2 = new Program();

        thread1.message = "EGG";
        thread2.message = "HEN";
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            System.out.println("ERROR");
        }

        for (int i = 1; i <= num; i++) {
            System.out.println("HUMAN");
        }
    }

    public void run() {
        for (int i = 1; i <= num; i++) {
            System.out.println(message);
        }
    }
}