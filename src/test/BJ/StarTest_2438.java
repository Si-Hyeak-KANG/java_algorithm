package test.BJ;

import java.util.Scanner;

public class StarTest_2438 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i=1;i<=count;i++) {

            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }
}
