package ab;

 class Singltone {
    // Static variable to hold a single instance of the class
    private static Singltone instance;

    // Private constructor to prevent instantiation
    private Singltone() {}

    // Public method to provide access to the instance
    public static Singltone getInstance() {
        if (instance == null) {
            instance = new Singltone(); // Create instance if it doesn't exist
        }
        return instance;
    }

    // Method to demonstrate instance behavior
    public void showMessage() {
        System.out.println("Instance ID: " + this.hashCode());
    }
}

public class MainSingleton {
    public static void main(String[] args) {
        // Get the Singleton instance multiple times
    	Singltone obj1 = Singltone.getInstance();
    	Singltone obj2 = Singltone.getInstance();

        // Display the instance IDs
        obj1.showMessage(); // Prints the hash code of the instance
        obj2.showMessage(); // Same hash code as obj1

        // Compare the two instances
//        if (obj1 == obj2) {
//            System.out.println("Both references point to the same Singleton instance.");
//        } else {
//            System.out.println("The references point to different instances.");
//        }
        System.out.println("Both references point to the same Singleton instance.");
    }
}
