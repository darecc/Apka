package ship;

public class Program {
    public static void main(String[] args) {
        Ship ship = new Ship("Sołdek", 20000);
        ship.add(new Cargo("wyngiel", 100));
        ship.add(new Cargo("kalosze", 40));
        ship.add(new Cargo("trampki", 30));
        ship.add(new Cargo("marchewka", 60));
        ship.add(new Cargo("złom", 2000));
        Cargo[] cargo = ship.getAllCargos();
        System.out.println("=== CARGO ===");
        for(Cargo c : cargo)
            System.out.println(c.toString());
        System.out.println("Current cargo weight: " + ship.getCurrentCargoWeight());
        ship.remove(cargo[2]);
        cargo = ship.getAllCargos();
        System.out.println("=== CARGO ===");
        for(Cargo c : cargo)
            System.out.println(c.toString());
        System.out.println("Current cargo weight: " + ship.getCurrentCargoWeight());
    }
}
