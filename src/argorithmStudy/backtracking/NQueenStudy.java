package argorithmStudy.backtracking;

import java.util.ArrayList;

public class NQueenStudy {

    public boolean isAvailable(ArrayList<Integer> candidate, Integer currentCol) {

        Integer currentRow = candidate.size();

        for(int i = 0; i < currentRow; i++) {
            // Promising(조건) 기법
            if((candidate.get(i) == currentCol )|| (Math.abs(candidate.get(i) - currentCol) == currentRow - i)){
                // 수직이거나, 대각선일 때
                return false;
            }
        }

        return true;
    }

    // currentRow : 지금 체크해야할 행이 어디 행인가.
    public void dfsFunction(Integer N, Integer currentRow, ArrayList<Integer> currentCandidate) {
        // 전체 행을 다 돌았다.
        if (currentRow == N) {
            System.out.println(currentCandidate); // 결과 출력
            return;
        }

        for(int i = 0; i < N; i++) {
            if(this.isAvailable(currentCandidate, i)) {
                currentCandidate.add(i);
                this.dfsFunction(N, currentRow + 1, currentCandidate);
                // Pruning(가지치기) 기법
                currentCandidate.remove(currentCandidate.size() - 1);
            }

        }
    }

    public static void main(String[] args) {

        NQueenStudy nObject = new NQueenStudy();
        nObject.dfsFunction(4, 0, new ArrayList<Integer>());
    }

}
