package test.BJ.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;

/**
 * point
 * - 소수가 맞는지 체크 메서드
 *
 * 시간 3100ms
 * -> 아마 각 수마다 소수인지를 판단하는 메서드를 호출해서 시간이 지연된 듯함.
 * -> 배열을 써서 소수를 미리 체크해두면, 시간이 단축 될듯
 */
public class Goldbach_9020 {

    // 소수인지 판단하는 메서드
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
            int left = 0; // 파티션의 왼쪽 피연산자
            int right = 0; // 파티션의 오른쪽 피연산자

            // 골드바흐 수는 2+2, 3+3, 5+5, 7+7 과 같은 수를 제외하고는 모두 N/2 기점으로 왼쪽 소수와 오른쪽 소수의 합으로 이루어진다.
            // 즉 n/2 이하만 검색하면 됨
            for(int j = 2; j <= n/2; j++) {

                // j가 소수가 아니라면, 패스!
                if(isDecimal(j)) {

                    // n - j 값이 소수면, 파티션의 왼쪽과 오른쪽에 값 할당
                    if(isDecimal(n - j)) {
                        left = j;
                        right = n -j;
                    }
                }

                // 수의 크기가 커질 수록 파티션 왼쪽과 오른쪽의 차이가 적어짐.
            }

            System.out.println(left + " " + right);
        }
    }
}
