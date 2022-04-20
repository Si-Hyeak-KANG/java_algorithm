package argorithmStudy.sort2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort2 {

    /**
     * split & merge function
     * @return 모두 분리된 배열을 merge
     */
    public ArrayList<Integer> splitMergeFunc(ArrayList<Integer> array) {

        if(array.size() <= 1) {
            return array;
        }

        int medium = array.size() / 2;

        ArrayList<Integer> leftArr;
        ArrayList<Integer> rightArr;

        leftArr = this.splitMergeFunc(new ArrayList<Integer>(array.subList(0,medium)));
        rightArr = this.splitMergeFunc(new ArrayList<Integer>(array.subList(medium, array.size())));

        return mergeFunc(leftArr, rightArr);
    }

    /**
     * merge function
     * @return 결합하며 정렬된 배열 반환
     */
    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftArr , ArrayList<Integer> rightArr) {

        ArrayList<Integer> mergedList = new ArrayList<>();

        int leftPoint = 0;
        int rightPoint = 0;

        // CASE 1 : left 와 right 둘다 있을 때
        while (leftArr.size() > leftPoint && rightArr.size() > rightPoint) {

            if(leftArr.get(leftPoint) > rightArr.get(rightPoint)) {
                mergedList.add(rightArr.get(rightPoint));
                rightPoint++;
            } else {
                mergedList.add(leftArr.get(leftPoint));
                leftPoint++;
            }
        }

        // CASE 2 : left 만 있을 때
        while (leftArr.size() > leftPoint) {

            mergedList.add(leftArr.get(leftPoint));
            leftPoint++;
        }

        // CASE 3 : right 만 있을 때
        while (rightArr.size() > rightPoint) {

            mergedList.add(rightArr.get(rightPoint));
            rightPoint++;
        }

        return mergedList;
    }

    public static void main(String[] args) {

        MergeSort2 test = new MergeSort2();

        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(3,5,6,7,2,1)); // [3,5,6,7,2,1]

        /*
        for(int i =0; i<50; i++) {
            array.add((int)(Math.random()*100));
        }
         */

        System.out.println(test.splitMergeFunc(array)); // 1, 2, 3, 5, 6, 7

    }

}
