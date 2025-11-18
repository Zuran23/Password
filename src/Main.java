import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GradeBook gradeBook = new GradeBook();
        boolean loop = true;

        while (loop) {
            System.out.println("Welcome to the Student Grade Calculator!");
            System.out.println("0. Exit");
            System.out.println("1. Check your current grade");
            System.out.println("2. Enter a new assignment grade");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 2:
                    System.out.print("Assignment name: ");
                    String name = scanner.nextLine();

                    System.out.print("Assignment grade (pts.): ");
                    double grade = scanner.nextDouble();

                    System.out.print("Assignment weight (pts.): ");
                    int weight = scanner.nextInt();
                    scanner.nextLine();

                    if (grade < 0 || weight <= 0) {
                        System.out.println("Error: Invalid grade or weight.");
                        break;
                    }

                    gradeBook.addAssignment(name, grade, weight);

                    System.out.println("You added " + name + "!");
                    System.out.printf("Current grade: %.2f%% (%s)\n",
                            gradeBook.getWeightedGrade(),
                            gradeBook.getLetterGrade());
                    System.out.println("**************************************************");
                    break;

                case 1:
                    System.out.printf("Your current grade: %.2f%% (%s)\n",
                            gradeBook.getWeightedGrade(),
                            gradeBook.getLetterGrade());
                    System.out.println("**************************************************");
                    break;

                case 0:
                    System.out.println("Exiting. Goodbye!");
                    System.out.println("**************************************************");
                    loop = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
