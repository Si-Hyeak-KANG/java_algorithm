package argorithmStudy.sort2;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    /*
    // for 문을 이용하여 만든 split
    public void split(ArrayList<Integer> array) {

        ArrayList<Integer> firstArray = new ArrayList<>();
        ArrayList<Integer> secondArray = new ArrayList<>();

        for(int i = 0; i < array.size() /2 ; i++) {

            firstArray.add(array.get(i));
        }

        for(int i = array.size() /2 ; i < array.size(); i++ ) {

            secondArray.add(array.get(i));
        }

        System.out.println(firstArray);
        System.out.println(secondArray);
    }
    */


    //ArrayList의 subList 활용
    public ArrayList<Integer> splitFunc(ArrayList<Integer> array) {

        // 배열의 크기가 1 이하면 나눌 것이 없음
        if(array.size() <= 1) {
            return array;
        }

        int medium = array.size() / 2;

        ArrayList<Integer> leftArr = new ArrayList<>(array.subList(0, medium)); // array 의 인덱스 0번부터 medium -1 까지를 배열로 만듦
        ArrayList<Integer> rightArr = new ArrayList<>(array.subList(medium, array.size())); // array 의 인덱스 medium 부터 array.size() -1 까지를 배열로 만듦

        return mergeFunc(leftArr, rightArr);
    }

    /**
     * merge 함수
     * @return 정렬된 배열을 반환
     */
    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftArr, ArrayList<Integer> rightArr) {

        ArrayList<Integer> mergedList = new ArrayList<>();

        int leftPoint = 0;
        int rightPoint = 0;

        // CASE 1 : left / right 둘 다 있을 때

        // CASE 2 : right 데이터가 없을 때

        // CASE 3 : left 데이터가 없을 때

        return null;
    }

    public static void main(String[] args) {

        MergeSort test = new MergeSort();
        
    }
}
