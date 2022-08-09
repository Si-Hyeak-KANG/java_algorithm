package test.BJ.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TastingWine_2156 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        int[] memo = new int[n+1];

        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        memo[1] = arr[1];

        if(n > 1) {
            memo[2] = arr[1] + arr[2];
        }

        for(int i = 3; i <= n; i++) {
            memo[i] =
                    //arr[i]를 선택하지 않는 경우
                    Math.max(memo[i-1],
                            //arr[i]를 선택하는 경우
                            Math.max(memo[i-2] + arr[i],
                                    memo[i-3] + arr[i-1] + arr[i]
                            ));
        }

        System.out.println(memo[n]);
    }
}
