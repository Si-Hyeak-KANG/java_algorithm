package argorithmStudy.sort;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {

    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {

        for(int i = 1; i < dataList.size(); i++) {

            for(int j = i-1; j > -1; j--) {

                if(dataList.get(i) < dataList.get(j)) {
                    Collections.swap(dataList, i , j);
                    i = j;
                } else {
                    break;
                }
            }

        }
        return dataList;

    }

    public static void main(String[] args) {

        ArrayList<Integer> dataList = new ArrayList<>();

        for(int i = 0; i < 50; i++ ) {
            dataList.add((int)(Math.random() * 100));
        }

        InsertionSort insSort = new InsertionSort();

        System.out.println(insSort.sort(dataList));
    }


}
