package fastCampus.arg01;

public class MinMaxProblem {

    public static void main(String[] args) {

        int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int min = numbers[0]; // 초기값 설정 : 배열 numbers 안에서 0번째
        int max = numbers[0]; // 초기값 설정 : 배열 numbers 안에서 0번째

        int minPos = 1; // 최솟값 위치 변수
        int maxPos = 1; // 최댓값 위치 변수

        for(int i = 1; i<numbers.length; i++) {

            if(min > numbers[i]) {
                min = numbers[i];
                minPos=+i;
            }

            if(max < numbers[i]) {
                max = numbers[i];
                maxPos=+1;
            }
        }

        System.out.println("최솟값은 " + minPos + "번째의 " + min + "입니다.");
        System.out.println("최댓값은 " + maxPos + "번재의 " + max + "입니다.");

    }
}
