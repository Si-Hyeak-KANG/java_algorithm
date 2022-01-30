package test.BJ;

import java.util.Scanner;

//서로 다른 나머지의 개수 구하기
public class Remainder_3052 {
    public static void main(String[] args) {

        // Scanner, 정규식 풀이 방법
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        boolean bl; // 나머지가 동일한지 판단
        int count = 0; //서로 다른 나머지 갯수

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt() % 42;
        }

        for(int i=0;i<arr.length;i++) {
            bl = false; // 기본값 false

            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]==arr[i]) {
                    bl = true; // 두 수를 비교했을 때 동일할 시 no count
                    break;
                }
            }
            if(bl==false) {
                count++;
            }
        }

        System.out.println(count);
        // BufferedReader 이용 풀이
        // BufferedReader, HashSet 이용 풀이 방법
    }
}
