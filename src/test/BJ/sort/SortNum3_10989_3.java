package test.BJ.sort;

import java.io.*;

/**
 * point
 * 1) 버블정렬
 *
 * 수행시간 -> 시관 초과
 */
public class SortNum3_10989_3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        // 테스트 수만큼 입력 받은 값 배열에 넣기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        // 버블 정렬
        for (int i = 0; i < arr.length - 1; i++) { // outside for

            // 검색 대상 인덱스 항상 처음부터 시작
            int curr = 0;

            for (int j = 1; j < arr.length - i; j++) { // inner for

                if (arr[curr] > arr[j]) {
                    int temp = arr[curr];
                    arr[curr] = arr[j];
                    arr[j] = temp;
                }

                curr = j;
            }
        }

        // 출력 for 문
        for (int i : arr) {
            bw.write(i);
        }

        bw.close();
    }
}
