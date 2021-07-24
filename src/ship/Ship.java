package ship;

public class Ship {
    private static final int MAXSIZE = 1000;
    private String name;
    private double capacity;
    private Cargo[] hold;
    private int count;

    public double getCurrentCargoWeight() {
        return currentCargoWeight;
    }

    private double currentCargoWeight;

    public Ship(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
        count = 0;
        hold = new Cargo[MAXSIZE];
        currentCargoWeight = 0;
    }
    public boolean add(Cargo cargo)  {
        if (cargo.getWeight() + currentCargoWeight <= capacity) {
            hold[count++] = cargo;
            currentCargoWeight += cargo.getWeight();
            return true;
        }
        else
            return false;
    }
    public Cargo[] getAllCargos() {
        Cargo[] c = new Cargo[count];
        for(int i = 0; i < count; i++)
            c[i] = hold[i];
        return c;
    }

    public boolean remove(Cargo cargo) {
        int nr = 0;
        while (nr < count)
            if (hold[nr] == cargo) {
                break;
            }
            else
                nr++;

        if (nr < count - 1) {
            currentCargoWeight -= cargo.getWeight();
            for (int i = nr; i < count; i++)
                hold[i] = hold[i + 1];
            count--;
            return true;
        }
        else
            return false;
    }
    public void empty() {
        count = 0;
        currentCargoWeight = 0;
    }
}
