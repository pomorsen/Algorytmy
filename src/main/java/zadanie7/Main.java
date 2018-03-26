package zadanie7;

/**
 * Created by ppomorsk on 26/03/2018.
 */
public class Main {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println("FIBONACCI");
        for(int i = 1 ; i<10;i++){
            System.out.println(i + ":" + f.Fibonacci(i));
        }

        Silnia s = new Silnia();
        System.out.println("SILNIA");
        for(int i = 1 ; i<10;i++){
            System.out.println(i + ":" +s.Silnia(i));
        }


    }

}
