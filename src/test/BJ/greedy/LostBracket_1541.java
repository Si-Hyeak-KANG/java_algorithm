package test.BJ.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 55 - 50 + 40 - 30 + 10
public class LostBracket_1541 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split("-");
        int total = 0;

        for(int i = 0; i < str.length; i++) {

            String replace = str[i].replace("+", ",");
            String[] split = replace.split(",");

            int sum = 0;
            for(int j = 0; j < split.length; j++) {

                sum += Integer.parseInt(split[j]);
            }

            if(i != 0) {
                total -= sum;
            } else {
                total += sum;
            }
        }

        System.out.println(total);

    }
}
