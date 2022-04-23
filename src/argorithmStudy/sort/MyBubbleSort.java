package argorithmStudy.sort;

import java.util.ArrayList;
import java.util.Collections;

public class MyBubbleSort {

    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {

        for(int i=0; i < dataList.size() - 1; i++) {

            boolean swap = false;

            for (int j = 0; j < dataList.size()-1-i; j++) {

                if (dataList.get(j) > dataList.get(j + 1)) {

                    Collections.swap(dataList, j, j + 1);
                    swap = true;
                }

            }

            if(swap == false) {
                break;
            }
        }
        return dataList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        array.add(3);
        array.add(2);
        array.add(6);
        array.add(5);
        array.add(1);

        MyBubbleSort bsTest = new MyBubbleSort();

        System.out.println(bsTest.sort(array));

    }
}
