package test.BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordStudy_1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];  // 알파뱃 개수만큼 배열 생성
        String s = br.readLine().toUpperCase(); // 입력받은 단어 모두 대문자화

        char ch = '?';
        int max = -1;

        for(int i =0;i<s.length();i++) {
            ch = s.charAt(i);
            arr[ch-'A'] += 1;
        }

        for(int i=0; i< arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 'A');
            } else if(arr[i]==max) {
                ch ='?';
            }
        }

        System.out.println(ch);
    }
}
