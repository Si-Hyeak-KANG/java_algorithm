package argorithmStudy.backtracking;

import java.util.ArrayList;

public class NQueenStudy2 {

    public static void main(String[] args) {

        NQueenStudy nObject = new NQueenStudy();
        nObject.dfsFunction(4, 0, new ArrayList<Integer>());
    }

    public void dfsFunction(Integer N, Integer currentRow, ArrayList<Integer> currentCandidate) {

        if(currentRow == N) {
            System.out.println(currentCandidate);
            return;
        }

        for(int i =0; i < N; i++) {
            if(this.isAvailable(currentCandidate, i)) {

                currentCandidate.add(i);
                this.dfsFunction(N, currentRow+1, currentCandidate);
                currentCandidate.remove(currentCandidate.size() - 1);
            }
        }
    }

    public boolean isAvailable(ArrayList<Integer> candidate, Integer currentCol) {

        int currentRow = candidate.size();

        for(int i = 0; i < currentRow; i++) {

            if(currentCol == candidate.get(i) || Math.abs(candidate.get(i) - currentCol) == currentRow - i) {
                return false;
            }
        }

        return true;
    }

}
