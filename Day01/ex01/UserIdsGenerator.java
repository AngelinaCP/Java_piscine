package Day01.ex01;

public class UserIdsGenerator {
    private static UserIdsGenerator object;
    private static int ID;

    public static UserIdsGenerator getInstance() {
        if (object == null) {
            object = new UserIdsGenerator();
        }
        return object;
    }

    public static int generateId() {
        return ++ID;
    }

    public static int getID() {
        return ID;
    }
}