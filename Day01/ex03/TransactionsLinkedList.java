package Day01.ex03;

import java.util.LinkedList;
import java.util.UUID;

public class TransactionsLinkedList implements TransactionListinterface {
    private Transaction head;
    private Transaction tail;
    private Integer count = 0;

    @Override
    public void addTransaction(Transaction newTransaction) {
        if (this.head == null) {
            this.head = newTransaction;
        } else {
            this.tail.setNext(newTransaction);
        }
        this.tail = newTransaction;
        count++;
    }

    @Override
    public void removeTransaction(UUID id) {
        Transaction temp;
        Transaction prev;

        if (this.head != null) {
            temp = this.head.getNext();
            prev = this.head;

            if (prev.getID() == id) {
                this.head = temp;
                count--;
                return;
            }

            while (temp != null) {
                if (temp.getID() == id) {
                    prev.setNext(temp.getNext());
                    count--;
                    return;
                }
                prev = prev.getNext();
                temp = prev.getNext();
            }
        }
        throw new TransactionException("Transaction not found");
    }

    @Override
    public Transaction[] transformInArray() {
        Transaction[] array = new Transaction[this.count];
        Transaction temp = this.head;
        int i = 0;

        while (temp != null) {
            array[i] = temp;
            temp = temp.getNext();
        }
        return array;
    }

    public void printTransaction() {
        Transaction temp;
        temp = this.head;

        while (temp != null) {
            temp.printInfo();
            temp = temp.getNext();
        }
    }

    public Integer getCount() {
        return count;
    }

}