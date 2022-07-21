package test.BJ.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 수행시간 256ms
 */
public class Zero_10773 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.add(input);
            }
        }

        int result = stack.stream().mapToInt(n -> n).sum();
        System.out.println(result);
    }
}
