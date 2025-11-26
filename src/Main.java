import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    // constant
    private static final int DEFAULT_WEIGHT = 10;

    public static void main(String[] args) {

        GradeBook gradeBook = new GradeBook();
        boolean loop = true;

        while (loop) {
            printMenu();
            int option = getIntInput("Choose an option: ");

            switch (option) {
                case 1:
                    displayCurrentGrade(gradeBook);
                    break;

                case 2:
                    handleAddAssignment(gradeBook);
                    break;

                case 0:
                    System.out.println("Exiting. Goodbye!");
                    GradeBook.printTotalAssignments(); // static method
                    loop = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.\n");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Welcome to the Student Grade Calculator!");
        System.out.println("0. Exit");
        System.out.println("1. Check your current grade");
        System.out.println("2. Enter a new assignment grade");
        System.out.println("-------------------------------------------------");
    }

    private static void handleAddAssignment(GradeBook gradeBook) {
        String name = getStringInput("Assignment name: ");

        // Use a String method (trim + uppercase)
        name = name.trim().toUpperCase();

        double grade = getDoubleInput("Assignment grade (pts): ");
        int weight = getIntInput("Assignment weight (pts): ");

        if (grade < 0 || weight <= 0) {
            System.out.println("Error: Invalid grade or weight.");
            return;
        }

        gradeBook.addAssignment(name, grade, weight);

        System.out.println("You added: " + name);
        displayRandomMessage();
        displayCurrentGrade(gradeBook);
    }

    private static void displayCurrentGrade(GradeBook gradeBook) {
        System.out.printf("Current grade: %.2f%% (%s)\n",
                gradeBook.getWeightedGrade(),
                gradeBook.getLetterGrade());

        System.out.println("-------------------------------------------------");
    }

    // Java library class: Random
    private static void displayRandomMessage() {
        String[] messages = {
                "Nice work!",
                "Keep it up!",
                "You're doing great!",
                "Awesome job!",
                "Way to go!"
        };

        Random rand = new Random();
        System.out.println(messages[rand.nextInt(messages.length)]);
    }

    private static String getStringInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    private static int getIntInput(String message) {
        System.out.print(message);
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    private static double getDoubleInput(String message) {
        System.out.print(message);
        double num = scanner.nextDouble();
        scanner.nextLine();
        return num;
    }
}
