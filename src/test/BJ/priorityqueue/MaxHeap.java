package test.BJ.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxHeap {

    static int root = 0;
    static Node node = new Node(root);

    static class MyMaxHeap {

        public void add(int data) {

            // root node 에 값이 0일 경우
            // 배열에 값이 없을 경우와 동일
            if(root == 0) {
                node.value = data;
                root = data;
            }

            while() {
                if(root < data) {

                    node.childNode = node;
                    root = data;
                    node.value = data;

                } else if(root >= data) {

                }
            }
        }

    }

    static class Node {

        int value;
        Node childNode;

        public Node(int value) {
            this.value = value;
            this.childNode = null;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        MyMaxHeap myMaxHeap = new MyMaxHeap();

        for(int i = 0 ; i < N ; i++) {

            int input = Integer.parseInt(br.readLine());

            if(input == 0) {
                sb.append(root).append("\n");
            } else if(input > 0) {
                myMaxHeap.add(input);
            }
        }
    }
}
