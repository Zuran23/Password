//Group5
public class Assignment extends SchoolItem {

    private double points;
    private int weight;

    public Assignment(String name, double points, int weight) {
        super(name);
        this.points = points;
        this.weight = weight;
    }

    @Override
    public void printInfo() {
        System.out.println("Assignment: " + name +
                " | Points: " + points +
                " | Weight: " + weight);
    }

    public double getPoints() { return points; }
    public int getWeight() { return weight; }
}
