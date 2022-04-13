package dataStructureSudy.base01;

import java.util.ArrayList;
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

        boolean searched = false;

        Node currParentNode = this.head;
        Node currNode = this.head;

        // 예외 케이스 : Node 가 하나도 없을 때
        if(this.head == null) {
            return false;
        } else { // Node 가 하나 이상일 때

            // Node 가 단지 하나만 있고, 해당 Node 가 삭제할 Node 일 때
            if(this.head.value == data
            & this.head.left == null
            & this.head.right == null) {

                this.head = null;
                return true;
            }

            // 찾는 데이터가 있는지 찾음
            while(currNode != null) {

                if(currNode.value == data) {
                    searched = true;
                    break;
                } else if( data < currNode.value) {
                    currParentNode = currNode;
                    currNode = currNode.left;
                } else {
                    currParentNode = currNode;
                    currNode  = currNode.right;
                }
            }
            // currNode 는 삭제할 노드가 된다.
            // currParentNode 는 삭제할 노드의 부모 노드가 된다.

            // 모든 노드를 순회해도 찾는 데이터가 없을 경우
            if(searched == false) {
                return false;
            }
        }

        // CASE 1 : 삭제할 노드가 Leaf Node 일 경우
        if(currNode.left == null && currNode.right == null) {

            // 1-1 : 삭제할 데이터가 부모 노드의 데이터보다 작을 때
            if(data < currParentNode.value) {
                currParentNode.left = null; // 부모 노드의 왼쪽 노드를 null로 만든다.
                currNode = null; // 위와 동일한 코드 내용, 삭제할 노드를 null로 만든다.
            }  else { // 1-2 : 삭제할 데이터가 부모 노드의 데이터와 같거나 클 때
                currParentNode.right = null;
                currNode = null;
            }

            return true;

        // CASE 2 : 삭제할 노드가 왼쪽 자식 노드만 갖고 있을 때
        } else if(currNode.left != null && currNode.right == null) {

            if(data < currParentNode.value) { // 2-1 : 삭제할 데이터가 부모 데이터보다 작을 경우
                currParentNode.left = currNode.left; // 삭제할 노드의 부모 노드의 왼쪽 자식 노드는 삭제할 노드의 왼쪽 자식 노드로 연결된다.
                currNode = null; // 삭제하려했던 노드를 null 로  지정한다.
            } else { // 2-2 : 삭제할 데이터가 부모 데이터와 같거나 클 때
                currParentNode.right = currNode.left; // 삭제할 노드의 부모 노드의 오른쪽 자식 노드는 삭제할 노드의 왼쪽 자식 노드로 연결된다.
                currNode = null; // 삭제하려했던 노드를 null 로  지정한다.
            }

            return true;

        // CASE 3 : 삭제할 노드가 오른쪽 자식 노드만 갖고 있을 때
        } else if(currNode.left == null && currNode.right != null) {

            if(data < currParentNode.value) { // 3-1 : 삭제할 데이터가 부모 데이터보다 작을 경우
                currParentNode.left = currNode.right; // 삭제할 노드의 부모 노드의 왼쪽 자식 노드는 삭제할 노드의 오른쪽 자식 노드와 연결됨.
                currNode = null; // 삭제하려던 노드를 null 로 지정한다.
            } else { // 3-2 : 삭제할 데이터가 부모 데이터보다 클 경우
                currParentNode.left = currNode.right; // 삭제할 노드의 부모 노드의 오른쪽 자식 노드는 삭제할 노드의 오른쪽 자식 노드와 연결됨.
                currNode = null; // 삭제하려던 노드를 null 로 지정한다.

            }

            return true;

        // CASE 4 : 삭제할 노드가 왼쪽, 오른쪽 자식 둘다 가질 때
        } else {

            // 4-1 : 삭제할 데이터가 부모 데이터보다 작을 때
            if(data < currParentNode.value) {

                // TIP 삭제할 노드의 오른쪽에서 가장 작은 수가 삭제할 노드의 자리를 대체한다. -> 오른쪽 자식 노드의 왼쪽 가장 끝
                Node changeNode = currNode.right; // 삭제할 노드로 이동할 노드
                Node changeParentNode = currNode.right;

                while(changeNode.left != null) {
                    changeParentNode = changeNode;
                    changeNode = changeNode.left;
                }

                // 대체 노드가 오른쪽 자식 노드를 갖고 있을 때(왼쪽 자식 노드는 갖고 있을 수가 없음)
                if(changeNode.right != null) {
                    changeParentNode.left = changeNode.right;
                } else { // 대체 노드가 오른쪽 자식 노드를 갖고 있지 않을 경우
                    changeParentNode.left = null;
                }

                // 삭제할 데이터가 부모 데이터보다 작기 때문에 부모 노드의 왼쪽 자식에 대체 노드로 대체한다.
                currParentNode.left =  changeNode;

                // 삭제하기 전 삭제 노드와 연결되었던 노드들을 대체한 노드와 다시 연결한다.
                changeNode.left = currNode.left;
                changeNode.right = currNode.right;

                // 삭제할 노드는 null 로 지정한다.
                currNode = null;

            // 4-2 : 삭제할 데이터가 부모 데이터와 같거나 클 때
            } else {

                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;

                while(changeNode.left != null) {
                    changeParentNode = changeNode;
                    changeNode = changeNode.left;
                }

                if(changeNode.right != null) {
                    changeParentNode.left = changeNode.right;
                } else {
                    changeParentNode.left = null;
                }

                currParentNode.right = changeNode;
                changeNode.left = currNode.left;
                changeNode.right = currNode.right;

                currNode = null;
            }

            return true;
        }
    }

    /**
     * 테스트 실행
     */
    public static void main(String[] args) {

        MyBST testBst = new MyBST();

        testBst.insertNode(14);
        testBst.insertNode(8);
        testBst.insertNode(4);
        testBst.insertNode(11);
        testBst.insertNode(1);
        testBst.insertNode(6);
        testBst.insertNode(10);
        testBst.insertNode(13);
        testBst.insertNode(18);
        testBst.insertNode(16);
        testBst.insertNode(25);
        testBst.insertNode(24);
        testBst.insertNode(30);
        testBst.insertNode(15);
        testBst.insertNode(17);

        // 14
        // 8 18
        // 4 11 16 25
        // 1 6 10 13 15 17 24 30

        testBst.delete(11); // 11 삭제

        // 8의 오른쪽 자식은 13이 나와야함
        System.out.println(testBst.search(8).right.value); // 13

        /*
        System.out.println(testBst.head.value);
        System.out.println(testBst.head.left.value + " " + testBst.head.right.value);
        System.out.println(testBst.head.left.left.value
                + " " + testBst.head.left.right.value
                + " " + testBst.head.right.left.value
                + " " + testBst.head.right.right.value);
        System.out.println(testBst.head.left.left.left.value
                + " " + testBst.head.left.left.right.value
                + " " + testBst.head.left.right.left.value
                + " " + testBst.head.left.right.right.value
                + " " + testBst.head.right.left.left.value
                + " " + testBst.head.right.left.right.value
                + " " + testBst.head.right.right.left.value
                + " " + testBst.head.right.right.right.value);
        */


    }
}
