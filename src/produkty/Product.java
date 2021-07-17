package produkty;

/**
 * Klasa Product odpowiada towarowi sprzedawanemu w sklepie
 */
public class Product {
    private String nazwa;
    private double cena;
    private String kategoria;

    /**
     * Podstawowy konstruktor
     * @param nazwa
     * @param cena
     * @param kategoria
     */
    Product(String nazwa, double cena, String kategoria) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
    }

    public String getKategoria() {
        return kategoria;
    }
    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
    public String getNazwa() {
        return nazwa;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
}
