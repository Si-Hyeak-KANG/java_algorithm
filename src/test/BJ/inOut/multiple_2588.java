package test.BJ.inOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class multiple_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int multi = A*B;
        while(B != 0) {
            int x = B % 10;
            System.out.println(A*x);
            B /= 10;
        }

        System.out.println(multi);


/*
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String s = scanner.next();
        int f = Integer.parseInt(s);
        int a = Integer.parseInt(s.split("")[0]);
        int b = Integer.parseInt(s.split("")[1]);
        int c = Integer.parseInt(s.split("")[2]);

        System.out.println(i*c);
        System.out.println(i*b);
        System.out.println(i*a);
        System.out.println(i*f);
*/

    }


}
