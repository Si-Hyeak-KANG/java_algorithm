package test.BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sugarDelivery_2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 입력받을 설탕의 무게
        int result = 0; // 필요한 주머니 개수

        while(N>0) {

            if(N % 5 == 0) { // 5의 배수일 경우
                N -= 5;
                result++;
            } else if(N==4 || N==7){
                result = -1;
                break;
            } else {
                N -= 3;
                result++;
            }
        }
        System.out.println(result);
    }
}
