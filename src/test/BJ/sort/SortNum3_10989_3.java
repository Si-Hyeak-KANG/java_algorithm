package test.BJ.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortNum3_10989_3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        // 테스트 수만큼 입력 받은 값 배열에 넣기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 0,1,2,3,4 (5)
        // 버블 정렬
        for (int i = 0; i < arr.length - 1; i++) {

            int curr = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (curr > arr[j]) {
                    arr[j - 1] = arr[j];
                    arr[j] = curr;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
