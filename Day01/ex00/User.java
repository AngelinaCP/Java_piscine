package Day01.ex00;
import java.util.*;

public class User {

    private Integer ID;
    private String name;
    private Integer balance;

    public User() {

    }

    public User(Integer ID, String name, Integer balance) {
        this.name = name;
        this.ID = ID;
        if (balance > 0) {
            this.balance = balance;
        }
        else {
            this.balance = 0;
        }
    }

    public void printInfo() {
        System.out.println("User ID: " + this.ID + ", Name: " + this.name + ", Balance: " + this.balance);
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(Integer balance) {
        if (balance > 0) {
            this.balance = balance;
        }
        else {
            this.balance = 0;
        }
    }
    int getID() {
        return this.ID;
    }
    String getName() {
        return this.name;
    }
    long getBalance() {
        return this.balance;
    }
}