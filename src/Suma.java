import java.util.ArrayList;
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int a = skan.nextInt();
        int suma = 0;
        /*
        for(int i = 1; i <= a; i++)
            suma = suma + i;
        */
        int i = 1;
        do {
            suma = suma + i;
            i++;
        } while (i <= a);
        System.out.println("Suma = " + suma);
    }
}
