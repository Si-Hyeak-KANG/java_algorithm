package test.BJ.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 덩치
 */
public class Bulk_7568 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] humanList = new int[N][2];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {

            humanList[i][0] = Integer.parseInt(st.nextToken());
            humanList[i][1] = Integer.parseInt(st.nextToken());
        }

        // 무게로 정렬
        Arrays.sort(humanList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for(int i = 0; i < N; i++) {

            humanList[i][0] = i;
        }

        // 키로 정렬
        Arrays.sort(humanList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        for(int i = 0; i < N; i++) {

            humanList[i][1] = i;
        }





    }
}
