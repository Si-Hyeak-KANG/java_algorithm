package test.BJ.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci1_24416 {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        recursiveFunc(input);
        System.out.println(count);
        count = 0;
        dynamicFunc(input);
        System.out.println(count);

    }
    // 재귀
    public static int recursiveFunc(int input) {

        if(input == 1 || input == 2) {
            count++;
            return 1;
        }
        return recursiveFunc(input-1) + recursiveFunc(input-2);
    }

    // 동적 계획법
    public static void dynamicFunc(int input) {

        int[] arr = new int[input];

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i < arr.length; i++) {

            arr[i] = arr[i-2] + arr[i-1];
            count++;
        }
    }
}