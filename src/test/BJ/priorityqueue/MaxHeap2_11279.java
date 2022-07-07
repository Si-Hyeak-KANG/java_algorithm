package test.BJ.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// PriorityQueue 클래스 사용
// 내부 요소는 힙으로 구성되어 이진트리 구조로 이루어져 있음
// 시간 복잡도 O(NLOGN)
// StringBuilder 사용 결과 1020ms -> 336ms
public class MaxHeap2_11279 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1); // 매개변수에는 Comparator 유사하게 정렬 기준을 넣음.

        for(int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());

            if(input == 0) {
                if(queue.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(queue.poll()).append('\n');
                }
            } else {
                queue.add(input);
            }
        }

        System.out.println(sb);
    }
}
