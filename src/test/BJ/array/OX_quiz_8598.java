package test.BJ.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class OX_quiz_8598 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; // OO O OOO


        int t = Integer.parseInt(br.readLine());

        int[] result = new int[t];
        int point = 0;

        for(int i = 0; i < result.length; i++) {

            st = new StringTokenizer(br.readLine(),"X");

            while(st.hasMoreTokens()) {

                String str = st.nextToken();

                for (int j = 0; j < str.length(); j++) {

                    point = j + 1;
                    result[i] += point;
                }

            }
        }

        for(int i = 0 ; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    // 문제의 점수는 그 문제까지 연속된 O의 개수
    // "OOXXOXXOOO" -> 1+2+0+0+1+0+0+1+2+3 = 10점
    // 0 < String < 80
    // 문자열은 OX만으로 이루어짐
    // 각 케이스마다 점수 출력

}
