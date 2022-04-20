package Day01.ex02;

 interface UserList {
    void add_user(User user);
    User getUserByID(int ID);
    User getUserByIndex(int index);
    Integer getNumUsers();
}