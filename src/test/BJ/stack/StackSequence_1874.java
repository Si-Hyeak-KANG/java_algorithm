package test.BJ.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 1~N 까지의 스택 생성
 * push와 입력한 수열처럼
 * <p>
 * 수행시간 332ms
 */
public class StackSequence_1874 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 정수 N 입력
        Stack<Integer> currStack = new Stack<>(); // 1 부터 N 까지 오름차순으로 쌓을 스택

        int top = 0; // 스택의 가장 위에 있는 값값

        while (N > 0) {

            // 수열 입력
            int input = Integer.parseInt(br.readLine());

            // 입력한 값이 top 보다 크다면,
            if (input > top) {

                // 스택에 Push 하고, sb에 + 를 append
                for (int i = top + 1; i <= input; i++) {
                    currStack.push(i);
                    sb.append('+').append('\n');
                }
                // 입력한 값이 스택의 가장 위에 위치한 값이 되므로, top에 대입
                top = input;

            // 반례 : 스택에서 가장 위에 있는 값이 input과 같지 않다면,
            } else if (currStack.peek() != input) {
                // 결과로 No 를 출력하고 프로그램 종료
                System.out.println("NO");
                return;
            }

            // input 만큼 넣었으면 스택에서 가장 위에 데이터를 꺼냄
            // 또는 input 값이 index 보다 작으면, 스택에서 바로 값을 꺼냄
            currStack.pop();
            sb.append('-').append('\n');

            N--;
        }
        System.out.println(sb);
    }
}

