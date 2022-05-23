package test.BJ.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;

/**
 * point
 * 1) 배열
 * 2)
 *
 * 시간 3100ms
 */
public class Goldbach_9020 {

    static boolean isDecimal(int data) {

        boolean isTrue = true;

        for(int i = 1; i <= sqrt(data); i++) {

            if(data == 2 || i == 1) {
                continue;
            } else if(data % i == 0) {
                isTrue = false;
            }
        }

        return isTrue;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        for(int i = 0; i < test; i++) {

            int n = Integer.parseInt(br.readLine()); // 짝수 n
            int left = 0;
            int right = 0;

            for(int j = 2; j <= n/2; j++) {

                if(isDecimal(j)) {

                    if(isDecimal(n - j)) {
                        left = j;
                        right = n -j;
                    }
                }
            }

            System.out.println(left + " " + right);
        }
    }
}
