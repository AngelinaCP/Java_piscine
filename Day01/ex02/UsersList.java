package Day01.ex02;

interface UserList {
    void add_user(User user);
    User getUserByID();
    User getUserByIndex();
    Integer getNumUsers();
}