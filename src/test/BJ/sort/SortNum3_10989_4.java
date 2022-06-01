package test.BJ.sort;

import java.io.*;

/**
 * Point
 * 1) 정답 참고
 * 2) 컬렉션 프레임워크를 활용하면 메모리 부족 발생
 * 3) 시간 복잡도 O(N^2) 미만으로 해결해야함.
 *
 * 수행시간 1760ms
 */
public class SortNum3_10989_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 입력되는 값이 10,000 이하,
        // 입력받은 값을 인덱스로 사용
        int[] input = new int[10001];

        for (int i = 0; i < N; i++) {

            // 입력 받은 값과 동일한 인덱스에 +1
            input[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        // 수행 시간을 조금이라도 더 단축하기 위해 BufferWriter 클래스 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i =0; i < input.length; i++) {

            // 해당 인덱스에 값이 0이 될때가지 1씩 감소하며, 반복
            while(0 < input[i]--) {
                bw.write(i + "\n"); // 인덱스를 출력
            }
        }
        bw.close();
    }
}
