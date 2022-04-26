package argorithmStudy.sort;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {

        for(int i = 0; i < dataList.size(); i++) {

            Integer MinNum = i; // 최소 값을 가진 index

            for(int j = i ; j < dataList.size() ; j++) {

                if(dataList.get(MinNum) > dataList.get(j)) {
                    MinNum = j;
                }
            }

            Collections.swap(dataList, i, MinNum);
        }

        return dataList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> dataList = new ArrayList<>();

        dataList.add(1);
        dataList.add(3);
        dataList.add(5);
        dataList.add(2);
        dataList.add(10);
        dataList.add(25);
        dataList.add(25);

        System.out.println(dataList); // [1,3,5,2,10,25,18]

        SelectionSort sortTest = new SelectionSort();

        System.out.println(sortTest.sort(dataList)); // [1,2,3,5,10,18,25]

        System.out.println();
    }

}
