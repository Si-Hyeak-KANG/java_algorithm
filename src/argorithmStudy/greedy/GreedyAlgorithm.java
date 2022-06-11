package argorithmStudy.greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class GreedyAlgorithm {

    public static void main(String[] args) {
        GreedyAlgorithm test = new GreedyAlgorithm();

        ArrayList<Integer> coinList = new ArrayList<Integer>(Arrays.asList(500,100,50,1));
        test.coinFunc(4720, coinList);
    }

    // coinList : 갖고있는 동전 리스트
    public void coinFunc(Integer price, ArrayList<Integer> coinList) {
        Integer totalCoinCount = 0;
        Integer coinNum = 0;

        ArrayList<Integer> details = new ArrayList<>();

        for(int index = 0; index < coinList.size(); index++) {
            coinNum = price / coinList.get(index);
            totalCoinCount += coinNum;
            price -= coinNum * coinList.get(index);

            details.add(coinNum);
            System.out.println(coinList.get(index) + "원: " + coinNum + "개");
        }

        System.out.println("총 동전 갯수: " + totalCoinCount);
    }
}
