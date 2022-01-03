package test;

public class ArrayTest {

    public static void main(String[] args) {

        int[] num1 = new int[5];
        int num1_length = num1.length;
        System.out.println("num1_length = "+ num1_length);
        for (int i: num1) {
            int arr = num1[i];
            System.out.println(arr); // 0 0 0 0 0 출력 -> 배열 공간을 만든 것
        }
        int[] num2 = {1,2,3};
        int num2_length = num2.length;
        System.out.println("num2_length = " + num2_length);

        int[] num3 = new int[] {1,2,3,4,5};
        int num3_length = num3.length;
        System.out.println("num3_length = " + num3_length);

        int[] num4 = {1,2,3,4,5};
        int num4_length = num4.length;
        System.out.println("num4_length = " + num4_length);

        int[] arr = new int[10]; //크기가 10
        int total = 0;

        for(int i =0, num=1; i < arr.length; i++) {
            arr[i] = num++;
        }

        for( int num : arr) {

            total += num;
        }

        System.out.println(total);
    }
}
