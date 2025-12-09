//Group5
//inheritence for assignment file, making name variable
public abstract class SchoolItem {
    protected String name;

    public SchoolItem(String name) {
        this.name = name;
    }

    public abstract void printInfo();

    public String getName() {
        return name;
    }
}
