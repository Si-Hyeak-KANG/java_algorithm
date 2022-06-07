package test.BJ.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class CoordinateSort2_11650 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 좌표 개수
        int test = Integer.parseInt(br.readLine());
        int[][] arr = new int[test][2];

        // 입력한 좌표를 배열에 넣음
        for (int i = 0; i < test; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // Comparator 인터페이스 재정의
        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {

                // x 좌표가 같으면, y 좌표 기준으로 정렬
                if (o1[0] == o2[0]) {
                    return Integer.compare(o1[1], o2[1]);
                } else {
                    return Integer.compare(o1[0], o2[0]);
                }
            }

        });
        /* // 람다식 구현
        Arrays.sort(arr,(v1, v2) ->{

            if(v1[0] == v2[0]) {
                return v1[1] - v2[1];
            } else {
                return v1[0] - v2[0];
            }
        });
        */

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}
