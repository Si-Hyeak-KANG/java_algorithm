package test.BJ.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BFS1_24479 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[][] graph;
    static int[] result;

    public static void main(String[] args) throws IOException {

         st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startPoint = Integer.parseInt(st.nextToken())-1;

        graph = new int[node][node];

        for(int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());

            int startNode = Integer.parseInt(st.nextToken())-1;
            int arriveNode = Integer.parseInt(st.nextToken())-1;
            ++graph[startNode][arriveNode];
            ++graph[arriveNode][startNode];
        }
        result = new int[node];
        bfs(startPoint,1,1, node);

        for (int count : result) {
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }

    public static void bfs(int currentNode,int targetNode,int count,int nodeSize) {

        if(targetNode == nodeSize) {
            return;
        }

        result[currentNode] = count;
        
        if(graph[currentNode][targetNode] != 0) {
            bfs(graph[currentNode][targetNode], targetNode++, count, nodeSize);
        }
    }
}
