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

    /**
     *
     * @param N : 체스판 크기, 배치할 퀸의 개수
     * @param row : 퀸을 배치하기 위해 탐색할 열
     * @param currentQueen : 현재 배치된 퀸들의 행을 저장한 배열
     *
     * 재귀로 함수를 시작할 때마다 row +1 -> 다음 열 탐색
     * */
    public static void func(Integer N, int row, ArrayList<Integer> currentQueen) {

        // 보드판의 마지막까지 순회하여, 퀸의 위치를 다 찾았을 때
        if(row == N) {
             count++;
             return;
        }

        for(int column = 0; column < N; column++) {

            // 현재 열과 행에 queen 을 배치할 수 있는지 체크
            if(isAvailable(column, currentQueen)) {

                // 현재 행을 배열에 추가 (index가 열에 해당)
                currentQueen.add(column);
                func(N, row+1, currentQueen); // 현재 열에 퀸을 찾으면 다음 열 검색

                // 퀸을 더 이상 둘 수 없을 경우, 이전에 두었던 퀸을 없애고 옆 칸으로 이동한다.
                currentQueen.remove(currentQueen.size()-1);
            }
        }
    }

    /**
     *
     * @param column : 퀸을 배치하기 위해 탐색할 열
     * @param currentQueen : 현재 배치된 퀸들의 행을 저장한 배열 (index 는 열과 동일)
     * @return 지금까지 저장된 퀸들의 수직 또는 대각선 위치라면 false 반환 (아니라면 true)
     */
    public static boolean isAvailable(int column, ArrayList<Integer> currentQueen) {

        int currentRow = currentQueen.size(); // 배열의 사이즈는 현재 탐색할 열과 동일

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
