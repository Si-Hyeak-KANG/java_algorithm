package test.BJ;

import java.util.Scanner;

public class Gugudan_2739 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 단수 입력

        for(int i=1;i<10;i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }

    }
}
