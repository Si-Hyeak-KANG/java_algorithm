package test.BJ.set;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * 수행시간 440ms
 */
public class StringSet_14425 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // N개의 집합
        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        // M개 문자를 입력하면서 set에 있는 문자열인지 체크
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (set.contains(str)) {
                count++; // 해당하면 +1
            }
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();

    }
}
