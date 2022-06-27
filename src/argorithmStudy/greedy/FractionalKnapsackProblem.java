package argorithmStudy.greedy;

import java.util.Arrays;
import java.util.Comparator;

// 부분 배낭 문제
public class FractionalKnapsackProblem {

    public static void main(String[] args) {

        Integer[][] objectList = {{30,5},{15,12},{20,10},{25,8},{10,10}};

        FractionalKnapsackProblem test = new FractionalKnapsackProblem();
        test.knapsackFunc(objectList, 30.0);

    }

    public void knapsackFunc(Integer[][] objectList, double capacity) {
        double totalValue = 0.0;
        double fraction = 0.0;

        Arrays.sort(objectList, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return (o2[1]/ o2[0]) - (o1[1]/o1[0]);
            }
        });

        for(int index = 0; index < objectList.length; index++) {

            // 물건을 쪼깰 필요가 없을 때
            if( (capacity - (double) objectList[index][0]) > 0) {

                capacity -= (double) objectList[index][0];
                totalValue += (double) objectList[index][1];
                System.out.println("무게: " + objectList[index][0] + ", 가치:" + objectList[index][1]);
            } else { // 물건을 쪼개야 할 때

                fraction = capacity / (double) objectList[index][0];
                totalValue += (double) objectList[index][1] * fraction;

                System.out.println("무게: " + objectList[index][0] + ", 가치:" + objectList[index][1] + ",비율: " + fraction);
                break;
            }
        }
        System.out.println("총 담을 수 있는 가치: "+ totalValue);
    }
}
