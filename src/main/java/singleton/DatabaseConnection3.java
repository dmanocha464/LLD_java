package singleton;

public class DatabaseConnection3 {
    private static DatabaseConnection3 databaseConnection3 = null;
    private DatabaseConnection3(String name) {}

    // this will work in a concurrent environment
    public static DatabaseConnection3 getInstance(String name) {
        if (databaseConnection3 == null) {      // T1, T2 // First check without a lock
            synchronized(DatabaseConnection3.class) { // T1, T2
                if (databaseConnection3 == null) { // Second check after a lock
                    databaseConnection3 = new DatabaseConnection3(name); // T1 T2
                }
            }
        }
        return databaseConnection3;
    }
}
