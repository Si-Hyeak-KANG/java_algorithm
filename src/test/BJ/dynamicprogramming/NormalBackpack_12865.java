package test.BJ.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N : 물품의 수
 * K : 버틸 수 있는 무게
 * W : 물건의 무게
 * V : 물건의 가치
 *
 * 6 13, 4 8, 3 6, 5 12
 *
 * Dynamic Problem(DP)
 * 쪼갤 수 없는 배낭 문제
 *
 * -> Top-down 방식
 */
public class NormalBackpack_12865 {

    static Integer[][] dpCase;
    static int[][] stuff;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 물품의 수
        int K = Integer.parseInt(st.nextToken()); // 버틸 수 있는 무게

        // 해결해야할 문제 NS(N,K)
        // 점화식 : NS(n,W) = MAX {
        //                          ( NS(n-1, W-W[n]) + val[n])
        //                          ( NS(n-1, W) + 0
        //                          0
        //                        }

        dpCase = new Integer[N][K+1];
        // stuff
        stuff = new int[N][2];

        for(int i = 0 ; i < stuff.length; i++) {
            st = new StringTokenizer(br.readLine());
            stuff[i][0] = Integer.parseInt(st.nextToken()); // w
            stuff[i][1] = Integer.parseInt(st.nextToken()); // v
        }

        System.out.println(ns(N-1,K));
    }

    public static int ns(int n, int k) {

        if(n < 0) {
            return 0;
        }

        int currWeight = stuff[n][0];
        int currValue = stuff[n][1];

        if(dpCase[n][k] == null) {

            if(currWeight > k) {

                dpCase[n][k] = ns(n-1, k);
            } else {

                dpCase[n][k] = Math.max(ns(n-1 , k), ns(n-1, k - currWeight) + currValue);
            }

        }
        return dpCase[n][k];
    }
}
