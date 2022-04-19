package argorithmStudy.recursiveCall;

public class Test1 {

    // 정수 n이 주어졌을 때 n을 1,2,3의 합으로 나타낼 수 있는 방법의 수 구하기

    public int f(int n) {

        if(n == 1) {
            return 1;
        } else if(n == 2) {
            return 2;
        } else if(n == 3) {
            return 4;
        }

        return this.f(n-1) + this.f(n-2) + this.f(n-3);
    }

    public static void main(String[] args) {

        Test1 test = new Test1();

        System.out.println(test.f(5));
    }
}
