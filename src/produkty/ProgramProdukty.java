package produkty;

import java.util.ArrayList;

public class ProgramProdukty {
    public static void main(String[] args) {
        // w kolekcji 'produkty' zapamiętujemy kupione w sklepie towary
        ArrayList<Product> produkty = new ArrayList<>();
        produkty.add(new Product("Jabłko", 1.23, "Owoce"));
        produkty.add(new Product("Herbata", 10.5, "Inne"));
        produkty.add((new Product("Pręga wołowa", 37.6, "Mięso")));
        Product p4 = new Product("Schab bez kości", 14.2, "Mięso");
        produkty.add(p4);
        // obliczenie wartości zakupów
        double wartość = 0;
        for (Product p : produkty) {
            wartość = wartość + p.getCena();
            System.out.format("%20s %6.2f zł %n", p.getNazwa() , p.getCena());
        }
        System.out.println("Liczba kupionych produktów: "  + produkty.size());
        System.out.println("Suma wartości produktów wynosi: " + wartość);
    }
}
