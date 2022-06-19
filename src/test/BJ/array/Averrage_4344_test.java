package test.BJ.array;

import java.util.Scanner;

public class Averrage_4344_test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i<num; i++){  //num만큼 반복할 것(테스트케이스)
            int student = sc.nextInt(); //테스트케이스 별 학생수 입력받기
            int[] arr = new int[student];  //학생 수만큼의 크기를 갖는 배열선언

            double total = 0;  //학생들의 성적을 담을 변수 생성

            for(int x=0; x<student; x++){   //테스트케이스의 학생 수 만큼 반복
                int score = sc.nextInt(); //점수 입력 받기
                arr[x] = score;   //점수를 배열에 집어넣기
                total = total + score;
            }

            double overscore = (total / student);  //점수의 평균 값 구하기
            int overstudent = 0; //평균을 넘는 학생 수 세기
            //여기서 overstudent를 int로 하면 오류나는 이유 궁금

            for(int j=0; j<student; j++){
                if(arr[j] > overscore){   //배열에 있는 점수 중에 평균을 넘는 점수가 있다면
                    overstudent++;      //학생수 카운트하기
                }
            }
            System.out.printf("%f%%\n",((double) overstudent/student) * 100);    //전체 학생 수에서 평균 점수를 넘는 학생을 나누고 곱하기 백! -> 소수 셋째 자리까지 표현
        }

    }
}
