package dataStructureSudy.base01;

public class SingleLinkedList<T> {

    public Node<T> head = null;

    /**
     * Node 구현
     */
    public class Node<T> {
        T data;
        Node<T> next = null; // pointer

        public Node(T data) {
            this.data = data;
        }
    }

    /**
     * Node 추가 로직 구현
     */
    public void addNode(T data) {

        if(head == null) { // head가 null이면 첫 Node라는 뜻
            head = new Node<T>(data);
        } else {

            Node<T> node = this.head;

            while (node.next != null) {
                node = node.next;
            }

            node.next = new Node<T>(data);

        }
    }

    /**
     * list 내의 데이터 전체 출력
     */
    public void printAll() {
        if(head != null) {
            Node<T> node = this.head;
            System.out.print(node.data + " ");

            while(node.next != null) {
                node = node.next;
                System.out.print(node.data + " ");
            }
        } else {
            System.out.println("데이터가 없습니다.");
        }
    }

    /**
     * list 중간에 데이터 추가 로직
     * @param data : 새로 넣어줄 data
     * @param isData : 앞에 위치한 노드가 갖는 data
     */
    public void addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.search(isData);

        if(searchedNode == null) { // 데이터를 갖는 노드가 없을 경우
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;
        }
    }

    public Node<T> search(T data) {
        if(this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while(node.data != null) {
                if(node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    /**
     * 노드 삭제 로직
     */
    public boolean delNode(T isData) {
        if (this.head == null) {
            return false;
        } else {

            Node<T> node = this.head;

            if (node.data == isData) {
                this.head = this.head.next;
                return true;
            } else {
                while(node.next != null) {
                    if(node.next.data == isData) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }

                return false;
            }
        }
    }

    public static void main(String[] args) {

        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();

        MyLinkedList.addNode(1);

        System.out.println(MyLinkedList.head.data); // 1
        System.out.println(MyLinkedList.head.next); // null

        MyLinkedList.addNode(2);

        System.out.println(MyLinkedList.head.next); // 두번째 노드 주소
        System.out.println(MyLinkedList.head.next.data); // 두번째 노드 데이터

        MyLinkedList.addNode(3);

        MyLinkedList.printAll();

        System.out.println();

        MyLinkedList.addNodeInside(5,1);
        MyLinkedList.addNodeInside(6,3);

        MyLinkedList.printAll();

        System.out.println();

        MyLinkedList.delNode(3);

        MyLinkedList.printAll();

        System.out.println();

        MyLinkedList.delNode(1);

        MyLinkedList.printAll();
    }
}
