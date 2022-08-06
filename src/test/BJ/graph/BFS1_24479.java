package test.BJ.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BFS1_24479 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<ArrayList<Integer>> graph;
    static ArrayList<Integer> result;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startPoint = Integer.parseInt(st.nextToken()) - 1;

        graph = new ArrayList<>();

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());

            int startNode = Integer.parseInt(st.nextToken()) - 1;
            int arriveNode = Integer.parseInt(st.nextToken()) - 1;
            ++graph[startNode][arriveNode];
            ++graph[arriveNode][startNode];
        }

        result = new ArrayList<>();
        bfs(startPoint, 1, startPoint,node);

        for (Integer count : result) {
            sb.append(count+1).append('\n');
        }

        System.out.println(sb);
    }

    public static void bfs(int currentNode,int node, int startNode,int nodeCount) {

        if(node > nodeCount) {
            return;
        }

        if(currentNode==startNode) {
            result.add(0);
        }

        for (int i = 0; i < nodeCount ; i++) {

            if(graph[currentNode][i] != 0) {

                if(!isVisited(result,i)) {
                    result.add(i);
                    bfs(i,++node, startNode, nodeCount);
                }
            }
        }
    }

    public static boolean isVisited(ArrayList<Integer> result,int currNode) {

        for (Integer integer : result) {
            if(integer==currNode) {
                return true;
            }
        }

        return false;
    }
}
