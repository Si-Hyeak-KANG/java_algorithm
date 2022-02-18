package test.BJ.recursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial_10872 {

    static int f(int N) {

        if(N==0)
            return 1;
        else
            return N * f(N-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = f(N);
        System.out.println(result);
    }
}
