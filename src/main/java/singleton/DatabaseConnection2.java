package singleton;

public class DatabaseConnection2 {
    private static DatabaseConnection2 databaseConnection2 = new DatabaseConnection2();

    private DatabaseConnection2() {}

    // Not going to work in a concurrent environment
    public static DatabaseConnection2 getInstance() {
        return databaseConnection2;
    }
}
