
public class GradeBook {

    private Assignment[] assignments = new Assignment[100];
    private int count = 0;

    // static variable
    public static int totalAssignmentsAdded = 0;

    // static method
    public static void printTotalAssignments() {
        System.out.println("Total assignments added: " + totalAssignmentsAdded);
    }

    // Method overloading
    public void addAssignment(String name, double points, int weight) {
        assignments[count] = new Assignment(name, points, weight);
        count++;
        totalAssignmentsAdded++;
    }

    // Overloaded version (default weight = 10)
    public void addAssignment(String name, double points) {
        addAssignment(name, points, 10);
    }

    public double getTotalPoints() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += assignments[i].getPoints();
        }
        return total;
    }

    public int getTotalWeight() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += assignments[i].getWeight();
        }
        return sum;
    }

    public double getWeightedGrade() {
        if (count == 0) return 0;

        // Math class method used
        double raw = (getTotalPoints() / getTotalWeight()) * 100;
        return Math.round(raw * 100) / 100.0; // round to 2 decimals
    }

    public String getLetterGrade() {
        double grade = getWeightedGrade();

        // conditional operator
        return (grade >= 90) ? "A" :
                (grade >= 80) ? "B" :
                        (grade >= 70) ? "C" :
                                (grade >= 60) ? "D" : "E";
    }
}
