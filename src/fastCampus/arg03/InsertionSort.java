package fastCampus.arg03;

// 삽입 정렬
// 수의 예 80, 50, 70, 10, 60, 20, 40, 30
public class InsertionSort {

    // 함수 형성
    public static void insertionSort(int[] arr, int count) {

        int i = 0, j = 0; // i는 반복 횟수, j는 비교될 수의 위치(정렬된 수 중 하나)
        int temp = 0; // temp는 우리가 위치를 옮겨줄 수; 즉, 비교할 수 (정렬되지 않은 수)

        for(i = 1; i < count; i++) {
            temp = arr[i]; // 배열의 인덱스는 0부터 시작, 처음 시작하는 수와 다음 수부터 비교를 시작하한다. 따라서 i는 1
            j = i;
            while((j > 0) && arr[j-1] > temp) { // j가 양수이고, 비교할 수가 비교될 수(앞에 수) 보다 작을 때
                arr[j] = arr[j-1]; // 비교될 수가 더 크므로, 비교할 수의 자리로 이동(대입)
                j = j - 1; // 정렬된 수들 중 위치를 찾아야 하기 때문에 앞 수들도 계속 비교
            }              // 만약 j가 0 이하거나 (앞에 비교할 수가 없거나), 앞에 수보다 클 경우에 더 이상 반복을 멈춘다.
            arr[j] = temp; // temp의 정렬될 위치에 대입

            System.out.println("반복 -" + i); // 반복 횟수를 쉽게 확인하기 위해 선언
            printSort(arr, count); // printSort 함수를 통해서 재정렬되는 과정을 표시
        }

    }

    // 출력 함수 형성
    public static void printSort(int value[], int count)  // value[] 는 우리가 정렬할 배열, count는 배열의 크기
    {
        int i = 0; // 반복횟수
        for(i = 0; i < count; i++) {
            System.out.print(value[i] + "\t"); // \t는 tab과 동일
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {80, 50, 70, 10, 60, 20, 40, 30 };

        insertionSort(arr, 8);
    }

}
