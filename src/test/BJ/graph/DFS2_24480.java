package test.BJ.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class DFS2_24480 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int count, visited[];

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());

        // 0번 인덱스는 더미데이터
        visited = new int[vertex + 1];

        for (int i = 0; i <= vertex+1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int fromVertex = Integer.parseInt(st.nextToken());
            int toVertex = Integer.parseInt(st.nextToken());
            graph.get(fromVertex).add(toVertex);
            graph.get(toVertex).add(fromVertex);
        }

        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        count =1;
        dfs(startVertex);

        for (int i = 1; i < visited.length; i++) {
            sb.append(visited[i]).append('\n');
        }
        System.out.println(sb);
    }

    private static void dfs(int vertex) {
        visited[vertex] = count;

        for (int i = 0; i < graph.get(vertex).size(); i++) {

            Integer nextVertex = graph.get(vertex).get(i);

            // 값이 0이라는 것은 방문을 하지 않았다는 것
            if (visited[nextVertex] == 0) {
                count++;
                dfs(nextVertex);
            }
        }
    }
}
