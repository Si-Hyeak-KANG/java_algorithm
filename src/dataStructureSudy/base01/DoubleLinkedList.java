package dataStructureSudy.base01;

public class DoubleLinkedList<T> {

    public Node<T> head = null;
    public Node<T> tail = null; // single과 다르게 뒷부분의 노드를 명시

    public class Node<T> {
        T data;
        Node<T> prev = null; // 앞에 있는 노드를 가리키는 변수
        Node<T> next = null; // 다음 노드를 가리키는 변수

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {

        if(this.head == null) {
            this.head = new Node<T>(data);
            this.tail = this.head;
        } else {
            Node<T> node = this.head;
            while(node.next != null) {
                node = node.next;
            }

            node.next = new Node<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll() {
        if(this.head != null) {
            Node<T> node = this.head;
            System.out.print(node.data + " ");

            while(node.next != null) {
                node = node.next;
                System.out.print(node.data + " ");
            }

        }
    }

    /**
     * head 부터 특정 노드를 찾는 메서드
     */
    public T searchFromHead(T isData) {
        if (this.head != null) {
            Node<T> node = this.head;

            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.next;
                }
            }

        }
        return null;
    }

    /**
     * tail 부터 특정 노드를 찾는 메서드
     */
    public T searchFromTail(T isData) {
        if (this.head != null) {
            Node<T> node = this.tail;

            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.prev;
                }
            }

        }
        return null;
    }

    /**
     * 지칭한 노드의 앞에 새로운 노드 추가
     * @param existedData : 해당 데이터를 가진 노드 지칭
     * @param addData : 새로 추가할 노드의 데이터
     * @return : 노드를 추가할 수 이 있을 때는 true, 실패일 때는 false
     */
    public boolean insertToFront(T existedData, T addData) {

        if(this.head == null) { // head가 없을 경우, linkedList에 데이터가 없을 경우
            this.head = new Node<T>(addData);
            this.tail = this.head;
            return true;
        } else if(this.head.data == existedData){ // 우리가 찾는 노드가 head일 경우
            Node<T> newHead = new Node<T>(addData);
            newHead.next = this.head;
            this.head = newHead;
            return true;
        } else { // 찾는 노드가 head가 아닌 중간 노드일 경우
            Node<T> node = this.head;

            while(node != null) {
                if(node.data == existedData) {
                    Node<T> nodePrev = node.prev;

                    nodePrev.next = new Node<T>(addData);
                    nodePrev.next.next = node;

                    nodePrev.next.prev = nodePrev;


                    return true;
                } else {
                    node = node.next;
                }
            }
            return false;
        }

    }

    public static void main(String[] args) {

        DoubleLinkedList<Integer> MyLinkedList = new DoubleLinkedList<Integer>();

        MyLinkedList.addNode(2);
        MyLinkedList.addNode(5);
        MyLinkedList.addNode(6);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(9);
        MyLinkedList.addNode(10);
        MyLinkedList.addNode(1);

        MyLinkedList.printAll();
        System.out.println();

        System.out.println(MyLinkedList.searchFromHead(6));
        System.out.println(MyLinkedList.searchFromTail(10));

        MyLinkedList.insertToFront(1,44);

        MyLinkedList.printAll();
        System.out.println();

        System.out.println(MyLinkedList.insertToFront(7,33));
        MyLinkedList.printAll();

    }
}
