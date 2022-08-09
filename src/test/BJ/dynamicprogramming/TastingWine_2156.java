package test.BJ.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.max;

public class TastingWine_2156 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0]; // 포도주가 한잔만 있을 때

        // 런타임 에러 방지
        if (N >= 2) {
            dp[1] = dp[0] + arr[1]; // 포도주가 두잔만 있을 때
        }

        if (N >= 3) {
            dp[2] = max(dp[1], max(dp[0] + arr[2], arr[1] + arr[2]));
        }

        for (int i = 3; i < N; i++) {
            dp[i] = max(dp[i - 1], max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));
        }


        System.out.println(dp[N - 1]);
    }
}


