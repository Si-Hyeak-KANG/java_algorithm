package test.BJ.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SortNum3_10989_2 {

    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {

        ArrayList<Integer> result = new ArrayList<>();

        if(arr.size() <= 1) {
            return arr;
        }

        int pivot = arr.get(0);

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for(int i = 1; i < arr.size(); i++) {

            if(arr.get(i) < pivot) {
                left.add(arr.get(i));
            } else {
                right.add(arr.get(i));
            }
        }

        result.addAll(quickSort(left));
        result.addAll(Arrays.asList(pivot));
        result.addAll(quickSort(right));

        return result;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        // 테스트 수 N 만큼의 크기를 가진 배열 생성
        // 배열에 입력 받은 값들 추가
        for (int i = 0; i < N; i++) {
            int data = Integer.parseInt(br.readLine());
            arr.add(data);
        }

        ArrayList<Integer> result = quickSort(arr);

        for (Integer integer : result) {
            System.out.println(integer);
        }

    }
}
