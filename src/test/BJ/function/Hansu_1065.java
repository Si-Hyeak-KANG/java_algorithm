package test.BJ.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hansu_1065 {

    static boolean func(int num) {

        if(num == 1000) {
            return false;
        }

        if(num < 100) {
            return true;
        }

        int first = num % 10;
        num /= 10;
        int second = num  % 10;
        num /= 10;
        int third = num % 10;

        if(third - second == second - first) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[N];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = func(i+1);
        }

        for (boolean b : arr) {
            if(b == true) count++;
        }

        System.out.println(count);
    }

}
