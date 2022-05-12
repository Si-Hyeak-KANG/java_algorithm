package test.BJ.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hansu_1065 {

    static boolean func(int num) {

        int arr[] = new int[4];

        boolean hansu = false;

        for(int i = 0; i < arr.length; i++){

            arr[i] = num % 10;
            num /= 10;
        }

        if((arr[0] - arr[1]) == (arr[1] - arr[2]))
        return hansu;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 1; i <= num; i++) {

            if(func(i)) {

                count++;
            }
        }

        System.out.println(count);

    }


}
