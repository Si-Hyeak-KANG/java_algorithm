package test.BJ.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.max;

public class TastingWine_2156 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        // 저장위치의 혼란이 오지 않도록, 인덱스 0번을 더미데이터로 활용
        int[] wine = new int[N+1];
        int[] dp = new int[N+1];

        for (int i = 1; i <= N; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = wine[1]; // 포도주가 한 잔 있을 때

        // 런타임 에러 방지
        if (N >= 2) {
            dp[2] = dp[1] + wine[2]; // 포도주가 두 잔 있을 때
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = max(
                    dp[i - 1], max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i]));
        }

        System.out.println(dp[N]);
    }
}


