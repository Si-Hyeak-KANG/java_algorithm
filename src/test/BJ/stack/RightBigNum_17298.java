package test.BJ.stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 시간 초과.. 왜ㅑ..?
 */
public class RightBigNum_17298 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");;
        StringBuilder sb = new StringBuilder();

        br.close();

        int[] arr = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length; i++) {

            Stack<Integer> stack = new Stack<>();
            String result = "-1";

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    stack.push(arr[j]);
                }
            }

            while(!stack.isEmpty()) {
                result = Integer.toString(stack.pop());
            }

            sb.append(result).append(" ");

        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}