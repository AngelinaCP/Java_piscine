package Day01.ex03;
import java.util.*;


public class Transaction {
    private UUID ID;
    private User recipient;
    private User sender;
    private Integer amount;
    private Transaction next;
    enum Category {
        DEBITS,
        CREDITS
    }
    private Category category;

    public Transaction(User recipient, User sender, Integer amount, Category category) {
        this.ID = UUID.randomUUID();
        this.recipient = recipient;
        this.sender = sender;
        if (amount > 0 && Category.CREDITS == this.category) {
            this.amount = 0;
        }
        else if (amount < 0 && Category.DEBITS == this.category) {
            this.amount = 0;
        }
        else {
            this.amount = amount;
        }
        this.category = category;

    }

    public void printInfo() {
        System.out.println("Recipient: " + this.recipient.getName() + ", Sender: " + this.sender.getName());
        System.out.println("Category: " + this.category + ", Amount: " + amount);
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        if (amount > 0 && Category.CREDITS == this.category) {
            this.amount = 0;
        }
        else if (amount < 0 && Category.DEBITS == this.category) {
            this.amount = 0;
        }
        else {
            this.amount = amount;
        }
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setNext(Transaction next) {
        this.next = next;
    }

    public Transaction getNext() {
        return next;
    }

}
