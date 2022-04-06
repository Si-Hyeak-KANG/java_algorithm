package dataStructureSudy.base01;

import java.util.List;

public class MyBST {

    Node head = null;

    /**
     * 노드
     */
    public class Node {

        int value; // data
        Node left; // 왼쪽 노드
        Node right; // 오른쪽 노드

        public Node(int value) {
            this.value = value;
            this.right = null;
            this.left = null;
        }
    }

    /**
     * 노드 추가하기
     * @param data
     * @return 성공하면 true
     */
    public boolean insertNode(int data) {

        Node currNode = this.head;

        if(currNode == null) {

            this.head = new Node(data);
            return true;

        } else {

            // 
            while(currNode != null) {

            }
        }

    }

    /**1
     * 노드 검색하기
     * @param data
     * @return 해당 데이터 반환
     */
    public Node search(int data) {

    }

    /**
     * 노드 삭제하기
     * @param data
     * @return 성공하면 true 반환 + 노드 = null;
     */
    public boolean delete(int data) {

    }

    /**
     * 자료구조 내의 모든 값 출력
     */
    public List<Node> searchAll() {

        return null;
    }

    public static void main(String[] args) {

    }
}
