package dataStructureSudy.base01;

public class DoubleLinkedList2<T> {

    private Node<T> head = null;
    private Node<T> tail = null;

    /**
     * 노드 생성
     */
    public class Node<T> {
        T data;
        Node<T> next = null;
        Node<T> prev = null;

        public Node(T data) {
            this.data = data;
        }
    }

    /**
     * 노드 추가
     */
    public void addNode(T data) {
        if(this.head == null) {
            this.head = new Node<T>(data);
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

    /**
     * head로 부터 특정 노드 찾기
     */
    public T searchFromHead(T data) {
        Node<T> node = this.head;
        if(node != null) {
            while (node != null) {
                if(node.data == data) {
                    return node.data;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    /**
     * tail로 부터 특정 노드 찾기
     */
    public T searchFromTail(T data) {
        if(this.head != null) {
            Node<T> node = this.tail;
            while(node != null) {
                if(node.data == data) {
                    return node.data;
                } else {
                    node = node.prev;
                }
            }
        }
        return null;
    }

    /**
     * 노드 중간에 새로운 노드 삽입
     * 지정한 데이터 앞에 연결
     */
    public boolean insertNode(T data, T isData) {
        Node<T> node = this.head;

        if(node == null) {

            node = new Node<T>(data);
            this.tail = node;
            return true;

        } else if(node.data == isData) {

            Node<T> newHead = new Node<T>(data);
            newHead.next = node;
            this.head = newHead;
            return true;

        } else {

            while(node != null) {
                if(node.data == isData) {

                    Node<T> nodePrev = node.prev;

                    nodePrev.next = new Node<T>(data);
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

    /**
     * 데이터 전체 출력
     */
    public void printAll() {

        if(this.head != null) {
            Node<T> node = this.head;
            System.out.print(node.data + " ");

            while(node.next != null) {
                node = node.next;
                System.out.print(node.data + " ");
            }

            System.out.println();
        }else {
            System.out.println("데이터가 없습니다.");
        }
    }

    /**
     * 노드 삭제
     */


    public static void main(String[] args) {
        DoubleLinkedList2<Integer> myDoubleLink = new DoubleLinkedList2<Integer>();

        myDoubleLink.addNode(1);
        myDoubleLink.addNode(2);
        myDoubleLink.addNode(3);
        myDoubleLink.addNode(4);
        myDoubleLink.addNode(10);

        myDoubleLink.printAll();

        System.out.println(myDoubleLink.searchFromHead(2));
        System.out.println(myDoubleLink.searchFromTail(4));

        myDoubleLink.insertNode(7, 1);
        myDoubleLink.insertNode(8, 4);
        myDoubleLink.printAll();
    }
}
