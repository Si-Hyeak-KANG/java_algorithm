package test.BJ.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ACMHotel_10250 {
    public static void main(String[] args) throws IOException {
/*        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i =0; i<T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            if(N % H == 0) {
                System.out.println((H * 100) + (N/H));
            } else {
                System.out.println(((N % H) * 100) + (N/H) + 1);
            }
        }*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // StringBuilder는 출력할 문자열들을 하나로 묶어주고, 마지막에 한 번에 출력해주는 것
        int T = Integer.parseInt(br.readLine()); // 테이스 케이스

        for(int i = 0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int H = Integer.parseInt(st.nextToken());
            st.nextToken(); // W는 사용이 안되기 때문에 따로 변수를 지정해주지 않는다.
            int N = Integer.parseInt(st.nextToken());

            if(N % H == 0) {
                sb.append((H * 100) + (N / H)).append('\n');
            } else {
                sb.append(((N % H) * 100)+((N/H) + 1)).append('\n');
            }
        }
        System.out.print(sb);
    }
}
