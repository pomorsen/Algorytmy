package zadanie3;

/**
 * Algorytm ma obliczać długość boku kwadratu o polu P.
 * 1. Przedstaw opis słowny problemu
 * 2. Przedstaw schemat blokowy
 * 3. Zaimplementuj algorytm.
 * Rozwinięcie:
 * 2. Napisz funkcję, która obliczy bok trójkąta równobocznego na podstawie pola.
 * 3. Napisz funkcję, która obliczy promień koła.
 * 4. W `main` użyj każdej funkcji.
 * 5. W `main` pobierz od użytkownika jaką funkcję ma wywołać oraz pole. Następnie wywołaj odpowiednią funkcję i wyświetl odpowiednią informację (bok lub promień)
 */
public class DlugoscBoku {
    public static void main(String[] args) {
        double bok = obliczDlugoscBokuKwadratuNaPodstawiePola(17);
        System.out.println(bok);
    }

    private static double obliczDlugoscBokuKwadratuNaPodstawiePola(double pole) {
        double a = Math.sqrt(pole);
        return a;
    }
}
