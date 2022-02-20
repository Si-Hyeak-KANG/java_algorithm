package test.BJ.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Arrays 자료구조 활용 -> 정렬 후 출력, 1400ms, 정렬하는 과정때문에 시간이 비교적 걸렸을 것으로 추측
public class MinMax_10818_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int index = 0; // for문이 아닌 while을 활용할 것이기 때문에 index 지정
        int[] arr = new int[count];

        while(st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr); // arr 배열을 Array 자바 패키지를 통해 정렬
        System.out.println(arr[0] + " " + arr[count-1]); // 정렬된 수에서 0번, 맨끝 인덱스 출력
    }
}
