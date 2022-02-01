package test.BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// BufferedReader, StringTokenizer 활용, 528ms
public class MinMax_10818_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] arr = new int[count];
        int min = 0;
        int max = 0;

        for(int i=0; i<arr.length;i++) {
            int val = Integer.parseInt(st.nextToken());
            arr[i] = val;
            min = arr[0];
            max = arr[0];
        }

        for(int i=0; i<arr.length;i++){

            if(min > arr[i]) {
                min = arr[i];
            }

            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(min + " " + max);
    }

}
