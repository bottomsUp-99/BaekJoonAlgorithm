import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2312
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            int testNum = Integer.parseInt(br.readLine());
            for (int j = 2; j <= testNum; j++) {
                int count = 0;
                while (testNum % j == 0) {
                    testNum /= j;
                    count++;
                }
                if (count != 0) {
                    sb.append(j).append(" ").append(count).append("\n");
                }
            }
            System.out.print(sb.toString());
        }
    }
}