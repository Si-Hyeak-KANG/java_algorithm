package test.BJ.recursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower_11729 {

    static StringBuilder sb = new StringBuilder();

    static void move(int N, int start, int mid, int end)  {

        if(N==1) {
            sb.append(start + " " + end).append("\n");
            return;
        }

        move(N-1,start,end,mid);
        sb.append(start + " " + end).append("\n");
        move(N-1,mid,start,end);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 원판의 개수 입력

        sb.append((int) (Math.pow(2,N)-1)).append("\n");

        move(N,1,2,3);

        System.out.println(sb);


    }
}

/*7
1 3
1 2
3 2
1 3
2 1
2 3
1 3
* */


