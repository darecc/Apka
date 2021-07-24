package ship;

public class Cargo {
    private String name;

    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    private int weight;
    public Cargo(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return name + " : " + weight;
    }
}
