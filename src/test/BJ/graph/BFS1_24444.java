package test.BJ.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BFS1_24444 {

    static StringTokenizer st;

    static int count, visited[];
    static ArrayList<ArrayList<Integer>> graph;

    private static void bfs(int startVertex, Queue<Integer> queue) {

        queue.add(startVertex);

        while (!queue.isEmpty()) {

            Integer currVertex = queue.poll();
            if (visited[currVertex] == 0) {
                count++;
                visited[currVertex] = count;
                ArrayList<Integer> childVertexes = graph.get(currVertex);

                for (Integer child : childVertexes) {
                    queue.add(child);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());

        // 0번 인덱스는 더미데이터
        visited = new int[vertex + 1];
        graph = new ArrayList<>();
        count = 0;

        for (int i = 0; i < vertex + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int fromVertex = Integer.parseInt(st.nextToken());
            int toVertex = Integer.parseInt(st.nextToken());

            graph.get(fromVertex).add(toVertex);
            graph.get(toVertex).add(toVertex);
        }

        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        bfs(startVertex, new LinkedList<>());

        for (int i = 1; i < visited.length; i++) {
            sb.append(visited[i]).append("\n");
        }

        System.out.println(sb);
    }
}
