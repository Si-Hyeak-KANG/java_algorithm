package test.BJ.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 특정한 조건 없이 수 나열
public class NAndM3_15651 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        func(N, M, 0, new ArrayList<>());
    }

    public static void func(int N, int M, int currColumn, ArrayList<Integer> currArr) {

        StringBuilder sb = new StringBuilder();

        if(currColumn == M) {

            for (Integer data : currArr) {
                sb.append(data+1).append(" ");
            }

            System.out.println(sb);
            return;
        }

        for(int i = 0; i < N; i++) {
                currArr.add(i);
                func(N,M, currColumn+1,currArr);
                currArr.remove(currArr.size()-1);
        }
    }
}
