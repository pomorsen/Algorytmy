package zadanie2;

/**
 * Algorytm ma wczytywać z klawiatury wartości dwóch liczb oraz wyświetlać w kolejnych liniach następujące wyniki:
 * 1. Wykorzystując TYLKO dodawanie pomnożyć pierwszą liczbę przez drugą.
 * 2. Wykorzystując TYLKO dodawanie spotęgować pierwszą liczbę przez drugą.
 * 1. Przedstaw opis słowny problemu
 * 2. Przedstaw schemat blokowy
 * 3. Zaimplementuj algorytm.
 */
public class MnozenieDodawaniem {
    public static void main(String[] args) {


        System.out.println(potegujDodawaniem(3,4));

    }

    private static int potegujDodawaniem(int podstawa, int potega) {
        int wynik = podstawa;
        for (int i = 1 ; i < potega; i++){
            wynik = pomnozDodawaniem(wynik,podstawa);
            System.out.println(wynik);
        }
        return wynik;
    }

    private static int pomnozDodawaniem(int a, int b) {
        int c = 0;
        for (int i = 1; i <= b; i++) {
            c += a;
        }
        return c;
    }


}
