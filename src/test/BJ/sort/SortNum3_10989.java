package test.BJ.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * point :
 *  1) 중복 제거 X
 *  2) 컬렉션 프레임워크 활용 풀이
 *  3) 메모리 부족 발생
 */
public class SortNum3_10989 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i=0; i < N; i++) {

            int input = Integer.parseInt(br.readLine());
            list.add(input);
        }

        Collections.sort(list);

        for(Integer data : list) {
            sb.append(data + "\n");
        }

        System.out.println(sb);

    }
}
