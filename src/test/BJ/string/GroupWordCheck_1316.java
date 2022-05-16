package test.BJ.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordCheck_1316 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 단어 N개
        int count = 0; // 그룹 문자 개수

        for(int i = 0; i < N; i++) {

            boolean group = true; //  우선 모든 문자를 그룹 문자로 가정

            String str = br.readLine(); // 문자 입력

            for(int j = 0; j < str.length(); j++) {

                // 현재 인덱스와 다음 인덱스 비교
                for(int nextIndex = j+1; nextIndex < str.length(); nextIndex++) {

                    if (str.charAt(j) == str.charAt(nextIndex)) {

                        if (nextIndex - j > 1) {
                            group = false;
                        }
                        break;
                    }

                }

                if(group == false) {
                    break;
                }
            }

            if(group == true) {

                count++;
            }
        }

        System.out.println(count);
    }

}
