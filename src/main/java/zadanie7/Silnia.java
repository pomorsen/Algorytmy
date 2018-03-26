package zadanie7;

/**
 * Created by ppomorsk on 26/03/2018.
 */
public class Silnia {
    public Silnia() {
    }

    public int Silnia(int sil) {
        if (sil == 1) {
            return 1;
        } else if (sil == 2) {
            return 2;
        } else {
            return sil * Silnia(sil - 1);
        }
    }
}

