package test.BJ;

import java.util.Scanner;
// Scanner 와 시간복잡도 O(n) 수행, 1712ms
public class MinMax_10818 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        int min = 0;
        int max = 0;

        for(int i=0; i<arr.length;i++) {
            int val = sc.nextInt();
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
