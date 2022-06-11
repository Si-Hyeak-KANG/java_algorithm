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

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] sequenceArr = new int[N];

        for(int i = 0; i < N; i++) {

            sequenceArr[i] = Integer.parseInt(br.readLine());
        }

        int value = 1;
        int i = 0;

        while(value<=N) {

            stack.push(value);
            sb.append("+").append("\n");

            while(stack.contains(sequenceArr[i])) {
                if (stack.peek() == sequenceArr[i]) {
                    stack.pop();
                    sb.append("-").append("\n");
                    i++;

                    if(i > N-1) {
                        break;
                    }
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
