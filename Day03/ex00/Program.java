package Day03.ex00;

public class Program extends Thread {
    private String message;
    private static final String arg = "--count=";
    private static final String error = "Error: bad argument";
    private static final String error2 = "Error: failed to join";

    public static void main(String[] args) {

        if (args.length != 1 || !args[0].startsWith(arg)) {
            System.err.println(error);
            System.exit(-1);
        }

        String str = args[0].replaceAll(arg, "");
        Integer num = 0;
        try {
            num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.err.println(error);
            System.exit(-1);
        }
        PrintThread thread1 = new PrintThread("EGG", num);
        PrintThread thread2 = new PrintThread("HEN", num);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            System.err.println(error2);
            System.exit(-1);
        }

        for (int i = 1; i <= num; i++) {
            System.out.println("HUMAN");
        }
    }
}
