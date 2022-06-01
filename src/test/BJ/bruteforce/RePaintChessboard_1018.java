package test.BJ.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * summary
 * 1) 다시 칠해야 하는 최솟값 출력
 * 2) 8 * 8 인 새로운 보드판
 */
public class RePaintChessboard_1018 {

    static String[][] board;
    static int min = 64;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 1) 보드판의 크기 입력 N, M
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2) 입력값에 맞는 보드판 생성
        board = new String[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < M; j++) {
                board[i][j] = String.valueOf(str.charAt(j));
            }
        }

        // 4) 박스 비교
        for (int i = 0; i < (N - 7); i++) {

            for (int j = 0; j < (M - 7); j++) {

                find(i,j);
            }
        }

        // 5) 차이가 가장 적은 상태에서 차이 개수 출력
        System.out.println(min);


    }

    public static void find(int x, int y) {

        int endX = x + 8;
        int endY = y + 8;
        int count = 0;

        String color = board[x][y]; // 첫번째 칸의 색

        for (int i = x; i < endX; i++) {

            for (int j = y; j < endY; j++) {

                if (!board[i][j].equals(color)) {
                    count++;
                }

                if (color.equals("W")) {
                    color = "B";
                } else {
                    color = "W";
                }

            }

            if (color.equals("W")) {
                color = "B";
            } else {
                color = "W";
            }

        }

        count = Math.min(count, 64-count);

        min = Math.min(min,count);
    }

}