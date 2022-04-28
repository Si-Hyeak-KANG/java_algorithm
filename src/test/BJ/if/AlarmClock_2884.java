import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlarmClock_2884 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int H = Integer.parseInt(st.nextToken()); // 입력받을 시간
        int M = Integer.parseInt(st.nextToken()); // 입력받을 분

        M = M - 45;

        int returnH = H; // 출력할 시간
        int returnM = M; // 출력할 분

        if (M < 0) {
            if(H==0){
                H = 24;
            }
            returnH = H - 1;
            returnM = 60 + M;
        }

        System.out.println(returnH + " " + returnM);

    }
}
