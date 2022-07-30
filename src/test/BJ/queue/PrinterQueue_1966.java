package test.BJ.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 128ms
public class PrinterQueue_1966 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        // 테스트 케이스 입력
        int testCase = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>(); // 중요도가 들어있는 큐
        Queue<Integer> indexOfQueue = new LinkedList<>(); // 위치가 저장된 큐

        for (int i = 0; i < testCase; i++) {

            st = new StringTokenizer(br.readLine());

            int countOfChar = Integer.parseInt(st.nextToken()); // 문자의 수
            int indexOfChar = Integer.parseInt(st.nextToken()); // 찾고자하는 문자의 위치

            st = new StringTokenizer(br.readLine());
            int index = 0; // indexOfQueue에 들어갈 index 정보
            int count = 0; // 출력 순서

            // 각 큐에 중요도와 인덱스 정보를 저장
            for (int j = 0; j < countOfChar; j++) {
                queue.add(Integer.parseInt(st.nextToken()));
                indexOfQueue.add(index++);
            }

            while (queue.size() > 0) {

                // 큐에서 가장 높은 중요도의 값을 찾음
                int max = queue.stream().mapToInt(n -> n).max().getAsInt();

                // 현재 인쇄할 문서의 중요도가 가장 높지 않을 때
                if (queue.peek() != max) {
                    // 각 큐에서 출력할 값을 제일 뒤로 이동
                    queue.add(queue.poll());
                    indexOfQueue.add(indexOfQueue.poll());

                } else { // 인쇄할 문서의 중요도가 가장 높을 경우

                    // 인쇄할 문서의 인덱스 정보가 찾고자하는 인덱스와 동일할 때
                    // count에 1을 더하고, 출력한다. (값 저장 후 while문 종료)
                    if (indexOfQueue.peek() == indexOfChar) {

                        count++;
                        sb.append(count).append('\n');
                        break;

                    } else { // 동일하지 않을 때

                        // 각 큐에서 출력(인쇄)하고, 순서(count)에 +1을 한다.
                        queue.poll();
                        indexOfQueue.poll();
                        count++;
                    }
                }
            }
        }

        System.out.println(sb);
    }
}

