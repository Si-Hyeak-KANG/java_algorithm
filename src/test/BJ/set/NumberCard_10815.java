package test.BJ.set;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * M 개의 카드 내에 N 개의 카드들의 포함 여부 체크
 * N개 집합
 * 목표 시간복잡도 O(N)
 */
public class NumberCard_10815 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 상근이가 갖고 있는 카드 수

        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {

            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {

            if (set.contains(Integer.parseInt(st.nextToken()))) {

                sb.append(1).append(" ");

            } else {
                sb.append(0).append(" ");
            }
        }

        br.close();

        System.out.println(sb);

    }
}
