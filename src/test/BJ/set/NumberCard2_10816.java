package test.BJ.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * point
 * 1) 상근이 갖고 있는 카드는 중복이 있음
 * 2) 시간을 절약하기 위해서는 상근의 카드를 Hash 에 담고, 비교 카드를 입력하면서 체크해야함.
 * 3) 하지만 Hash 에는 중복이 들어갈 수 없음
 * 4) 그래서 HashMap<key, value> 를 활용
 * 5) 상근이 갖고 있는 카드의 숫자는 key 저장
 * 6) 동일한 숫자 카드를 갖고 있는 수(중복되는 카드) value 저장 => 1장을 갖고 있다면, value 에 1 저장
 * 7) M만큼 순회하면서, 숫자를 임의로 입력
 * 8) 해당 숫자 카드를 상근이가 갖고 있는지 체크한 후, 갖고 있는 개수를 출력(HashMap 의 key 에 맞는 value 출력)
 *
 * 수행시간 1284ms
 */
public class NumberCard2_10816 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 위한 클래스
        StringBuilder sb = new StringBuilder(); // 한번에 출력하기 위한 클래스

        int N = Integer.parseInt(br.readLine()); // 상근의 카드 수

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 갖고있는 카드의 숫자를 키로, 가지고 있는 개수를 value 로 저장
        HashMap<Integer, Integer> sangGeunCardMap = new HashMap<>();

        int count = 1; // 상근이 해당 숫자 카드를 갖고 있는 개수

        for (int i = 0; i < N; i++) {

            int sangGeunCardInput = Integer.parseInt(st.nextToken());

            // 상근 카드 Map 에 input 값이 이미 있을 경우
            if (sangGeunCardMap.containsKey(sangGeunCardInput)) {
                // 중복이므로 value 를 +1 해준다. -> 최종으로 이 값을 출력하는 것이다.
                sangGeunCardMap.put(sangGeunCardInput, sangGeunCardMap.get(sangGeunCardInput) + 1);

            } else { // 그렇지 않을 경우는 중복이 아니므로, input 값을 키, 1인 count를 value에 추가
                sangGeunCardMap.put(sangGeunCardInput, count);
            }
        }

        int M = Integer.parseInt(br.readLine()); // 비교할 숫자 카드 수
        st = new StringTokenizer(br.readLine());

        // 비교할 숫자를 입력하기 위해 M 만큼 반복
        for (int i = 0; i < M; i++) {

            // 비교할 숫자 카드 입력
            int compareCard = Integer.parseInt(st.nextToken());

            // 상근이 입력한 비교할 숫자 카드를 갖고 있다면,
            if (sangGeunCardMap.containsKey(compareCard)) {
                // 해당 숫자 카드를 갖고 있는 개수를 출력 , hashMap 의 value 출력
                sb.append(sangGeunCardMap.get(compareCard)).append(" ");
            } else {

                // 갖고있지 않다면, 0이므로 0 출력
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }
}
