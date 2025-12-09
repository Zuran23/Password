//Group5
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static final int DEFAULT_WEIGHT = 10;

    public static void main(String[] args) {

        GradeBook gradeBook = new GradeBook();
        boolean loop = true;

        while (loop) {
            printMenu();
            int option = getIntInput("Choose an option: ");

            switch (option) {
                    //This will display the grade of the class
                case 1:
                    displayCurrentGrade(gradeBook);
                    break;

                case 2:
                    //You add your assignment for the class
                    handleAddAssignment(gradeBook);
                    break;

                    //Exit the program
                case 0:
                    System.out.println("Exiting. Goodbye!");
                    GradeBook.printTotalAssignments();
                    loop = false;
                    break;

                    //If you chose any option beyond 0,1,2
                default:
                    System.out.println("Invalid option. Try again.");
                    System.out.println("--------------------------------------------");
            }
        }
    }

    //Display Menu
    private static void printMenu() {
        System.out.println("Welcome to the Student Grade Calculator!");
        System.out.println("0. Exit");
        System.out.println("1. Check your current grade");
        System.out.println("2. Enter a new assignment grade");
        System.out.println("--------------------------------------------");
    }

    private static void handleAddAssignment(GradeBook gradeBook) {
        String name = getStringInput("Assignment name: ");
        name = name.trim().toUpperCase();

        double grade = getDoubleInput("Assignment grade (pts): ");
        int weight = getIntInput("Assignment weight (pts): ");

        //Error check if you enter 0 or below for grade or the weight
        if (grade < 0 || weight <= 0) {
            System.out.println("Error: Invalid grade or weight.");
            return;
        }

        gradeBook.addAssignment(name, grade, weight);

        System.out.println("You added: " + name);
        displayRandomMessage();
        displayCurrentGrade(gradeBook);
    }

    //Error check if you chose 1 without adding any grades
    private static void displayCurrentGrade(GradeBook gradeBook) {
        if (gradeBook.hasNoAssignments()) {
            System.out.println("Invalid operation. No grades have yet been entered.");
            System.out.println("--------------------------------------------");
            return;
        }

        //Display Current Grade in the class
        System.out.printf("Current grade: %.2f%% (%s)",
                gradeBook.getWeightedGrade(),
                gradeBook.getLetterGrade());
        System.out.println(" ");
        System.out.println("--------------------------------------------");
    }

    //Random Messages of encouragement
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
