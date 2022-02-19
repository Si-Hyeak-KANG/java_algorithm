package test.BJ.recursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*7
1 3
1 2
3 2
1 3
2 1
2 3
1 3
* */

public class HanoiTower_11729 {
    static void move(int n, int start, int sub, int end) {

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 원판 개수 입력

        move(n, 1,2,3);
    }

}
