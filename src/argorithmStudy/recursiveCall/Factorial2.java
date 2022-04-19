package argorithmStudy.recursiveCall;

import java.util.ArrayList;

public class Factorial2 {

    public int factorialFunc(ArrayList<Integer> dataList) {

        if(dataList.size() <= 0) {
            return 0;
        }

        return dataList.get(0) + this.factorialFunc(new ArrayList<Integer>(dataList.subList(1, dataList.size())));
    }

    public static void main(String[] args) {

        ArrayList<Integer> dataList = new ArrayList<>();

        for(int i = 0; i < 10; i++) {

            dataList.add(i);

        }

        Factorial2 test = new Factorial2();

        System.out.println(test.factorialFunc(dataList));

    }
}
