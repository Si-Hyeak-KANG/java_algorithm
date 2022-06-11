package test.BJ.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 처음 풀이
 *
 * 수행 시간 4140 ms
 */
public class StackSequence_1874_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 정수 N 입력
        Stack<Integer> stack = new Stack<>();
        int[] sequenceArr = new int[N];

        // 입력 받는 수열을 배열에 넣음
        for(int i = 0; i < N; i++) {
            sequenceArr[i] = Integer.parseInt(br.readLine());
        }

        // 스택에 쌓을 값
        int value = 1;
        // 배열 인덱스
        int i = 0;

        while(value<=N) {

            stack.push(value);
            sb.append("+").append("\n");

            // 배열의 해당 인덱스 값이 스택에 있으면,
            while(stack.contains(sequenceArr[i])) {

                // 해당 인덱스의 값이 스택의 가장 위에 있는 값이면,
                if (stack.peek() == sequenceArr[i]) {
                    stack.pop();
                    sb.append("-").append("\n");
                    i++;

                    // IndexOutOfBounds Exception 방지
                    if(i > N-1) {
                        break;
                    }

                // 반례 해당 인덱스의 값이 스택의 가장 위에 있는 값이 아니라면,
                } else {
                    System.out.println("NO");
                    return;
                }
            }

            value++;
        }

        System.out.println(sb);

    }
}
