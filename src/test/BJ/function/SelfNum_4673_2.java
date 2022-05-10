package test.BJ.function;

public class SelfNum_4673_2 {

    public static int d(int n) {
        int sum = n;
        while(n>0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        boolean[] check = new boolean[10001];

        for(int i=1; i<10001; i++) {

            int sum = d(i);

            if(sum<10001) {

                check[sum] = true;
            }
        }

        for(int i=1; i<10001;i++) {

            if(!check[i]) {
                System.out.println(i);
            }
        }
    }


}
    // d(75) = 75 + 7 + 5 = 87;
    // d(n)을 n과 n의 각 자리수를 더하는 함수
    // 양의 정수 n, n, d(n), d(d(n)), d(d(d(n)))...
    // n 은 d(n)의 생성자
    // 생성자가 없는 숫자를 셀프 넘버

    // 100 이하 셀프넘버 , 1, 3, 5, 7, 9, 20, 31, 42 ,53,64, 86, 97

    // 91 + 9 + 1 == 101, 100 + 1 + 0 + 0 == 101;



