package argorithmStudy.sort2;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort2 {

    public ArrayList<Integer> sort(ArrayList<Integer> array) {

        ArrayList<Integer> mergedList = new ArrayList<Integer>();

        if(array.size() <= 1) {
            return array;
        }

        int pivot = array.get(0);

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        for(int i = 1; i < array.size(); i++) {

            if(array.get(i) < pivot) {
                leftArr.add(array.get(i));
            } else {
                rightArr.add(array.get(i));
            }
        }

        mergedList.addAll(this.sort(leftArr));
        mergedList.addAll(Arrays.asList(pivot));
        mergedList.addAll(this.sort(rightArr));

        return mergedList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(4,2,5,1,3,7));

        QuickSort2 test = new QuickSort2();

        System.out.println(test.sort(array));
    }
}
