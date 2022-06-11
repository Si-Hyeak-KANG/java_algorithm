package test.BJ.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * push X: 정수 X를 스택에 넣는 연산이다.
 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 스택에 들어있는 정수의 개수를 출력한다.
 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
public class Stack_10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 명령의 수

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < N; i++) {

            String[] s = br.readLine().split(" ");

            if (s[0].equals("push")) {

                stack.push(s[1]);

            } else if (s[0].equals("pop")) {

                String result = "-1";

                if (stack.size() > 0) {
                    result = stack.pop();
                }

                sb.append(result).append('\n');

            } else if (s[0].equals("size")) {

                sb.append(stack.size()).append('\n');

            } else if (s[0].equals("empty")) {

                int result = 0;

                if (stack.empty()) {
                    result = 1;
                }

                sb.append(result).append('\n');

            } else if (s[0].equals("top")) {

                String result = "-1";

                if (stack.size() > 0) {
                    result = stack.peek();
                }

                sb.append(result).append('\n');

            }
        }
        System.out.println(sb);
    }
}
