package podstawy;

import java.util.Scanner;

public class RównanieKwadratowe {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Podaj a");
        double a = skan.nextDouble();
        System.out.println("Podaj b");
        double b = skan.nextDouble();
        System.out.println("Podaj c");
        double c = skan.nextDouble();
        // teraz obliczenia
        double delta = b*b - 4*a*c;
        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta))/(2*a);
            double x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("Pierwiastki = " + x1 + " ... " + x2);
        }
        else
            if (delta == 0) {
                double x0 = -b /(2*a);
                System.out.println("Pierwiastek = " + x0);
            }
            else {
                System.out.println("Nie ma pierwiastków rzeczywistych");
            }
    }
}
