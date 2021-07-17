package produkty;

import java.util.ArrayList;

public class ProgramProdukty {
    public static void main(String[] args) {
        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(new Produkt("Jabłko", 1.23));
        produkty.add(new Produkt("Herbata", 10.5));
        double wartość = 0;
        for (Produkt p : produkty) {
            wartość = wartość + p.cena;
            System.out.println(p.nazwa + " " + p.cena);
        }
    }
}
