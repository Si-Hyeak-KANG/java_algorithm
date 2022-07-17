package test.BJ.priorityqueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class SayForMiddle_1655 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        int testCase = Integer.parseInt(br.readLine());
        List<Integer> myLinkedList = new LinkedList<>();

        for(int i = 0; i < testCase; i++) {

            String input = br.readLine();

            if(input.charAt(0) == '-') {
                
            }
            //myLinkedList.add(input);
            int listSize = myLinkedList.size();
            int result = myLinkedList.get(0);

            if(listSize > 1) {
                Collections.sort(myLinkedList);

                if(listSize % 2 == 0) {


                } else {
                    result = myLinkedList.get(listSize/2);
                }
            }

            sb.append(result + '\n');
        }


    }
}
