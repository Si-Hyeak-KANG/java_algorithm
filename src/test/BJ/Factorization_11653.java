package test.BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;

public class Factorization_11653 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // sqrt(X) => X의 양의 제곱근 반환
        for(int i=2; i <= sqrt(N); i++) {

            while(N % i ==0) {
                sb.append(i).append('\n');
                N /= i;
            }
        }
        if (N != 1) {
            sb.append(N);
        }
        System.out.println(sb);
    }
}
