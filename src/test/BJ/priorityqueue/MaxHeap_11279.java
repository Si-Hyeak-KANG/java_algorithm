package test.BJ.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// 소름끼치게도 내부구조가 Heap 으로 이루어진 PriorityQueue 클래스 있음,,,,
public class MaxHeap_11279 {

    // Heap 처럼 사용할 배열을 멤버변수로 선언
    static ArrayList<Integer> myHeap = new ArrayList<>();

    /**
     * 입력값이 0일 경우 값을 꺼내는 메서드
     * @return
     */
    static Integer poll() {

        Integer currRootValue = myHeap.get(1); // 출력할 루트

        int parentIndex = 1;

        while (true) {

            int leftChildIndex = parentIndex * 2;
            int rightChildIndex = parentIndex * 2 + 1;

            int changeChildIndex = 0; // 자리를 바꿀 자식 인덱스

            // 자식 노드 둘다 없을 때
            if(leftChildIndex >= myHeap.size()) {

                myHeap.remove(parentIndex);
                break;

            // 왼쪽 자식 노드와 오른쪽 자식 노드 크기 비교
            // case 1 : 왼쪽 자식 노드만 있을 때
            } else if (rightChildIndex >= myHeap.size()) {

                changeChildIndex = leftChildIndex;

            // case 2 : 둘 다 있을 때
            } else {

                // 2-1 : 왼쪽이 클 때
                if(myHeap.get(leftChildIndex) > myHeap.get(rightChildIndex)) {
                    changeChildIndex = leftChildIndex;
                }
                // 2-2 : 오른쪽이 클 때
                else {
                    changeChildIndex = rightChildIndex;
                }
            }

            Collections.swap(myHeap, parentIndex, changeChildIndex);
            parentIndex = changeChildIndex;
        }

        return currRootValue;

    }

    /**
     * 입력값이 1이상일 경우 Heap 에 데이터 추가 메서드
     * @param newData
     */
    static void insert(int newData) {

        // 배열의 제일 뒤에 데이터 추가
        myHeap.add(newData);

        // 새로 추가한 부분이 root 가 아닐 경우, 만약 기존의 배열에 데이터가 없었다면 새로운 데이터는 root 가 된다.(정렬X)
        if (myHeap.size() > 2) {
            int indexOfNewData = myHeap.size() - 1; // 새로 추가한 데이터의 인덱스

            while (indexOfNewData > 1) {
                // 새로 추가한 데이터가 부모 데이터보다 작은 경우 정렬 X
                if (myHeap.get(indexOfNewData) <= myHeap.get(indexOfNewData / 2)) {
                    break;
                }
                // 새로 추가한 데이터가 부모 데이터보다 큰 경우 자리교체
                Collections.swap(myHeap, indexOfNewData, indexOfNewData / 2);
                indexOfNewData = indexOfNewData / 2; // 자리를 교체한 상태에서 반복 진행
            }
        }
    }

    // 테스트 실행행
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        // 힙의 1/2 인덱스 특성을 활용하기 위해 배열의 0번째 인덱스에는 값을 0을 집어넣는다.
        myHeap.add(0);

        for (int i = 0; i < N; i++) {

            int input = Integer.parseInt(br.readLine());

            // CASE 1: input 이 0일 경우
            if (input == 0) {
                // 1-1) 배열에 저장된 데이터가 없을 경우
                if (myHeap.size() == 1) {
                    sb.append("0").append("\n");
                }
                // 1-2) 배열에 저장된 데이터가 있을 경우
                else {
                    sb.append(poll()).append("\n");
                }
            }
            // CASE 2: input 이 1이상 자연수일 경우
            else {
                insert(input);
            }
        }

        System.out.println(sb);
    }
}
