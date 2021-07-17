package produkty;

import java.util.ArrayList;

public class ProgramProdukty {
    public static void main(String[] args) {
        // w tablicy 'produkty' zapamiętujemy kupione w sklepie towary
        Product[] produkty = new Product[]{
                new Product("Jabłko", 1.23, "Owoce"),
                new Product("Herbata", 10.5, "Inne"),
                new Product("Pręga wołowa", 37.6, "Mięso"),
                new Product("Schab bez kości", 14.2, "Mięso"),
                new Product("Banan", 3.1, "Owoce")
        };
        // obliczenie wartości zakupów
        double wartość = 0;
        for (Product p : produkty) {
            wartość = wartość + p.getCena();
            System.out.format("%20s %6.2f zł %n", p.getNazwa() , p.getCena());
        }
        System.out.println("Liczba kupionych produktów: "  + produkty.length);
        System.out.println("Suma wartości produktów wynosi: " + wartość);
    }
}
