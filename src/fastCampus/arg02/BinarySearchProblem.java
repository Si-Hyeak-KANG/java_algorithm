package fastCampus.arg02;

public class BinarySearchProblem {

    public static void main(String[] args) {

        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

        int target = 83; // 찾아야할 숫자
        //int target = 88;

        int left = 0; // 왼쪽의 위치 지정
        int right = numbers.length-1; // 오른쪽 위치 지정 -> numbers 배열의 크기는 10이고, 0부터 시작하므로 위치는 9 따라서 10-1
        int mid = (left + right)/2; //중간값 위치 지정

        int temp = numbers[mid]; // 임의의 비교값 지정, 정렬된 수들이므로 가운데값으로 지정/mid값이 4.5이므로 numbers[4]에 해당하는 값
        boolean find = false; // 찾았는지에 대한 여부, 지역변수이므로 값지정/ 멤버변수일 경우에는 default false

        while(left <= right) { // 만약 left가 right보다 커지면 찾는 값 없음

            if(target == temp) { //수를 찾았을 경우
                find = true;
                break; // while 문을 빠져나감
            } else if(target < temp) { // 찾는 값이 임의값보다 작을 경우(혹은 왼쪽에 있을 경우)
                right = mid-1;      // 만약 임의값보다 작을 경우에는 임의값 안으로 찾으면 된다. 경우의 수가 절반으로 감소
            } else { // 찾는 값이 임의값보다 클 경우(혹은 오른쪽에 있을 경우)
                left = mid+1;
            }
            mid = (left+right)/2; // left와 right가 재조정되므로 mid도 재조정
            temp = numbers[mid];
        }

        if(find == true) {
            mid++; // 위치이므로 1증가 시켜서 출력
            System.out.println("찾는 수는" + mid + "번째 있습니다.");
        } else
            System.out.println("찾는 수가 없습니다.");
    }
}
