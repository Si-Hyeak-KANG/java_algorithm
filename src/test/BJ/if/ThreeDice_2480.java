import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Point
 * 1) BufferedReader, StringTokenizer 활용
 * 2) Math.max() 활용
 *
 * 수행 시간 124ms
 */
public class ThreeDice_2480 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 첫 번째 주사위
        int num1 = Integer.parseInt(st.nextToken());
        // 두 번째 주사위
        int num2 = Integer.parseInt(st.nextToken());
        // 세 번째 주사위
        int num3 = Integer.parseInt(st.nextToken());

        if(num1 == num2 && num1 == num3) {
            System.out.println(10000 + num1 * 1000);
        } else if(num1 == num2 || num1 == num3) {
            System.out.println(1000 + num1 * 100);
        } else if(num2 == num3) {
            System.out.println(1000 + num2 * 100);
        } else {
            System.out.println(Math.max(Math.max(num1,num2),num3) * 100);
        }

    }
}
