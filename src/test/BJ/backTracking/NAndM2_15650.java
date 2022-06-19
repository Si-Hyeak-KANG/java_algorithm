package test.BJ.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 이번은 중복이 허용되지 않는다. 즉, (1,4) 가 나왔으면, 다음 (4,1)은 나올 수 없음
public class NAndM2_15650 {

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

            if(isAvailable(i,currArr)) {
                currArr.add(i);
                func(N,M, currColumn+1,currArr);
                currArr.remove(currArr.size()-1);
            }
        }
    }

    public static boolean isAvailable(int currRow, ArrayList<Integer> currArr) {

        if(currArr.size() > 0 && currArr.get(currArr.size()-1) >= currRow) {
                return false;
        }
        return true;
    }
}
