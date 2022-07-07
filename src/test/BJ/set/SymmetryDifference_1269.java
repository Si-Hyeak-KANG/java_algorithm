package test.BJ.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

// A-B , B-A의 개수 합
public class SymmetryDifference_1269 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int numOfA = Integer.parseInt(st.nextToken());
        int numOfB = Integer.parseInt(st.nextToken());

        HashSet<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < numOfA; i++) {

            set.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < numOfB; i++) {

            int input = Integer.parseInt(st.nextToken());

            if(set.contains(input)){
                set.remove(input);
            } else {
                set.add(input);
            }
        }

        System.out.println(set.size());

    }
}
