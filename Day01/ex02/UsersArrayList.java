package Day01.ex02;

public class UsersArrayList implements UserList {

    private final int max_size = 10;
    private User[] users = new User[max_size];
    private Integer array_size = max_size;
    private Integer count = 0;

    @Override
    public void add_user(User user) {
        if (this.count == this.array_size) {
            User[] newUsers = new User[max_size * 2];
            for (int i = 0; i < this.array_size; i++) {
                newUsers[i] = this.users[i];
            }
            this.array_size *= 2;
            this.users = newUsers;
            newUsers[count] = user;
            count++;
        }
        else {
            this.users[count] = user;
            count++;
        }
    }

    @Override
    public User getUserByID(int ID) {
        for (int i = 0; i < count; i++) {
            if (this.users[i].getID() == ID) {
                return this.users[i];
            }
        }
        throw new UserException("User not found");
    }

    @Override
    public User getUserByIndex(int index){
        for (int i = 0; i < count; i++) {
            if (index <= count && index > 0) {
                return this.users[index];
            }
        }
        throw new UserException("User not found");
    }
    @Override
    public Integer getNumUsers(){
        return this.count;
    }

    public void printInfo() {
        for (int i = 0; i < count; i++) {
            System.out.print("ID: " + users[i].getID() + ", Name: " + users[i].getName());
            System.out.println(", Balance: " + users[i].getBalance());
        }
    }
}