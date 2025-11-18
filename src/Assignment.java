public class Assignment {
    private String name;
    private double points;
    private int weight;

    public Assignment(String name, double points, int weight) {
        this.name = name;
        this.points = points;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPoints() {
        return points;
    }

    public int getWeight() {
        return weight;
    }
}
