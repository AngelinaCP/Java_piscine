package Day01.ex01;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("Stephan", 500);
        User user2 = new User("Elena", 600);
        User user3 = new User("Andrew", 700);

        user1.printInfo();
        user2.printInfo();
        user3.printInfo();

        System.out.println(UserIdsGenerator.getID());

    }
}