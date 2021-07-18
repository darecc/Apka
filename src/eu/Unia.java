package eu;

public class Unia {
    public static void main(String[] args) {
        double pkb = 16;
        double emisjaCO2 = pkb * 0.01;
        int rok = 2021;
        do {
            pkb = pkb * 1.03;
            rok++;
        } while (rok <= 2040);
        System.out.println("PKB = " + pkb);
        System.out.println("Emisja CO2 = " + emisjaCO2);
        emisjaCO2 = pkb * 0.01;
        System.out.println("Emisja CO2 zredukowana o 55% " + emisjaCO2 * 0.55);
        do {
            pkb = pkb * 1.03;
            rok++;
        } while (rok <= 2080);
        System.out.println("PKB w 2080 = " + pkb);
        System.out.println("Emisja CO2 = " + emisjaCO2);
        emisjaCO2 = pkb * 0.01;
        System.out.println("Emisja CO2 zredukowana o 80% " + emisjaCO2 * 0.2);
    }
}
