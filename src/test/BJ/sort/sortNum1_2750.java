package test.BJ.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sortNum1_2750 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(br.readLine());
        }

        while (N-- >= 0) {

            int currIndex = 0;

            for(int j = 1; j < arr.length; j++) {

                if( arr[currIndex] > arr[j] ) {

                    int temp = arr[currIndex];
                    arr[currIndex] = arr[j];
                    arr[j] = temp;
                }
                currIndex++;
            }
        }

        for (int i : arr) {
            sb.append(i).append('\n');
        }

        System.out.println(sb);
    }
}
