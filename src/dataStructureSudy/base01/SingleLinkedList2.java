package dataStructureSudy.base01;

public class SingleLinkedList2<T> {

    public Node<T> head = null;

    /**
     * 노드 생성
     */
    public class Node<T> {

        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    /**
     * 노드 추가
     */
    public void addNode(T data){

        if(this.head == null) {
            this.head = new Node<T>(data);
        } else {
            Node<T> node = this.head;

            while(node.next != null) {
                node = node.next;
            }

            node.next = new Node<T>(data);
        }
    }

    /**
     * 데이터 전체 출력
     */
    public void printAll() {
        if(head != null) {
            Node<T> node = this.head;
            System.out.print(node.data + " ");

            while(node.next != null) {
                node = node.next;
                System.out.print(node.data + " ");
            }

            System.out.println();
        } else {
            System.out.println("데이터가 없습니다.");
        }
    }

    /**
     * 리스트 중간에 데이터 삽입
     */
    public void insertNode(T data, T isData) {
        Node<T> searchedNode = this.search(isData); // 찾는 데이터를 갖은 node

        if(searchedNode == null) {
            this.addNode(data); // 찾는 데이터를 갖은 node가 없으면, 저장할 데이터를 제일 뒤에 저장
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;
        }

    }

    public Node<T> search(T data) {

        if(this.head != null) {
            Node<T> node = this.head;
            while(node.data != null) {
                if(node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
        }
        return null; // this.head가 null일 경우
    }

    /**
     * 노드 삭제
     */
    public boolean delNode(T data) {

        if(this.head != null) {
            Node<T> node = this.head;

            if(node.data == data) {
                node = node.next;
                return true;
            } else {

                while(node.next != null) {

                    if(node.next.data == data) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }

                return false; // 일치하는 data가 없을 시
            }
        }
        return false; // 데이터가 없을 시, 삭제 실패
    }

    public static void main(String[] args) {
        SingleLinkedList2<Integer> myLink = new SingleLinkedList2<>();

        myLink.addNode(1);
        myLink.addNode(2);
        myLink.addNode(3);

        myLink.printAll();

        myLink.insertNode(4,2);
        myLink.printAll();

        myLink.delNode(2);
        myLink.printAll();
    }

}
