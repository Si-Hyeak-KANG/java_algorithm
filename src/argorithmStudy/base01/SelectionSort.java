package argorithmStudy.base01;

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

        for(int i = 0; i<50; i++) {
            dataList.add((int)(Math.random() * 100));
        }

        SelectionSort sortTest = new SelectionSort();

        System.out.println(sortTest.sort(dataList));
    }

}
