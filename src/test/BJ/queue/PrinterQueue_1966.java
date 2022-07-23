package test.BJ.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//3 1 0 5 4 2 1 2 3 4 6 0 1 1 9 1 1 1 // 1 2 5
public class PrinterQueue_1966 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int testCase = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0 ; i < testCase; i++) {

            st = new StringTokenizer(br.readLine());
            ArrayList<Integer> queue = new ArrayList<>();

            int N = Integer.parseInt(st.nextToken()); // 문자의 개수
            int M = Integer.parseInt(st.nextToken()); // 문자의 위치

            for(int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                queue.add(Integer.parseInt(st.nextToken()));
            }

            arr.add(queue.get(M));
        }

        arr.stream().mapToInt(m->m).sorted().forEach(System.out::println);

    }
}
