package argorithmStudy.recursiveCall;

public class Factorial {

    public int factorialFun(int n) {

        /*
        if(n > 1) {
            return n * this.factorialFun(n-1);
        } else {
            return 1;
        }

         */

        if(n < 1) {
            return 1;
        }

        return n * this.factorialFun(n-1);
    }

    public static void main(String[] args) {

        Factorial fObject = new Factorial();
        System.out.println(fObject.factorialFun(5));
    }

}
