package test.BJ.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 수행시간 124ms
public class SortInside_1427 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine(); // 문자열 타입으로 수 입력

        String[] unSortedArr = N.split(""); // 쪼갠 후 배열에 할당

        Arrays.sort(unSortedArr, Comparator.reverseOrder()); // 해당 배열을 내림차순으로 정렬
        for (String b : unSortedArr) sb.append(b);

        System.out.println(sb);
    }
}
