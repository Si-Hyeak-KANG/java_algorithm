package test.BJ.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//3 1 0 5 4 2 1 2 3 4 6 0 1 1 9 1 1 1 // 1 2 5
public class PrinterQueue_1966 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        // 테스트 케이스 입력
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {

            st = new StringTokenizer(br.readLine());
            int countOfChar = Integer.parseInt(st.nextToken()); // 문자의 개수
            int indexOfChar = Integer.parseInt(st.nextToken()); // 몇 번째로 인쇄되었는지 궁금한 문서의 현재 Queue 에서의 위치
            ArrayList<Integer> myPrinter = new ArrayList<>();

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < countOfChar; j++) {

                myPrinter.add(Integer.parseInt(st.nextToken()));
            }

            int count = 0;

            while(myPrinter.size() > 0) {

                int priorityOfCurrentChar = myPrinter.get(indexOfChar);
                int maxPriority = myPrinter.stream().mapToInt(m -> m).max().getAsInt();

                // 선택 문서가 가장 높은 중요도를 가졌을 때
                if (priorityOfCurrentChar == maxPriority) {

                    // ex) 1 1 1 1 '1'
                    if(indexOfChar!=0 && myPrinter.get(0) == priorityOfCurrentChar) {
                        count += indexOfChar;
                    } else {
                        // 지금까지의 count 에서 +1 후 출력 -> 우리가 원하는 결과
                        count+=1;
                    }

                    sb.append(count).append('\n');
                    break;

                } else { // 선택 문서가 가장 높은 중요도가 아닐경우

                    int maxIndex = myPrinter.indexOf(maxPriority);
                    myPrinter.remove(maxIndex);
                    count++;
                    // 1) 가장 높은 중요도를 가장 앞으로 보냈다고 가장하고, 출력(제거)
                    if(maxIndex != 0){
                        // 2) 가장 앞에 있는 수를 인덱스 마지막으로 이동
                        int temp = myPrinter.get(0);
                        myPrinter.add(temp);
                        myPrinter.remove(0);
                    }
                    // 선택 문서가 0번째라면 제일 배열 끝으로 보내준 것을 적용시켜줘야함.
                    if(indexOfChar == 0) {
                        indexOfChar = myPrinter.size()-1;
                    } else {// 0번째가 아니라면 그냥 위치 한칸으로 이동한 값을 적용 ; -1
                        if(maxIndex < indexOfChar && maxIndex != 0) {
                            indexOfChar -= 2;
                        } else {
                            indexOfChar -= 1;
                        }
                    }
                }
            }

        } // testCase for문

        System.out.println(sb);
    }
}

