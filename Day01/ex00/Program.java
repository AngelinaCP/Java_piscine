package Day01.ex00;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        User user1 = new User(1, "Stephan", 500);
        User user2 = new User(2, "Elena", 600);
        User user3 = new User();

        user1.printInfo();
        user2.printInfo();
        user3.setID(3);
        user3.setName("Andrew");
        user3.setBalance(650);
        user3.printInfo();

        Transaction transaction1 = new Transaction(user1, user2, -300, Transaction.Category.CREDITS);
        Transaction transaction2 = new Transaction(user2, user3, 300, Transaction.Category.DEBITS);

        transaction1.printInfo();
        transaction2.printInfo();
    }
}