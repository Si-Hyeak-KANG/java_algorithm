package test.BJ.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// lower bound : 하한
// upper bound : 상한
public class CropLanCable_1654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] cableArr = new int[k];

        for(int i = 0; i < k; i++) {
            cableArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(cableArr);

        long max = cableArr[k-1];
        long min = 1;
        long middle = 0;

        while(max >= min) {

            middle = (max + min) / 2;

            long countOfCable = 0;

            for(int i = 0; i < cableArr.length; i++) {
                countOfCable += cableArr[i] / middle;
            }

            if(countOfCable >= n) {
                min = middle +1;
            } else {
                max = middle - 1;
            }
        }

        System.out.println(max);
    }
}
