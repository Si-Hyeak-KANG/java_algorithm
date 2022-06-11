package test.BJ.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 사람 수 N
 * 각각 인출허는데 걸리는 시간 P가 걸린다.
 * 어떻게 줄을 서야 가장 빠른 시간내로 인출이 끝날까
 *
 * point
 * 1) 빨리 끝나는 순서로 정렬
 * 1, 1+2 = 3, 1+2+3 = 6, 1+2+3+3 = 9, 1+2+3+3+4 = 13
 */
public class ATM_11399 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int sum = 0;
        int total = 0;
        for (int data : arr) {
            sum += data;
            total += sum;
        }

        System.out.println(total);
    }
}
