package test.BJ;

import java.util.Scanner;

public class APlusB7_11021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] list = new int[t];
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            list[i] = sum;
        }
        for(int i=1;i<=list.length;i++) {
            System.out.println("Case #"+i+": "+list[i-1]);
        }

    }
}
