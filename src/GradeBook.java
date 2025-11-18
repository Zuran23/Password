import java.util.ArrayList;

public class GradeBook {
    private ArrayList<Assignment> assignments = new ArrayList<>();

    public void addAssignment(String name, double points, int weight) {
        assignments.add(new Assignment(name, points, weight));
    }

    public double getTotalPoints() {
        return assignments.stream().mapToDouble(Assignment::getPoints).sum();
    }

    public int getTotalWeight() {
        return assignments.stream().mapToInt(Assignment::getWeight).sum();
    }

    public double getWeightedGrade() {
        int totalWeight = getTotalWeight();
        if (totalWeight == 0) return 0;
        return (getTotalPoints() / totalWeight) * 100;
    }

    public String getLetterGrade() {
        double grade = getWeightedGrade();
        if (grade >= 90) return "A";
        else if (grade >= 80) return "B";
        else if (grade >= 70) return "C";
        else if (grade >= 60) return "D";
        else return "E";
    }
}
