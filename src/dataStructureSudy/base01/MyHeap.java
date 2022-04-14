package dataStructureSudy.base01;

import java.util.ArrayList;
import java.util.Collections;

// Max Heap
public class MyHeap {

    // ArrayList 활용
    public ArrayList<Integer> heapArray = null;

    public MyHeap(Integer data) {

        heapArray = new ArrayList<Integer>();

        heapArray.add(null); // 0번 index는 null
        heapArray.add(data);
    }

    /**
     * 힙에 데이터 삽입하기
     */
    public boolean insert(Integer data) {

        // insertIdx : 추가 인덱스, parentIdx : 부모 인덱스
        Integer insertIdx, parentIdx;

        // 배열 안에 아무것도 없을 때
        if (heapArray == null) {

            // 배열 새로 생성
            heapArray = new ArrayList<Integer>();

            heapArray.add(null); // 0번 인덱스
            heapArray.add(data); // 새로 추가한 데이터를 인덱스 1번에 저장하고, root로 지정

            return true; // 생성 성공 true 반환
        }

        // 배열이 null 이 아닐경우 배열 가장 뒤에 데이터 추가
        heapArray.add(data);

        insertIdx = this.heapArray.size() - 1; // 방금 데이터 추가한 배열의 마지막 인덱스

        // 비교했는데 자식 노드가 부모 노드와 자리를 바꿔야한다면 true
        while (this.moveUp(insertIdx)) {

            parentIdx = insertIdx / 2;

            // Collections 클래스의 swap 메서드를 통해서 자리를 바꿔준다.
            Collections.swap(this.heapArray, insertIdx, parentIdx);
            insertIdx = parentIdx;
        }

        return true;
    }

    /**
     * 추가 노드가 부모 노드와 교체해야하는지 비교하는 메서드
     *
     * @return true / false 만 반환 후 사용한 메서드에서 처리
     */
    public boolean moveUp(Integer insertIdx) {

        // 새로 추가한 데이터의 index 가 root index 이거나, 배열이 null 인 경우
        if (insertIdx <= 1) {
            return false;
        }

        Integer parentIdx = insertIdx / 2; // 부모 노드 인덱스는 자식 노드 인덱스의 1/2 위치함. 소수점은 버림

        // 자식 노드가 부모 노드보다 클 경우 true 반환
        if (this.heapArray.get(insertIdx) > this.heapArray.get(parentIdx)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 힙의 데이터 삭제하기
     *
     * @return root node의 값 반환
     */
    public Integer pop() {

        // value = 반환 값
        // poppedIdx = 교체된 노드의 인덱스 번호
        // leftChildPoppedIdx = 교체된 노드의 왼쪽 자식 노드 인덱스
        // rightChildPoppedIdx = 교체된 노드의 오른쪽 자식 노드 인덱스
        Integer value, poppedIdx, leftChildPoppedIdx, rightChildPoppedIdx;

        // 배열이 null 이면, 반환할 값이 없음
        if (this.heapArray == null) {
            return null;

        } else {
            value = this.heapArray.get(1); // root 노드의 값을 반환할 것임

            // 힙에서 가장 마지막에 있는 데이터를 빈 자리(root)에 채운다.
            this.heapArray.set(1, this.heapArray.get(this.heapArray.size() - 1));
            // 힙의 가장 마지막 노드를 root 로 보냈으니 맨 뒤는 제거한다.
            this.heapArray.remove(this.heapArray.size() - 1);

            poppedIdx = 1;

            // moveDown 메서드를 통해서 자식 노드와 부모 노드를 교환해야하는지 판단
            while (this.moveDown(poppedIdx)) {

                leftChildPoppedIdx = poppedIdx * 2;
                rightChildPoppedIdx = poppedIdx * 2 + 1;

                // 오른쪽 자식 노드만 없을 때
                if(rightChildPoppedIdx >= this.heapArray.size()) {

                        Collections.swap(heapArray, poppedIdx, leftChildPoppedIdx);
                        poppedIdx = leftChildPoppedIdx;

                // 왼쪽/ 오른쪽 자식 노드 모두 있을 때
                } else {

                    // 왼쪽 자식 노드가 오른쪽 자식 노드보다 클 경우
                    if(this.heapArray.get(leftChildPoppedIdx) > this.heapArray.get(rightChildPoppedIdx)) {

                            Collections.swap(heapArray, poppedIdx, leftChildPoppedIdx);
                            poppedIdx = leftChildPoppedIdx;

                    } else {

                            Collections.swap(heapArray, poppedIdx, rightChildPoppedIdx);
                            poppedIdx = rightChildPoppedIdx;

                    }
                }
            }
        }

        return value;
    }

    /**
     * 메서드를 통해서 자식 노드와 부모 노드를 교환해야하는지 판단
     *
     * @return true / false 인지만 반환
     */
    public boolean moveDown(Integer poppedIdx) {

        Integer leftChildPoppedIdx, rightChildPoppedIdx;

        // 왼쪽 자식 노드의 인덱스
        leftChildPoppedIdx = poppedIdx * 2;
        // 오른쪽 자식 노드의 인덱스
        rightChildPoppedIdx = poppedIdx * 2 + 1;


        // 왼쪽 자식 노드가 없을 때(자식 노드가 하나도 없을 때)
        if (leftChildPoppedIdx >= this.heapArray.size()) {
            return false;

        // 오른쪽 자식 노드가 없을 때
        } else if (rightChildPoppedIdx >= this.heapArray.size()) {

            // 교체된 노드의 값보다 교체된 노드의 왼쪽 자식 노드의 값이 클 경우
            if (this.heapArray.get(poppedIdx) < this.heapArray.get(leftChildPoppedIdx)) {
                return true;
            } else {
                return false;
            }

        // 왼쪽 / 오른쪽 자식 노드가 모두 있을 때
        } else {

            // 왼쪽 자식 노드가 오른쪽 자식 노드보다 클 때
            if (this.heapArray.get(leftChildPoppedIdx) > this.heapArray.get(rightChildPoppedIdx)) {

                // 교체된 노드의 값보다 교체된 노드의 왼쪽 자식 노드의 값이 클 경우 true 반환
                if (this.heapArray.get(poppedIdx) < this.heapArray.get(leftChildPoppedIdx)) {
                    return true;
                } else {
                    return false;
                }

            // 오른쪽 자식 노드가 왼쪽 자식 노드보다 클 때
            } else {

                // 교체된 노드의 값보다 교체된 노드의 오른쪽 자식 노드의 값이 클 경우 true 반환
                if (this.heapArray.get(poppedIdx) < this.heapArray.get(rightChildPoppedIdx)) {
                    return true;
                } else {
                    return false;
                }
            }
        }

    }


    public static void main(String[] args) {

        MyHeap heapTest = new MyHeap(15);

        heapTest.insert(10);
        heapTest.insert(8);
        heapTest.insert(9);
        heapTest.insert(8);
        heapTest.insert(2);
        heapTest.insert(4);
        heapTest.insert(5);
        heapTest.insert(3);
        heapTest.insert(7);

        System.out.println(heapTest.heapArray); // [null, 15, 10, 8, 9, 8, 2, 4, 5, 3, 7]

        System.out.println(heapTest.pop()); // 15

        System.out.println(heapTest.heapArray); // [null, 10, 9, 8, 7, 8, 2, 4, 5, 3]

        System.out.println(heapTest.pop()); // 10

        System.out.println(heapTest.heapArray); // [null, 9, 8, 8, 7, 3, 2, 4, 5]


    }
}
