package dataStructureSudy.base01;

import java.util.ArrayList;
import java.util.List;

public class MyBST {

    Node head = null;

    /**
     * 노드
     */
    public class Node {

        int value = -1; // data
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
     *
     * @param data
     * @return 성공하면 true
     */
    public boolean insertNode(int data) {

        // 노드가 한 개도 없을 때
        if (this.head == null) {

            this.head = new Node(data);

        } else { // 노드가 한 개 이상 있을 때

            Node currNode = this.head;

            while (true) {

                // 추가하는 데이터가 비교 데이터보다 작을 때
                if (data < currNode.value) {

                    // 비교 노드의 왼쪽이 null 일 경우
                    if (currNode.left != null) {
                        currNode = currNode.left;
                    } else { // null 이 아닐 경우 비교 노드를 왼쪽 노드로 이동한 후 다시 비교한다.
                        currNode.left = new Node(data);
                        break;
                    }

                } else { // 비교 데이터보다 크거나 같을 때

                    // 비교 노드의 오른쪽이 null 일 경우
                    if (currNode.right != null) {
                        currNode = currNode.right;
                    } else {    // 이미 데이터가 있을 경우
                        currNode.right = new Node(data);
                        break;
                    }
                }
            }
        }

        return true;
    }

    /**
     * 노드 검색하기
     *
     * @param data
     * @return 해당 데이터 반환
     */
    public Node search(int data) {

        Node currNode = this.head;

        while (currNode != null) {

            if (data == currNode.value) {
                return currNode;
            } else {

                if(data < currNode.value) {
                    currNode = currNode.left;
                } else {
                    currNode = currNode.right;
                }
            }
        }
        return null;
    }

    /**
     * 노드 삭제하기
     *
     * @param data
     * @return 성공하면 true 반환 + 노드 = null;
     */
    public boolean delete(int data) {

        return false;
    }

    /**
     * 테스트 실행
     */
    public static void main(String[] args) {

        MyBST testBst = new MyBST();

        testBst.insertNode(10);
        testBst.insertNode(2);
        testBst.insertNode(3);
        testBst.insertNode(15);
        testBst.insertNode(30);
        testBst.insertNode(12);
        testBst.insertNode(1);

        System.out.println(testBst.search(15).left.value);

        System.out.println(testBst.head.value);
        System.out.println(testBst.head.left.value + " " + testBst.head.right.value);
        System.out.println(testBst.head.left.left.value
                + " " + testBst.head.left.right.value
                + " " + testBst.head.right.left.value
                + " " + testBst.head.right.right.value);



    }
}
