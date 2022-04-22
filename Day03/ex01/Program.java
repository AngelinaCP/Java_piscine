package Day03.ex01;


enum Type {
    CONSUMER,
    PRODUCER
}
public class Program  {
    private static String message;
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

        Consumer consumer1 = new Consumer("EGG", num, Type.CONSUMER);
        Consumer consumer2 = new Consumer("HEN", num, Type.PRODUCER);
        consumer1.start();
        consumer2.start();
    }
}
