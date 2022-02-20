package test.BJ.array;

import java.util.Scanner;

//Scanner 풀이 방법
public class Average_4344 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt(); // test 횟수 입력

        for(int i=0;i<testCase;i++) {
            int n = sc.nextInt(); // 학생 수
            int[] arr = new int[n]; // 한 테스트 안에 학생 수 만큼에 성적 배열
            int sum=0; // 성적 누적 합

            for(int j=0;j<n;j++) {
                int val=sc.nextInt(); // 성적
                arr[j]=val;
                sum += val;
            }

            double mean = sum/n; //평균
            double count=0;

            for(int j=0; j<n; j++) {
                if(arr[j]>mean) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/n)*100);
        }
    }
}
