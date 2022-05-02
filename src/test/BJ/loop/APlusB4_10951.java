package test.BJ.loop;

import java.util.Scanner;

public class APlusB4_10951 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A <= 0 || A >= 10 || B <= 0 || B >= 10) {
                break;
            }

            System.out.println(A + B);
        }
    }
}
