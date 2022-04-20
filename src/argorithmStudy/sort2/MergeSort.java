package argorithmStudy.sort2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MergeSort {

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

        test.split(array);

    }
}
