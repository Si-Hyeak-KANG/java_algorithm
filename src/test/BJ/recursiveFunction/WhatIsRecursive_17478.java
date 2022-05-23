package test.BJ.recursiveFunction;

import java.io.*;

public class WhatIsRecursive_17478 {

    static String spec = "" ;

    static void f(int N) {

        String spec2 = spec;

        System.out.printf("%s\"재귀함수가 뭔가요?\"\n",spec);

        if(N == 0) {

            System.out.printf("%s\"재귀함수는 자기 자신을 호출하는 함수라네\"\n",spec);
            System.out.printf("%s라고 답변하였지.\n",spec);
            return;

        }

        System.out.printf("%s\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n" +
                "%s마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n" +
                "%s그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n",spec,spec,spec);

        spec += "____";

        f(N-1);

        System.out.printf("%s라고 답변하였지.\n",spec2);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Num = Integer.parseInt(br.readLine());

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        f(Num);
    }
}
