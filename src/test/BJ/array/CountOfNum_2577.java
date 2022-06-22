package test.BJ.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 140ms
 */
public class CountOfNum_2577 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine()); // 150
        int B = Integer.parseInt(br.readLine()); // 266
        int C = Integer.parseInt(br.readLine()); // 427

        int result = A * B * C; // 17037300

        int[] countArr = new int[10]; // 0~9 까지의 배열 생성

        while(result > 0) {
            countArr[result % 10]++; // 각 자리에 해당하는 수를 인덱스로 하고, 해당 인덱스에 +1
            result /= 10;
        }

        for (int data : countArr) {
            sb.append(data + " ");
        }

        System.out.println(sb);
    }
}
