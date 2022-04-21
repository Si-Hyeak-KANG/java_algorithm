package argorithmStudy.sort2;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

    public void splitFunc(ArrayList<Integer> array) {

        if(array.size() <= 1) {
            return;
        }

        int pivot = array.get(0);

        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();

        for(int i = 1; i < array.size(); i++) {
            if(array.get(i) > pivot) {
                rightArr.add(array.get(i));
            } else {
                leftArr.add(array.get(i));
            }
        }

        System.out.println(leftArr);
        System.out.println(pivot);
        System.out.println(rightArr);

        ArrayList<Integer> mergedArr = new ArrayList<Integer>();

        mergedArr.addAll(leftArr);
        mergedArr.addAll(Arrays.asList(pivot));
        mergedArr.addAll(rightArr);

        System.out.println(mergedArr);
    }


    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(4,1,2,5,7));

        QuickSort test = new QuickSort();

        test.splitFunc(array);

    }
}
