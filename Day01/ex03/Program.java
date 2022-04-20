package Day01.ex03;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("Marina", 400);
        User user2 = new User("Dmitri", 500);

        Transaction transaction1 = new Transaction(user1, user2, 200, Transaction.Category.DEBITS);
        Transaction transaction2 = new Transaction(user1, user2, -100, Transaction.Category.CREDITS);
        Transaction transaction3 = new Transaction(user2, user1, 300, Transaction.Category.DEBITS);
        Transaction transaction4 = new Transaction(user2, user1, -150, Transaction.Category.CREDITS);

        TransactionsLinkedList list = new TransactionsLinkedList();
        list.addTransaction(transaction1);
        list.addTransaction(transaction2);

        list.removeTransaction(transaction1.getID());
        list.printTransaction();

        Transaction[] array = list.transformInArray();

        for (int i = 0; i < list.getCount(); i++){
            array[i].printInfo();
        }

        list.removeTransaction(UUID.randomUUID());

    }
}