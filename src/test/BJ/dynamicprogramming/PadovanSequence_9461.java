package test.BJ.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PadovanSequence_9461 {

    static Long[] seq = new Long[101];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        seq[0] = 0L;
        seq[1] = 1L;
        seq[2] = 1L;
        seq[3] = 1L;

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {

            int input = Integer.parseInt(br.readLine());

            sb.append(func(input)).append("\n");
        }

        System.out.println(sb);
    }

    public static Long func(int input) {

        for (int i = 4; i <= input; i++) {
            seq[i] = seq[i - 3] + seq[i - 2];
        }

        return seq[input];
    }
}
