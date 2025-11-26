//DONT DELETE THIS YET BUT ITS PROBABLY GOING TO BE DELETED LATER


public class GradeBookOLD {

    private AssignmentOLD[] assignments = new AssignmentOLD[100]; // max 100 assignments
    private int count = 0;

    public void addAssignment(String name, double points, int weight) {
        assignments[count] = new AssignmentOLD(name, points, weight);
        count++;
    }

    public double getTotalPoints() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += assignments[i].getPoints();
        }
        return total;
    }

    public int getTotalWeight() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += assignments[i].getWeight();
        }
        return total;
    }

    public double getWeightedGrade() {
        if (count == 0) return 0;
        return (getTotalPoints() / getTotalWeight()) * 100;
    }

    public String getLetterGrade() {
        double grade = getWeightedGrade();
        if (grade >= 90) return "A";
        if (grade >= 80) return "B";
        if (grade >= 70) return "C";
        if (grade >= 60) return "D";
        return "E";
    }
}
