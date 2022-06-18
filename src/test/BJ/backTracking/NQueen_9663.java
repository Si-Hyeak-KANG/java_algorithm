package test.BJ.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * point
 * 1) 재귀 활용
 *
 * 수행시간 6184ms
 */
public class NQueen_9663 {

    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 보드판 크기와 Queen 의 개수 입력
        int N = Integer.parseInt(br.readLine());

        func(N, 0, new ArrayList<Integer>());
        System.out.println(count);
    }

    public static void func(Integer N, int row, ArrayList<Integer> currentQueen) {

        // 보드판의 마지막까지 순회하여, 퀸의 위치를 다 찾았을 때
        if(row == N) {
             count++;
             return;
        }

        for(int column = 0; column < N; column++) {

            // 현재 행과 열에 queen을 둘 수 있는지 체크
            if(isAvailable(column, currentQueen)) {

                currentQueen.add(column);
                func(N, row+1, currentQueen); // 현재 열에 퀸을 찾으면 다음 열 검색

                // 퀸을 더 이상 둘 수 없을 경우, 이전에 두었던 퀸을 없애고 옆 칸으로 이동한다.
                currentQueen.remove(currentQueen.size()-1);
            }
        }
    }

    public static boolean isAvailable(int column, ArrayList<Integer> currentQueen) {

        int currentRow = currentQueen.size();

        for(int i = 0; i < currentRow; i++) {

            // 퀸의 위치가 될 수 없는 조건
            // 1) 열이 같을 때(수직일 때) -> y1 == y2
            // 2) 현재 퀸을 두려는 열에서 이미 퀸을 둔 자리의 열을 뺀 값이 서로의 행을 뺀 값과 같을 때 -> |y1-y2| == x2-x1
            if (column == currentQueen.get(i) || Math.abs(currentQueen.get(i) - column) == currentRow - i) {
                return false;
            }
        }
        return true;
    }
}
