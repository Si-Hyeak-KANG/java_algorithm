package test.BJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FindAlphabet_10809 {

/*    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        for(int i=0; i<arr.length;i++) {
            arr[i]  = -1;
        }

        String word = br.readLine();

        for(int i=0; i<word.length();i++) {
            char ch = word.charAt(i); // 문자열의 문자 추출

            if(arr[ch-'a']==-1) {
                arr[ch - 'a']=i;
            }
        }

        for(int val:arr) {
            System.out.print(val + " ");
        }

    }*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        for (char c = 'a' ; c <= 'z' ; c++)
            System.out.print(input.indexOf(c) + " ");
    }
}
