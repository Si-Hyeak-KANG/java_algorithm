package test.BJ.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 자기 자신을 제외한 번호와 연결된 수 나열
public class NAndM1_15649 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // row
        int M = Integer.parseInt(st.nextToken()); // column

        func(N,M,0,new ArrayList<>());

    }

    public static void func(int N, int M, int currColumn, ArrayList<Integer> currCandidate) {
        StringBuilder sb = new StringBuilder();

        if (currColumn == M) {

            for (Integer data : currCandidate) {
                sb.append(data+1).append(" ");
            }

            System.out.println(sb);
            return;
        }

        for (int i = 0; i < N; i++) {

            if(isAvailable(currCandidate,i)) {

                currCandidate.add(i);
                func(N,M,currColumn+1,currCandidate);
                currCandidate.remove(currCandidate.size()-1);
            }

        }
    }

    public static boolean isAvailable(ArrayList<Integer> currCandidate, int row) {

        int currColumn = currCandidate.size();

        // currCandidate 가 갖고 있는 값과 겹치면 false
        for(int i = 0; i < currColumn; i++) {
            if (currCandidate.get(i) == row) {
                return false;
            }
        }
        return true;
    }
}
