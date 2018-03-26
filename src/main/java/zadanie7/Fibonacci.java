package zadanie7;

/**
 * Created by ppomorsk on 26/03/2018.
 */
public class Fibonacci {
    public Fibonacci() {
    }

    public int Fibonacci(int fib) {
        if (fib == 1 || fib == 2) {
            return 1;
        } else {
            return Fibonacci(fib - 1) + Fibonacci(fib - 2);
        }
    }

}
