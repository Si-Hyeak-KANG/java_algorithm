package test.BJ;

public class SelfNum_4673 {

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
        // 길이가 10001개인 boolean 배열 생성
        // 기본값 false (false, false, flase,,,)
        for(int i=1; i<10001; i++) {
            int sum = d(i); // 1~10000 까지 값 출력
            if(sum<10001) { // 10000 이내의 값을 구하기 때문에 합친 값이 10000 이하면 된다.
                check[sum] = true; // sum으로 출력된 index 모두 true
            }
        }
        for(int i=1; i<10001;i++) {
            if(!check[i]) { // 해당 인덴스의 boolean이 false이면 i 출력
                System.out.println(i);
            }
        }
    }
}
