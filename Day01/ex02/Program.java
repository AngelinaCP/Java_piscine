package Day01.ex02;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("Vladimir", 400);
        User user2 = new User("Marina", 500);
        User user3 = new User("Maxim", 700);
        User user4 = new User("Daria", 600);
        User user5 = new User("Max", 600);
        User user6 = new User("Steven", 600);
        User user7 = new User("Gregory", 600);
        User user8 = new User("Masha", 600);
        User user9 = new User("Liza", 600);
        User user10 = new User("Andrew", 600);

        UsersArrayList userArray = new UsersArrayList();
        userArray.add_user(user1);
        userArray.add_user(user2);
        userArray.add_user(user3);
        userArray.add_user(user4);
        userArray.add_user(user5);
        userArray.add_user(user6);
        userArray.add_user(user7);
        userArray.add_user(user8);
        userArray.add_user(user9);
        userArray.add_user(user10);

        User user19 = new User("Liza", 600);
        User user20 = new User("Andrew", 600);
        userArray.add_user(user19);
        userArray.add_user(user20);
        user19.printInfo();
        user20.printInfo();

        User user11 = userArray.getUserByID(user1.getID());
        user11.printInfo();
        User user12 = userArray.getUserByIndex(2);
        user12.printInfo();

        userArray.printInfo();
        System.out.println("Number of users: " + userArray.getNumUsers());

//        userArray.getUserByID(900);
//        userArray.getUserByIndex(500);
    }
}