package argorithmStudy.search;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

    // 해당 데이터 유무. true / false
    public boolean searchFunc(ArrayList<Integer> dataList, Integer searchItem) {

        // 데이터가 하나 밖에 없을 경우
        // case 1 : 0번 데이터가 찾는 데이터일 경우
        if (dataList.size() == 1 && searchItem == dataList.get(0)) {
            return true;
        }
        // case 2 : 찾는 데이터가 아닌 경우
        if (dataList.size() == 1 && searchItem != dataList.get(0)) {
            return false;
        }

        // 데이터가 null 일 경우
        if (dataList.size() == 0) {
            return false;
        }

        // 리스트의 중간 index
        int medium = dataList.size() / 2;

        // 중간 데이터가 찾는 데이터일 경우
        if (searchItem == dataList.get(medium)) {
            return true;
        } else {
            if (searchItem < dataList.get(medium)) {
                return this.searchFunc(new ArrayList<Integer>(dataList.subList(0, medium)), searchItem);
            } else {
                return this.searchFunc(new ArrayList<Integer>(dataList.subList(medium, dataList.size())), searchItem);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();

        for (int index = 0; index < 100; index++) {
            testData.add((int) (Math.random() * 100));
        }

        Collections.sort(testData);
        System.out.println(testData);

        BinarySearch bs = new BinarySearch();
        System.out.println(bs.searchFunc(testData, 2));
    }
}
