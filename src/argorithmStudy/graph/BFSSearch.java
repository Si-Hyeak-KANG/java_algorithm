package argorithmStudy.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BFSSearch {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> graph = new HashMap<>();

        graph.put("A", new ArrayList<>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<>(Arrays.asList("A", "D")));
        graph.put("C", new ArrayList<>(Arrays.asList("A", "G", "H", "I")));
        graph.put("D", new ArrayList<>(Arrays.asList("B", "E", "F")));
        graph.put("E", new ArrayList<>(Arrays.asList("D")));
        graph.put("F", new ArrayList<>(Arrays.asList("D")));
        graph.put("G", new ArrayList<>(Arrays.asList("C")));
        graph.put("H", new ArrayList<>(Arrays.asList("C")));
        graph.put("I", new ArrayList<>(Arrays.asList("C", "J")));
        graph.put("J", new ArrayList<>(Arrays.asList("I")));


        BFSSearch bObject = new BFSSearch();

        System.out.println(bObject.bfsFunc(graph, "A"));

    }

    /**
     * Queue 패키지를 활용할 수 도 있지만, ArrayList를 활용하여 2개의 Queue 기능 구현
     * 1. visited
     * 2. needVisit
     *
     * @param graph     : 그래프의 연결 정보가 들어간 HashMap<String, ArrayList<String>>
     * @param startNode : 시작할 노드
     * @return
     */
    public ArrayList<String> bfsFunc(HashMap<String, ArrayList<String>> graph, String startNode) {
        ArrayList<String> visited = new ArrayList<String>(); // ArrayListQueue1
        ArrayList<String> needVisit = new ArrayList<String>(); // ArrayListQueue2

        needVisit.add(startNode);
        int count = 0;

        // needVisit의 사이즈가 0보다 크면, 아직 방문할 곳이 남았다는 뜻
        while (needVisit.size() > 0) {
            count += 1;
            //현재 방문해야할 리스트에 가장 앞에 있는 값을 꺼낸다.
            String node = needVisit.remove(0);

            // 이미 방문을 한 곳인지 체크 -> 하지 않았다면 조건 실행
            if (!visited.contains(node)) {
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }

        }

        System.out.println(count); // 시간 복잡도
        return visited;
    }
}


