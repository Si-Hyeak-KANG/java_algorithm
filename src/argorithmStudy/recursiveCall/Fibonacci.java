package argorithmStudy.recursiveCall;

public class Fibonacci {

    public int fibonacciFunc(int n) {
        /*
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }*/

        if(n <= 1) {
            return n;
        }

        return this.fibonacciFunc(n-2) + this.fibonacciFunc(n-1);
    }

    public static void main(String[] args) {

        Fibonacci fibo = new Fibonacci();

        System.out.println(fibo.fibonacciFunc(0));
        System.out.println(fibo.fibonacciFunc(1));
        System.out.println(fibo.fibonacciFunc(2));
        System.out.println(fibo.fibonacciFunc(3));
        System.out.println(fibo.fibonacciFunc(4));

    }
}
