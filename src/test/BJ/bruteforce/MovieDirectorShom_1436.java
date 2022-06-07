package test.BJ.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 이해
 * 1) 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수
 *
 * 수행시간 284ms
 */
public class MovieDirectorShom_1436 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 종말 넘버 666 고정
        int shomNum= 666;

        while(N != 1) {

            if(Integer.toString(shomNum).contains("666")) N--;

            shomNum++;
        }

        System.out.println(shomNum);

    }
}
