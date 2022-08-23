package test.BJ.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class KnightShift_7562 {

    static StringTokenizer st;
    static boolean[][] board;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        while(testCase--> 0) {

            int numberOfKnight = Integer.parseInt(br.readLine());

            board = new boolean[numberOfKnight][numberOfKnight];

            st = new StringTokenizer(br.readLine());
            int currentColumn = Integer.parseInt(st.nextToken());
            int currentRow = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int targetColumn = Integer.parseInt(st.nextToken());
            int targetRow = Integer.parseInt(st.nextToken());

            ArrayList<Integer> route = new ArrayList<>();

            route.add(currentColumn);

            if(currentColumn==targetColumn && targetColumn==targetRow) {
                sb.append(0).append('\n');
            } else {
                board[currentRow][currentColumn] = true;
                board[targetRow][targetColumn] = true;

                boolean find = false;
            }
        }
    }

    static void shift(int row, ArrayList<Integer> route) {

        if(board[row][column]) return;

        for(int currColumn = 0; currColumn < board.length; currColumn++) {

            if(checkNextShift(currColumn,route)) {

            }
        }
    }

    /**
     * 말이 갈 수 있는 방향인지 체크
     * @return
     */
    static boolean checkNextShift(int column, ArrayList<Integer> route) {

        int row = route.size()-1;
        return false;
    }






















}
