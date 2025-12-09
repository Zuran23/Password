//Group5
public class GradeBook {

    private Assignment[] assignments = new Assignment[100];
    private int count = 0;

    public static int totalAssignmentsAdded = 0;

    public static void printTotalAssignments() {
        System.out.println("Total assignments added: " + totalAssignmentsAdded);
    }

    public void addAssignment(String name, double points, int weight) {
        assignments[count] = new Assignment(name, points, weight);
        count++;
        totalAssignmentsAdded++;
    }
//All the assignment information
    
    public void addAssignment(String name, double points) {
        addAssignment(name, points, 10);
    }

    //A boolean for if 1 is chosen before 2. 
    public boolean hasNoAssignments() {
        return count == 0;
    }

    //It will calculate the total points of all assignments
    public double getTotalPoints() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += assignments[i].getPoints();
        }
        return total;
    }

    //To calculate the total weight of all the assignments
    public int getTotalWeight() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += assignments[i].getWeight();
        }
        return sum;
    }

    //The weighted grade after getting the point and the weight for each of these assignments
    public double getWeightedGrade() {
        if (count == 0) return 0;

        double raw = (getTotalPoints() / getTotalWeight()) * 100;
        return Math.round(raw * 100) / 100.0;
    }

    //It will check the number and match the letter to it. 
    public String getLetterGrade() {
        double grade = getWeightedGrade();

        return (grade >= 90) ? "A" :
                (grade >= 80) ? "B" :
                        (grade >= 70) ? "C" :
                                (grade >= 60) ? "D" : "E";
    }
}
