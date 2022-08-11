package test.BJ.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 1076ms
// 오름차순
public class DFS1_24479 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] check;
    static int count;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());

        check = new int[vertex+1];

        for(int i =0; i < vertex+1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int fromVertex = Integer.parseInt(st.nextToken());
            int toVertex = Integer.parseInt(st.nextToken());

            graph.get(fromVertex).add(toVertex);
            graph.get(toVertex).add(fromVertex);
        }

        for(int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        count = 1;
        dfs(startVertex);

        for(int i = 1; i < check.length; i++) {
            sb.append(check[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int vertex) {
        check[vertex] = count;

            for(int i = 0; i < graph.get(vertex).size(); i++) {
                int newVertex = graph.get(vertex).get(i);
                if(check[newVertex] == 0){
                    count++;
                    dfs(newVertex);
                }
            }
    }
}
