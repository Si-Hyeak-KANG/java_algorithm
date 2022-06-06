package test.BJ.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoordinateSort_11650 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        // 테스트 수 만큼 입력한 좌표를 배열에 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        br.close();

        for (int i = 0; i < arr[0].length; i++) {

            int count = 0;

            while(count < arr.length-1) {

                for (int j = 0; j < arr.length - 1 - count; j++) {

                    int point = arr[j][i];

                    if (arr[j][i] > arr[j + 1][i]) {
                        arr[j][i] = arr[j + 1][i];
                        arr[j + 1][i] = point;
                    }
                }

                count++;
            }

        }

        for (int[] ints : arr) {
            sb.append(ints[0]).append(" ").append(ints[1]).append("\n");
        }

        System.out.println(sb);

    }
}
