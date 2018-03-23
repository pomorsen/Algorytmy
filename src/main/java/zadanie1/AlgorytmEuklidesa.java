package zadanie1;

import java.util.Scanner;

/**
 * Algorytm Euklidesa
 * Mając dane dwie liczby naturalne a i b znaleźć ich największy wspólny dzielnik.
 * <p>
 * 1. Przedstaw opis słowny problemu
 * 2. Przedstaw schemat blokowy
 * 3. Zaimplementuj algorytm.
 * <p>
 * Rozwinięcie:
 * 2. Pobierz dane od użytkownika.
 * 3. Jeżeli użytkownik wpisze ujemną liczbę wyświetl błąd.
 * 4. Pobieraj błędne dane dopóki użytkownik nie wpisze poprawnego wyniku.
 * 5. Zrób z tego grę:
 * - Komputer losuje dwie duże liczby (10000 < n < 50000)
 * - Użytkownik wpisuje NWD
 * - Komputer oblicza NWD, a następnie wyświetla czy użytkownik zgadł liczbę czy nie
 */
public class AlgorytmEuklidesa {
    public static void main(String[] args) {

        System.out.println("Sprawdzanie NWD dwoch liczb\n###############");
        Scanner input = new Scanner(System.in);

        System.out.printf("Podaj a: ");
        int a = input.nextInt();
        System.out.println("\nPodaj b: ");
        int b = input.nextInt();

        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Podane liczby muszą być dodatnie!");
        }

        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
            System.out.printf(".");
        }

        boolean bingo = false;
        int wynik;
        int i = 1;
        while (!bingo) {
            System.out.printf("\nNWD wynosi? ");
            wynik = input.nextInt();
            if (wynik == a) {
                bingo = true;
                System.out.println("Bingo! Zgadłeś za " + i + " razem!");
            } else if (wynik > a) {
                System.out.println("Za dużo!");
                i++;
            } else {
                System.out.println("Za mało!");
                i++;
            }
        }


        System.out.println("NWD: " + a);
    }
}
