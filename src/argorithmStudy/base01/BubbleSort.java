package argorithmStudy.base01;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

    public static void main(String[] args) {

        ArrayList<Integer> dataList = new ArrayList<Integer>();

        dataList.add(2);
        dataList.add(1);
        dataList.add(4);

        for(int i=0; i<dataList.size()-1;i++) {

            if(dataList.get(i) > dataList.get(i+1)) {
                Collections.swap(dataList,i,i+1);
            }

        }

        System.out.println(dataList);

    }
}
