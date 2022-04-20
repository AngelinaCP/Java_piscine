package Day01.ex02;

public class UsersArrayList implements UserList{

    int max_size = 10;
    private User[] users = new User[max_size];
    private Integer array_size = max_size;
    private Integer count;

    @Override
    public void add_user(User user) {
        if (this.count == this.array_size) {
            User users[] = new User[array_size * 2];
            for (int i = 0; i < this.array_size; i++) {
                users[i] = this.users[i];
            }
            this.array_size *= 2;
//            this.users = users;
            this.users[count] = user;
            count++;
        }
        else {
            this.users[count] = user;
        }
    }
    @Override
    public User getUserByID(int ID){
        for (int i = 0; i < count; i++) {
            if (this.users[i].getID() == ID) {
                return this.users[i];
            }
        }
        //throw exception//
    }
    @Override
    public User getUserByIndex(int index){
        for (int i = 0; i < count; i++) {
            if (index <= count && index > 0) {
                return this.users[index];
            }
        }
        //throw exception//
    }
    @Override
    public Integer getNumUsers(){
        return this.count;
    }
}