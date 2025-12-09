//Group5
public class GradeBook {

    private Assignment[] assignments = new Assignment[100];
    private int count = 0;

    public static int totalAssignmentsAdded = 0;

    public static void printTotalAssignments() {
        System.out.println("Total assignments added: " + totalAssignmentsAdded);
    }
//count assignments
    public void addAssignment(String name, double points, int weight) {
        assignments[count] = new Assignment(name, points, weight);
        count++;
        totalAssignmentsAdded++;
    }

    public void addAssignment(String name, double points) {
        addAssignment(name, points, 10);
    }
//for option 1 error message
    public boolean hasNoAssignments() {
        return count == 0;
    }
//calculate total points earned across assignments
    public double getTotalPoints() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += assignments[i].getPoints();
        }
        return total;
    }
//calculate total points available across assignments
    public int getTotalWeight() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += assignments[i].getWeight();
        }
        return sum;
    }
//calculate total grade percentage across assignments
    public double getWeightedGrade() {
        if (count == 0) return 0;

        double raw = (getTotalPoints() / getTotalWeight()) * 100;
        return Math.round(raw * 100) / 100.0;
    }
//calculate letter grade based on percentage
    public String getLetterGrade() {
        double grade = getWeightedGrade();

        return (grade >= 90) ? "A" :
                (grade >= 80) ? "B" :
                        (grade >= 70) ? "C" :
                                (grade >= 60) ? "D" : "E";
    }
}
