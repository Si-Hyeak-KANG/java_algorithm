import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestPoint_9498 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int point = Integer.parseInt(br.readLine());

        if (90 <= point && point <= 100) {
            System.out.println("A");
        }else if (80 <= point && point < 90) {
            System.out.println("B");
        }else if (70 <= point && point < 80) {
            System.out.println("C");
        }else if (60 <= point && point < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


    }
}
