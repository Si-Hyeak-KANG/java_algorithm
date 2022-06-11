package test.BJ.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 총 N종류 동전
 * 가치의 합 K
 * 이 때 필요한 동전 개수의 최솟값
 *
 * point
 * 1) 최적을 구하기 위해 입력받은 코인을 배열에 넣고 내림차순으로 정렬
 *
 * 수행시간 128ms
 */
public class Coin0_11047 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int coinNum = 0;

        Integer[] coin = new Integer[N];
        // 갖고있는 동전 입력
        for(int i = 0; i < coin.length; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(coin, Collections.reverseOrder());

        for(int i = 0; i < coin.length; i++) {
            if (K >= coin[i]) {
                coinNum += K / coin[i];
                K %= coin[i];
            }

            if(K == 0) {
                System.out.println(coinNum);
                return;
            }
        }

    }
}
