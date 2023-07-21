import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WelcomeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();

        // Print welcome message
        System.out.println("Welcome, " + name + "!");

        // Option a) Print current date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateAndTime = dateFormat.format(new Date());
        System.out.println("Current Date and Time: " + currentDateAndTime);

        // Option b) Print welcome message with date and time
        System.out.println("Welcome, " + name + "!");
        System.out.println("Current Date and Time: " + currentDateAndTime);
    }
}