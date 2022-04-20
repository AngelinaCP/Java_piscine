package Day01.ex02;

import Day01.ex01.UserIdsGenerator;

public class User {

    private Integer ID;
    private String name;
    private Integer balance;

    public User() {
        this.ID = UserIdsGenerator.getInstance().generateId();
    }
    public User(String name, Integer balance) {
        this.name = name;
        if (balance > 0) {
            this.balance = balance;
        }
        else {
            this.balance = 0;
        }
        this.ID = UserIdsGenerator.getInstance().generateId();
    }

    public void printInfo() {
        System.out.println("User ID: " + this.ID + ", Name: " + this.name + ", Balance: " + this.balance);
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