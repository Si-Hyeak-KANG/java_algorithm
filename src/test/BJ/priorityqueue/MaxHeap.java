package test.BJ.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MaxHeap {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> myHeap = new ArrayList<>();

        // 힙의 1/2 인덱스 특성을 활용하기 위해 배열의 0번째 인덱스에는 값을 0을 집어넣는다.
        myHeap.add(0);

        for(int i = 0 ; i < N ; i++) {

            int input = Integer.parseInt(br.readLine());
            // 입력값이 0일 경우
            if(input == 0) {

                // case1 : 배열에 값이 없을 경우
                if(myHeap.size() < 2) {
                    sb.append(0).append('\n');
                }
                // case2 : 배열에 값이 있을 경우
                else {
                    // index 1번이 최대값인 root node 이기 때문에 1번 인덱스의 값을 출력
                    sb.append(myHeap.get(1)).append('\n');
                    myHeap.remove(1);
                }

            }
            // 입력값이 1 이상 자연수일 경우 : 배열에 값을 저장
            else if(input > 0) {

                // case1 : root node 에 값이 없을 경우
                if(myHeap.size() < 2) {
                    myHeap.add(input);
                }

                // case 2 : root node 에 값이 있을 경우
                else {
                    myHeap.add(input); // 배열의 마지막 인덱스에 값을 할당
                    int newNodeIndex = myHeap.size()-1; // 새로 추가한 노드의 인덱스

                    // 배열 끝까지 노드들을 비교하며 위치 정렬
                    while(newNodeIndex > 1) {
                        int parentNodeIndex = newNodeIndex / 2; // 새로 추가한 노드의 부모 노드
                        // 2-1 : input 이 부모노드보다 클 경우
                        if(myHeap.get(parentNodeIndex) <= myHeap.get(newNodeIndex)) {
                            Collections.swap(myHeap,parentNodeIndex,newNodeIndex);
                            newNodeIndex = parentNodeIndex;
                        }
                        // 2-2 : input 이 부모노드보다 작을 경우
                        else {
                            break; // 정렬할 필요가 없음
                        }
                    }
                }
            }
        }

        System.out.println(sb);
    }
}
