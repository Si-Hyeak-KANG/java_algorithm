package dontforget;

import java.util.Arrays;

// 원본 배열에서 짝수만 복사하여 출력
// 짝수가 없거나, 빈배열 입력시 빈배열 리턴
public class ArrEvenNumCopy {

    /**
     * CASE #1 : copyOf 사용
     */
    public int[] copyFunc(int[] arr) {

        int[] result = new int[]{};

        if(arr.length == 0) return result;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0) {

                result = Arrays.copyOf(result,result.length+1);
                result[result.length-1] = arr[i];
            }
        }

        if(result.length == 0) {
            return new int[]{};
        }

        return result;
    }

    /**
     * CASE #2 : copyOf 사용 x
     */
    public int[] func(int[] arr) {

        int count = 0;


        if(arr.length == 0) {
            return new int[]{};
        }

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0) {

                count++;
            }
        }

        int[] result = new int[count];
        count = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0) {
                result[count] = arr[i];
                count++;
            }
        }


        return result;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,5,8,9,10};
        int[] oddArr = {1,3,5,7};
        int[] nullArr = new int[0];

        ArrEvenNumCopy test = new ArrEvenNumCopy();

        System.out.println("CASE #1");
        System.out.println(Arrays.toString(test.copyFunc(arr))); // [2, 8, 10]
        System.out.println(Arrays.toString(test.copyFunc(oddArr))); // []
        System.out.println(Arrays.toString(test.copyFunc(nullArr))); // []
        System.out.println();
        System.out.println("CASE #2");
        System.out.println(Arrays.toString(test.func(arr))); // [2, 8, 10]
        System.out.println(Arrays.toString(test.func(oddArr))); // []
        System.out.println(Arrays.toString(test.func(nullArr))); // []

    }
}
