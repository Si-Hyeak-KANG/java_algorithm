package dataStructureSudy.base01;

import java.util.ArrayList;
import java.util.Collections;

// MAX HEAP 구현
// ArrayList 를 활용해서 구현
public class Heap {

    public ArrayList<Integer> heapArray = null;

    public Heap(Integer data) {
        heapArray = new ArrayList<Integer>();

        heapArray.add(null);
        heapArray.add(data);
    }

    public boolean moveUp(Integer insertIdx) {

        if(insertIdx <= 1) {
            return false;
        }

        Integer parent_idx = insertIdx / 2;

        if(this.heapArray.get(insertIdx) > this.heapArray.get(parent_idx)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean insert(Integer data) {

        Integer insertIdx, parentIdx;

        if(heapArray == null) {
            heapArray = new ArrayList<Integer>();

            heapArray.add(null);
            heapArray.add(data);
            return true;
        }

        heapArray.add(data);

        insertIdx = this.heapArray.size() -1;

        while (this.moveUp(insertIdx)) {
            parentIdx = insertIdx / 2;
            Collections.swap(this.heapArray, insertIdx, parentIdx);
            insertIdx = parentIdx;
        }

        return true;

    }

    // 삭제 및 값 반환
    public Integer pop() {

        Integer returnedData, poppedIdx, leftChildPoppedIdx, rightChildPoppedIdx;

        if(this.heapArray == null) {
            return null;
        } else {
            returnedData = this.heapArray.get(1);

            this.heapArray.set(1, this.heapArray.get(this.heapArray.size() - 1));
            this.heapArray.remove(this.heapArray.size() - 1);

            poppedIdx = 1;

            //CASE 1
            while(this.moveDown(poppedIdx)) {
                leftChildPoppedIdx = poppedIdx * 2;
                rightChildPoppedIdx = poppedIdx * 2 + 1;

                // CASE 2 : 오른쪽 자식 노드만 없을 때
                if(rightChildPoppedIdx >= this.heapArray.size()) {

                    if(this.heapArray.get(poppedIdx) < this.heapArray.get(leftChildPoppedIdx)) {
                        Collections.swap(heapArray, poppedIdx, leftChildPoppedIdx);
                        poppedIdx = leftChildPoppedIdx;
                    }

                } else {
                // CASE 3 : 왼쪽/ 오른쪽 자식 노드 모두 있을 때

                    if(this.heapArray.get(poppedIdx) < this.heapArray.get(rightChildPoppedIdx)) {
                        Collections.swap(heapArray, poppedIdx, rightChildPoppedIdx);
                        poppedIdx = rightChildPoppedIdx;
                    }
                }
            }

            return returnedData;
        }
    }

    public boolean moveDown(Integer poppedIdx) {

        Integer leftChildPoppedIdx, rightChildPoppedIdx;

        leftChildPoppedIdx = poppedIdx * 2;
        rightChildPoppedIdx = poppedIdx * 2 + 1;

        // CASE 1 : 자식 노드가 하나도 없을 때 (왼쪽 자식 노드도 없을 때)
        if(leftChildPoppedIdx >= this.heapArray.size()) {

            return false;

        } else if(rightChildPoppedIdx >= this.heapArray.size()){
        // CASE 2 : 오른쪽 자식 노드만 없을 때
            if(this.heapArray.get(poppedIdx) < this.heapArray.get(leftChildPoppedIdx)) {
                return true;
            } else {
                return false;
            }
        } else {
        // CASE3 : 왼쪽 / 오른쪽 자식 노드가 모두 있을 때
            if(this.heapArray.get(leftChildPoppedIdx) > this.heapArray.get(rightChildPoppedIdx)) {
                if(this.heapArray.get(poppedIdx) < this.heapArray.get(leftChildPoppedIdx)) {
                    return true;
                } else {
                    return  false;
                }
            } else {
                if(this.heapArray.get(poppedIdx) < this.heapArray.get(rightChildPoppedIdx)) {
                    return true;
                } else {
                    return  false;
                }
            }

        }
    }

    public static void main(String[] args) {

        Heap myHeap = new Heap(15);
        myHeap.insert(10);
        myHeap.insert(8);
        myHeap.insert(4);
        myHeap.insert(5);
        myHeap.insert(20);

        System.out.println(myHeap.heapArray);

        myHeap.pop();
        System.out.println(myHeap.heapArray);
    }

}
