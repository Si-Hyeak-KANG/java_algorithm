package fastCampus.arg04;

public class UndirectedGraph {

    private int count;
    private int[][] vertexMatrix;

    public UndirectedGraph(int count) {
        this.count = count;
        vertexMatrix = new int[count][count];
    }

    public void addEdges(int from, int to, int weight) {
        vertexMatrix[from][to] = weight;
        vertexMatrix[to][from] = weight;
    }

    public int[][] getMatrix() {
        // 수정수정수정
        return vertexMatrix;
    }
}
