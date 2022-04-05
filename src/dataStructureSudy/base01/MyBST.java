package dataStructureSudy.base01;

public class MyBST {

    Node head = null;

    public class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.right = null;
            this.left = null;
        }
    }

    public boolean insertNode(int data) {
        // C1) Node 가 하나도 없을 때
        if(this.head == null) {
            this.head = new Node(data);
        } else {
        // C2) Node 가 하나 이상 들어가 있을 때
            Node findNode = this.head;

            while(true) {
                // C2-1) 현재 Node 의 왼쪽에 Node 가 들어가야할 때
                if(data < findNode.value) {

                    if(findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }
                } else {
                // C2-2) 현재 Node 의 오른쪽에 Node 가 들어가야할 때
                    if(findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }

        return true;
    }

    public Node search(int data) {
        // C1) Node 가 하나도 없을 대
        if(this.head == null) {
            return null;
        } else {
        // C2) Node 가 하나 이상 있을 때
            Node findNode = this.head;

            while(findNode != null) {
                if(findNode.value == data) {
                    return findNode;
                } else if (data < findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }

            return null;
        }
    }

    public boolean delete(int data) {

        boolean searched = false;

        Node currParentNode = this.head; // 부모 노드
        Node currNode = this.head; // 삭제 노드

        // EXCEPTION CASE 1 : Node 가 하나도 없을 때
        if(this.head == null) {
            return false;
        } else {
            // EXCEPTION CASE 2 : Ndoe 가 하나만 있고, 해당 Node 가 삭제할 Node 일 때
            if (this.head.value == data
            && this.head.left == null
            && this.head.right == null) {

                this.head = null;
                return true;
            }

            while(currNode != null) {
                // 당장 head가 삭제할 노드의 데이터일 경우
                if(currNode.value == data) {
                    searched = true;
                    break;
                } else if(data < currNode.value) {
                    currParentNode = currNode;
                    currNode = currNode.left;
                } else {
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }

            if(searched == false) {
                return false;
            }
        } // searched == true

        // CASE 1 : 삭제할 노드가 Leaf Node 인 경우
        if(currNode.left == null && currNode.right == null) {

            // data가 부모 노드의 값보다 작을 경우
            if(data < currParentNode.value) {
                currParentNode.left = null;
                currNode = null; // 가독성을 높이기 위해 작성
            } else {
                currParentNode.right = null;
                currNode = null;
            }
        }


    }

}
