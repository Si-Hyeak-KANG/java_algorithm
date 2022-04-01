package dataStructureSudy.base01;

// 이진 탐색 트리
public class BinarySearchTree {

    Node head = null;

    public class Node {

        Node left;
        Node right;
        int value;

        public Node(int data) {
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        // CASE:1 Node 가 하나도 없을 때
        if(this.head == null) {

            this.head = new Node(data);

        } else { // CASE2: Node 가 하나 이상 들어가 있을 때

            Node findNode = this.head;

            while(true) {
                // CASE2-1 : 현재 Node 의 왼쪽에 Node 가 들어가야할 때
                if(data < findNode.value) {

                    if(findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }
                // CASE2-2 : 현재 Node 의 오른쪽에 Node 가 들어가야 할 때
                } else {

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
        //CASE1 : Node 가 하나도 없을 때
        if(this.head == null) {
            return null;
        } else { //CASE2 : Node 가 하나 이상 있을 때
            Node findNode = this.head; // Root Node

            while(findNode != null) {
                if(findNode.value == data) {
                    return findNode;
                } else if(data < findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }
            return null;
        }

    }

    public boolean delete(int value) {
        boolean searched = false;

        Node currParentNode = this.head; // 부모 노드
        Node currNode =this.head; // 삭제 노드

        // 코너(예외) 케이스1 : Node 가 하나도 없을 때
        if(this.head == null) {
            return false;
        } else {
        // 코너 케이스2 : Node 가 단지 하나만 있고, 해당 Node 가 삭제할 Node 일 때
            if(this.head.value == value
                    && this.head.left == null
                    && this.head.right == null) {

                this.head = null;
                return true;
            }

            while(currNode != null) {
                if(currNode.value == value) {
                    searched = true;
                    break;
                } else if(value < currNode.value) {
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
        }

        // 여기까지 실행되면,
        // currNode 에는 해당 데이터를 가지고 있는 Node,
        // currNodeParentNode 에는 해당 데이터를 가지고 있는 Node 의 부모 Node

        // Case1 :  삭제할 Node 가 Leaf Node 인 경우
        if(currNode.left == null && currNode.right == null) {
            if(value < currParentNode.value) {
                currParentNode.left = null;
                currNode = null;
            } else {
                currParentNode.right = null;
                currNode = null;
            }

            return true;
        } else if(currNode.left != null && currNode.right == null) {
        // Case2-1 : 삭제할 Node 가 Child Node 를 한 개 갖고 있을 때(왼쪽에 Child 가 있을 경우)

            if(value < currParentNode.value) {
                currParentNode.left = currNode.left;
                currNode = null;
            } else {
                currParentNode.right = currNode.left;
                currNode = null;
            }

            return true;

        } else if (currNode.left == null && currNode.right != null) {
        // Case2-2 : 삭제할 Node 가 Child Node 를 한 개 갖고 있을 때(오른쪽에 Child 가 있을 경우)

            if(value < currParentNode.value) {
                currParentNode.left = currNode.right;
                currNode = null;
            } else {
                currParentNode.right = currNode.right;
                currNode = null;
            }
            return true;

        } else {
        // Case3 : 삭제할 Node 가 Child Node 를 두 개 가지고 있고,

            // Case3-1 : 삭제할 Node 가 부모 Node 의 왼쪽에 있을 때
            if(value < currParentNode.value) {
                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;

                while(changeNode.left != null) {
                    changeParentNode = changeNode;
                    changeNode = changeNode.left;
                }

                // 여기까지 실행되면, changeNode 에는 삭제할 Node 의 오른쪽 Node 중에서,
                // 가장 작은 값을 가진 Node 가 들어있음

                // Case 3-1-2 : changeNode 의 오른쪽 Child Node 가 있을 때
                if(changeNode.right != null) {
                    changeParentNode.left = changeNode.right;
                } else {
                // Case 3-1-1 : changeNode 의 child Node 가 없을 때
                    changeParentNode.left = null;
                }

                // currParentNode 의 왼쪽 Child Node 에, 삭제할 Node 의 오른쪽 자식중,
                // 강장 작은 값을 가진 changeNode 를 연결
                currParentNode.left = changeNode;

                //parentNode 의 왼쪽 Child Node 가 현재, changeNode 이고,
                // changeNode 의 왼쪽/오른쪽 Child Node 를 모두, 삭제할 currNode 의
                // 기존 왼쪽/오른쪽 Node 로 변경
                changeNode.right = currNode.right;
                changeNode.left = currNode.left;

                currNode = null;
            } else {
            // Case3-2: 삭제할 Node 가 Child Node 를 두개 가지고 있고, 삭제할 Node 가 부모 Node 의 오른쪽에 있을 때
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

                changeNode.right = currNode.right;
                changeNode.left = currNode.left;

                currNode = null;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree myTree = new BinarySearchTree();
        myTree.insertNode(10);
        myTree.insertNode(6);
        myTree.insertNode(5);
        myTree.insertNode(7);
        myTree.insertNode(8);
        myTree.insertNode(15);
        myTree.insertNode(14);
        myTree.insertNode(19);
        myTree.insertNode(16);
        myTree.insertNode(17);
        myTree.insertNode(20);
        myTree.insertNode(3);

        System.out.println(myTree.delete(5));

        System.out.println("HEAD: " + myTree.head.value);
        System.out.println("HEAD LEFT: " + myTree.head.left.value);
        System.out.println("HEAD LEFT LEFT: " + myTree.head.left.left.value);
        System.out.println("HEAD LEFT RIGHT: " + myTree.head.left.right.value);

        System.out.println("HEAD RIGHT: " + myTree.head.right.value);
        System.out.println("HEAD RIGHT LEFT: " + myTree.head.right.left.value);
        System.out.println("HEAD RIGHT RIGHT: " + myTree.head.right.right.value);

        System.out.println("HEAD RIGHT RIGHT LEFT: " + myTree.head.right.right.left.value);
        System.out.println("HEAD RIGHT RIGHT RIGHT: " + myTree.head.right.right.right.value);



    }
}
