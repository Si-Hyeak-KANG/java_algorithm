package test.BJ.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 브루트 포스 풀이
 * 시간 초과
 * 1부터 N까지 모든 페이지에 대해서, 각 숫자가 몇 번씩 나오는지 세보는 것
 * 시간 복잡도 : O(N)
 * 보통 1억번 정도가 1초 , 문제는 10억이기 때문에 시간초과 발생
 */
public class BookPage_1019 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        for (int i = 1; i <= N; i++) {

            int page = i;

            while(page > 0) {

                arr[page % 10]++;
                page /= 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int data : arr) {
            sb.append(data+" ");
        }

        System.out.println(sb);
    }
}
