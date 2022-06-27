package test.BJ.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class InsertOperator_14888 {

    static int maxResult = Integer.MIN_VALUE;
    static int minResult = Integer.MAX_VALUE;
    static int[] numberArr;
    static int[] operator = new int[4];
    static int total = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = Integer.parseInt(br.readLine()); // 수의 개수
        numberArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            numberArr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        // 메서드 실행
        func(numberArr[0],0);

    }

    public static void func(int num, int index) {




    }

    public static boolean isAvailable() {

        return true;
    }




}
