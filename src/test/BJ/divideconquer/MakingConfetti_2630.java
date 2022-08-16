package test.BJ.divideconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakingConfetti_2630 {
    // 색상 카운트 할 변수 및 색종이(board)
    public static int white = 0;
    public static int blue = 0;
    public static int[][] board;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        board = new int[N][N];

        StringTokenizer st;

        for (int row = 0; row < N; row++) {
            st = new StringTokenizer(br.readLine());

            for (int col = 0; col < N; col++) {
                board[row][col] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, N);

        System.out.println(white);
        System.out.println(blue);
    }

    // row : 행, col : 열
    public static void divide(int row, int col, int size) {

        if(colorCheck(row,col,size)) {
            if(board[row][col] == 0) {
                white++;
            }
            else {
                blue++;
            }
            return;
        }

        int newSize = size/2;

        divide(row, col, newSize); // 2사분면
        divide(row, col + newSize, newSize); // 1사분면
        divide(row+newSize,col,newSize); // 3사분면
        divide(row+newSize, col+newSize, newSize); // 4사분면
    }

    public static boolean colorCheck(int row, int col, int size) {

        int color = board[row][col]; // 1, 0

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {

                if(board[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }

}
