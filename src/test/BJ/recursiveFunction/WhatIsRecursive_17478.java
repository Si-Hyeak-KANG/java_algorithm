package test.BJ.recursiveFunction;

import java.io.*;

/**
 * Point
 * 1) 재귀 함수의 반환 타입은 void
 * 2) printf 사용
 * 3) 가장 처음 __ 없이 시작되는 문자열도 재귀함수에 포함되어야 한다.(안그럼 오답)
 *
 * 시간 188ms
 */
public class WhatIsRecursive_17478 {

    // 재귀함수를 반복할 때마다 '____'(under bar)를 더해줄건데
    // 함수를 실행할 때마다 값이 초기화되면 안되기 때문에 전역변수에 static으로 선언
    static String spec = "" ;

    static void f(int N) {

        String spec2 = spec;

        System.out.printf("%s\"재귀함수가 뭔가요?\"\n",spec);

        if(N == 0) {

            System.out.printf("%s\"재귀함수는 자기 자신을 호출하는 함수라네\"\n",spec);
            System.out.printf("%s라고 답변하였지.\n",spec);
            return;

        }

        // 이 문장 때문에 printf 쓴 것
        System.out.printf("%s\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n" +
                "%s마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n" +
                "%s그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n",spec,spec,spec);

        // 함수를 들어가기 전 spec 에 under bar 추가 -> 점점 더해주는 방식
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
