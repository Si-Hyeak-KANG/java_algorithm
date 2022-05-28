package argorithmStudy.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DFSSearch {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> graph2 = new HashMap<>();

        graph2.put("A", new ArrayList<>(Arrays.asList("B", "C")));
        graph2.put("B", new ArrayList<>(Arrays.asList("A", "D")));
        graph2.put("C", new ArrayList<>(Arrays.asList("A", "G", "H", "I")));
        graph2.put("D", new ArrayList<>(Arrays.asList("B", "E", "F")));
        graph2.put("E", new ArrayList<>(Arrays.asList("D")));
        graph2.put("F", new ArrayList<>(Arrays.asList("D")));
        graph2.put("G", new ArrayList<>(Arrays.asList("C")));
        graph2.put("H", new ArrayList<>(Arrays.asList("C")));
        graph2.put("I", new ArrayList<>(Arrays.asList("C", "J")));
        graph2.put("J", new ArrayList<>(Arrays.asList("I")));

        DFSSearch dObject = new DFSSearch();

        System.out.println(dObject.dfsFunc(graph2,"A"));
    }

    public ArrayList<String> dfsFunc(HashMap<String,ArrayList<String>> graph, String start) {

        ArrayList<String> needVisit = new ArrayList<>(); // 스택으로 진행
        ArrayList<String> visited = new ArrayList<>();

        needVisit.add(start);

        while(needVisit.size() > 0) {
            // 스택 정책에 따라서 마지막 인덱스 값 추출
            String node = needVisit.remove(needVisit.size()-1);

            if(!visited.contains(node)) {
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }

        return visited;

    }
}
