package argorithmStudy.sort2;

import java.util.ArrayList;

public class MergeSort {

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

    //ArrayList의 subList 활용
    public void split2(ArrayList<Integer> array) {

        // 배열의 크기가 1 이하면 나눌 것이 없음
        if(array.size() <= 1) {
            return; // return 으로 메서드 종료
        }

        int medium = array.size() / 2;

        ArrayList<Integer> leftArr = new ArrayList<>(array.subList(0, medium)); // array 의 인덱스 0번부터 medium -1 까지를 배열로 만듦
        ArrayList<Integer> rightArr = new ArrayList<>(array.subList(medium, array.size())); // array 의 인덱스 medium 부터 array.size() -1 까지를 배열로 만듦

        System.out.println(leftArr);
        System.out.println(rightArr);

    }

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        array.add(2);
        array.add(3);
        array.add(5);
        array.add(6);
        array.add(1);
        array.add(4);
        array.add(7);

        MergeSort test = new MergeSort();

        test.split2(array);

    }
}
