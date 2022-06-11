package test.BJ.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 1~N 까지의 스택 생성
 * push와 입력한 수열처럼
 *
 * 수행시간 332ms
 */
public class StackSequence_1874 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> currStack = new Stack<>();

        int top = 0;

        while (N > 0) {

            int input = Integer.parseInt(br.readLine());

            if (input > top) {

                for (int i = top + 1; i <= input; i++) {
                    currStack.push(i);
                    sb.append('+').append('\n');
                }
                top = input;
            } else if(currStack.peek() != input) {
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

