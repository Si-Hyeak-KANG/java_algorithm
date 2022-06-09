package test.BJ.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bracket_9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            String bracket = br.readLine();
            String[] arr = bracket.split("");
            Stack<String> stack = new Stack<>();
            String success = "YES";

            for (int j = 0; j < arr.length; j++) {

                if (arr[j].equals(")")) {
                    if (stack.isEmpty()) {
                        success = "NO";
                        break;
                    }
                    stack.pop();
                } else {
                    stack.push("x");
                }


            }

            if(!stack.isEmpty()) {
                success="NO";
            }

            System.out.println(success);
        }
    }
}
