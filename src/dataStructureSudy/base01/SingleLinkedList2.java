package dataStructureSudy.base01;

public class SingleLinkedList2<T> {

    private Node<T> head = null;

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
    public void addNode(T data) {

        if(this.head == null)  {
            this.head = new Node<T>(data);
        } else {
            while(this.head.next != null) {

            }
        }
    }

    /**
     * 데이터 전체 출력
     */

    /**
     * 리스트 중간에 데이터 삽입
     */

    /**
     * 노드 삭제
     */

}
