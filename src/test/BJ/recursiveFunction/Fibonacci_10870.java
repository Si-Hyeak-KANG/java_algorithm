package test.BJ.recursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci_10870 {

    static int f(int n) {
        if (n == 1) {
            return 1;
        } else if(n == 0) {
            return 0;
        }
        return f(n-1) + f(n-2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = f(n);
        System.out.println(result);
    }
}
