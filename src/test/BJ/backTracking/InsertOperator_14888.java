package test.BJ.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InsertOperator_14888 {

    static int maxResult = Integer.MIN_VALUE;
    static int minResult = Integer.MAX_VALUE;
    static int[] numberArr;
    static int[] operator = new int[4];

    public static void func(int num, int index) {

        if (index == numberArr.length) {
            maxResult = Math.max(maxResult, num);
            minResult = Math.min(minResult, num);
            return;
        }

        for (int i = 0; i < operator.length; i++) {

            if (operator[i] > 0) {

                operator[i]--;

                switch (i) {
                    case 0:
                        func(num + numberArr[index], index + 1);
                        break;
                    case 1:
                        func(num - numberArr[index], index + 1);
                        break;
                    case 2:
                        func(num * numberArr[index], index + 1);
                        break;
                    case 3:
                        func(num / numberArr[index], index + 1);
                        break;
                }

                operator[i]++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = Integer.parseInt(br.readLine()); // 수의 개수
        numberArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            numberArr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        // 메서드 실행
        func(numberArr[0], 1);

        System.out.println(maxResult);
        System.out.println(minResult);
    }
}