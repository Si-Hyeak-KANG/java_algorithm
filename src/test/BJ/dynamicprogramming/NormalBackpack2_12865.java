package test.BJ.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NormalBackpack2_12865 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] w = new int[N + 1];
        int[] v = new int[N + 1];
        int[] dp = new int[K+1];

        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i<=N; i++) {

            for(int j = K; j-w[i] >= 0; j--) {
                dp[j] = Math.max(dp[j], dp[j-w[i]] + v[i]);
            }
        }

        System.out.println(dp[K]);
    }
}
