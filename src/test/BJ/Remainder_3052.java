package test.BJ;

import java.util.Scanner;

public class Remainder_3052 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int count = 0;

        for(int i=1;i<=num.length;i++){
            num[i-1]=sc.nextInt() % 42;
            if(num[i-1]!=num[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
